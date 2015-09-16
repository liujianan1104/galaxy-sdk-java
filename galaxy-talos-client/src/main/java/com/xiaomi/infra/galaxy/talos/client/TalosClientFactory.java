/**
 * Copyright 2015, Xiaomi.
 * All rights reserved.
 * Author: yongxing@xiaomi.com
 */

package com.xiaomi.infra.galaxy.talos.client;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xiaomi.infra.galaxy.rpc.client.AutoRetryClient;
import com.xiaomi.infra.galaxy.rpc.client.ThreadSafeClient;
import com.xiaomi.infra.galaxy.rpc.thrift.Credential;
import com.xiaomi.infra.galaxy.rpc.util.clock.AdjustableClock;
import com.xiaomi.infra.galaxy.talos.common.Constants;
import com.xiaomi.infra.galaxy.talos.thrift.MessageService;
import com.xiaomi.infra.galaxy.talos.thrift.QuotaService;
import com.xiaomi.infra.galaxy.talos.thrift.TopicService;
import com.xiaomi.infra.galaxy.talos.thrift.Version;

public class TalosClientFactory {
  private static final Logger LOG = LoggerFactory.getLogger(TalosClientFactory.class);
  private static final String USER_AGENT_HEADER = "User-Agent";
  private static final Version VERSION = new Version();

  private Credential credential;
  private Map<String, String> customHeaders;
  private HttpClient httpClient;
  private AdjustableClock clock;

  private static HttpClient generateHttpClient() {
    return generateHttpClient(1, 1);
  }

  public static HttpClient generateHttpClient(final int maxTotalConnections,
      final int maxTotalConnectionsPerRoute) {
    return generateHttpClient(maxTotalConnections, maxTotalConnectionsPerRoute,
        Constants.TALOS_CLIENT_CONN_TIMEOUT_MILLI_SECS);
  }

  public static HttpClient generateHttpClient(final int maxTotalConnections,
      final int maxTotalConnectionsPerRoute, int connTimeout) {
    SchemeRegistry schemeRegistry = new SchemeRegistry();
    schemeRegistry.register(new Scheme("http", 80, PlainSocketFactory.getSocketFactory()));
    schemeRegistry.register(new Scheme("https", 443, SSLSocketFactory.getSocketFactory()));

    PoolingClientConnectionManager conMgr = new PoolingClientConnectionManager(schemeRegistry);
    conMgr.setMaxTotal(maxTotalConnections);
    conMgr.setDefaultMaxPerRoute(maxTotalConnectionsPerRoute);

    HttpParams httpParams = new BasicHttpParams();
    HttpConnectionParams.setConnectionTimeout(httpParams, connTimeout);
    return new DefaultHttpClient(conMgr, httpParams);
  }

  public TalosClientFactory() {
    this.credential = null;
    this.customHeaders = null;
    this.httpClient = generateHttpClient();
    this.clock = new AdjustableClock();
  }

  public Credential getCredential() {
    return credential;
  }

  public TalosClientFactory setCredential(Credential credential) {
    this.credential = credential;
    return this;
  }

  public Map<String, String> getCustomHeaders() {
    return customHeaders;
  }

  public TalosClientFactory setCustomHeaders(Map<String, String> customHeaders) {
    this.customHeaders = customHeaders;
    return this;
  }

  public HttpClient getHttpClient() {
    return httpClient;
  }

  public TalosClientFactory setHttpClient(HttpClient httpClient) {
    this.httpClient = httpClient;
    return this;
  }

  public AdjustableClock getClock() {
    return clock;
  }

  public TalosClientFactory setClock(AdjustableClock clock) {
    this.clock = clock;
    return this;
  }

  public static Version getVersion() {
    return VERSION;
  }

  public TopicService.Iface newTopicClient() {
    if (credential == null) {
      throw new IllegalArgumentException("Credential is not set");
    }
    return newTopicClient(Constants.TALOS_SECURE_SERVICE_ENDPOINT);
  }

  public TopicService.Iface newTopicClient(String endpoint) {
    return newTopicClient(endpoint, Constants.TALOS_CLIENT_TIMEOUT_MILLI_SECS,
        Constants.TALOS_CLIENT_CONN_TIMEOUT_MILLI_SECS);
  }

  public TopicService.Iface newTopicClient(String endpoint, int socketTimeout,
      int connTimeout) {
    return createClient(TopicService.Iface.class, TopicService.Client.class,
        endpoint + Constants.TALOS_TOPIC_SERVICE_PATH, socketTimeout, connTimeout,
        false, Constants.TALOS_CLIENT_MAX_RETRY);
  }

  public TopicService.Iface newTopicClient(String endpoint, boolean isRetry,
      int maxRetry) {
    return createClient(TopicService.Iface.class, TopicService.Client.class,
        endpoint + Constants.TALOS_TOPIC_SERVICE_PATH,
        Constants.TALOS_CLIENT_TIMEOUT_MILLI_SECS,
        Constants.TALOS_CLIENT_CONN_TIMEOUT_MILLI_SECS, isRetry, maxRetry);
  }

  public TopicService.Iface newTopicClient(String endpoint, int socketTimeout,
      int connTimeout, boolean isRetry, int maxRetry) {
    return createClient(TopicService.Iface.class, TopicService.Client.class,
        endpoint + Constants.TALOS_TOPIC_SERVICE_PATH,
        socketTimeout, connTimeout, isRetry, maxRetry);
  }

  public MessageService.Iface newMessageClient() {
    if (credential == null) {
      throw new IllegalArgumentException("Credential is not set");
    }
    return newMessageClient(Constants.TALOS_SECURE_SERVICE_ENDPOINT);
  }

  public MessageService.Iface newMessageClient(String endpoint) {
    return newMessageClient(endpoint, Constants.TALOS_CLIENT_TIMEOUT_MILLI_SECS,
        Constants.TALOS_CLIENT_CONN_TIMEOUT_MILLI_SECS);
  }

  public MessageService.Iface newMessageClient(String endpoint, int socketTimeout,
      int connTimeout) {
    return createClient(MessageService.Iface.class, MessageService.Client.class,
        endpoint + Constants.TALOS_MESSAGE_SERVICE_PATH, socketTimeout,
        connTimeout, false, Constants.TALOS_CLIENT_MAX_RETRY);
  }

  public MessageService.Iface newMessageClient(String endpoint, boolean isRetry,
      int maxRetry) {
    return createClient(MessageService.Iface.class, MessageService.Client.class,
        endpoint + Constants.TALOS_MESSAGE_SERVICE_PATH,
        Constants.TALOS_CLIENT_TIMEOUT_MILLI_SECS,
        Constants.TALOS_CLIENT_CONN_TIMEOUT_MILLI_SECS, isRetry, maxRetry);
  }

  public MessageService.Iface newMessageClient(String endpoint, int socketTimeout,
      int connTimeout, boolean isRetry, int maxRetry) {
    return createClient(MessageService.Iface.class, MessageService.Client.class,
        endpoint + Constants.TALOS_MESSAGE_SERVICE_PATH, socketTimeout,
        connTimeout, isRetry, maxRetry);
  }

  public QuotaService.Iface newQuotaClient() {
    if (credential == null) {
      throw new IllegalArgumentException("Credential is not set");
    }
    return newQuotaClient(Constants.TALOS_SECURE_SERVICE_ENDPOINT);
  }

  public QuotaService.Iface newQuotaClient(String endpoint) {
    return newQuotaClient(endpoint, Constants.TALOS_CLIENT_TIMEOUT_MILLI_SECS,
        Constants.TALOS_CLIENT_CONN_TIMEOUT_MILLI_SECS);
  }

  public QuotaService.Iface newQuotaClient(String endpoint, int socketTimeout,
      int connTimeout) {
    return createClient(QuotaService.Iface.class, QuotaService.Client.class,
        endpoint + Constants.TALOS_QUOTA_SERVICE_PATH, socketTimeout,
        connTimeout, false, Constants.TALOS_CLIENT_MAX_RETRY);
  }

  public QuotaService.Iface newQuotaClient(String endpoint, boolean isRetry,
      int maxRetry) {
    return createClient(QuotaService.Iface.class, QuotaService.Client.class,
        endpoint + Constants.TALOS_QUOTA_SERVICE_PATH,
        Constants.TALOS_CLIENT_TIMEOUT_MILLI_SECS,
        Constants.TALOS_CLIENT_CONN_TIMEOUT_MILLI_SECS, isRetry, maxRetry);
  }

  public QuotaService.Iface newQuotaClient(String endpoint, int socketTimeout,
      int connTimeout, boolean isRetry, int maxRetry) {
    return createClient(QuotaService.Iface.class, QuotaService.Client.class,
        endpoint + Constants.TALOS_QUOTA_SERVICE_PATH, socketTimeout,
        connTimeout, isRetry, maxRetry);
  }

  private <IFace, Impl> IFace createClient(Class<IFace> ifaceClass,
      Class<Impl> implClass, String url, int socketTimeout, int connTimeout,
      boolean isRetry, int maxRetry) {

    Map<String, String> headers = new HashMap<String, String>();
    headers.put(USER_AGENT_HEADER, createUserAgentHeader());
    if (customHeaders != null) {
      headers.putAll(customHeaders);
    }

    IFace client = ThreadSafeClient.getClient(httpClient, headers, credential,
        clock, ifaceClass, implClass, url, socketTimeout, connTimeout, false);
    client = AutoRetryClient.getAutoRetryClient(ifaceClass, client, isRetry,
        maxRetry);
    return TalosClient.getClient(ifaceClass, client);
  }

  private String createUserAgentHeader() {
    return String.format("Java-SDK/%d.%d.%d Java/%s",
        VERSION.major, VERSION.minor, VERSION.revision,
        System.getProperty("java.version"));
  }
}
