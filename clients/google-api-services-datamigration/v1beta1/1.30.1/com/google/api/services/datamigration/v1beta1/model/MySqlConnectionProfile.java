/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.datamigration.v1beta1.model;

/**
 * Specifies connection parameters required specifically for MySQL databases.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Database Migration API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MySqlConnectionProfile extends com.google.api.client.json.GenericJson {

  /**
   * If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of
   * the source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cloudSqlId;

  /**
   * Required. The IP or hostname of the source MySQL database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * Required. Input only. The password for the user that Database Migration Service will be using
   * to connect to the database. This field is not returned on request, and the value is encrypted
   * when stored in Database Migration Service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * Output only. Indicates If this connection profile password is stored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean passwordSet;

  /**
   * Required. The network port of the source MySQL database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * SSL configuration for the destination to connect to the source database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SslConfig ssl;

  /**
   * Required. The username that Database Migration Service will use to connect to the database. The
   * value is encrypted when stored in Database Migration Service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of
   * the source.
   * @return value or {@code null} for none
   */
  public java.lang.String getCloudSqlId() {
    return cloudSqlId;
  }

  /**
   * If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of
   * the source.
   * @param cloudSqlId cloudSqlId or {@code null} for none
   */
  public MySqlConnectionProfile setCloudSqlId(java.lang.String cloudSqlId) {
    this.cloudSqlId = cloudSqlId;
    return this;
  }

  /**
   * Required. The IP or hostname of the source MySQL database.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Required. The IP or hostname of the source MySQL database.
   * @param host host or {@code null} for none
   */
  public MySqlConnectionProfile setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * Required. Input only. The password for the user that Database Migration Service will be using
   * to connect to the database. This field is not returned on request, and the value is encrypted
   * when stored in Database Migration Service.
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * Required. Input only. The password for the user that Database Migration Service will be using
   * to connect to the database. This field is not returned on request, and the value is encrypted
   * when stored in Database Migration Service.
   * @param password password or {@code null} for none
   */
  public MySqlConnectionProfile setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * Output only. Indicates If this connection profile password is stored.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPasswordSet() {
    return passwordSet;
  }

  /**
   * Output only. Indicates If this connection profile password is stored.
   * @param passwordSet passwordSet or {@code null} for none
   */
  public MySqlConnectionProfile setPasswordSet(java.lang.Boolean passwordSet) {
    this.passwordSet = passwordSet;
    return this;
  }

  /**
   * Required. The network port of the source MySQL database.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Required. The network port of the source MySQL database.
   * @param port port or {@code null} for none
   */
  public MySqlConnectionProfile setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * SSL configuration for the destination to connect to the source database.
   * @return value or {@code null} for none
   */
  public SslConfig getSsl() {
    return ssl;
  }

  /**
   * SSL configuration for the destination to connect to the source database.
   * @param ssl ssl or {@code null} for none
   */
  public MySqlConnectionProfile setSsl(SslConfig ssl) {
    this.ssl = ssl;
    return this;
  }

  /**
   * Required. The username that Database Migration Service will use to connect to the database. The
   * value is encrypted when stored in Database Migration Service.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * Required. The username that Database Migration Service will use to connect to the database. The
   * value is encrypted when stored in Database Migration Service.
   * @param username username or {@code null} for none
   */
  public MySqlConnectionProfile setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public MySqlConnectionProfile set(String fieldName, Object value) {
    return (MySqlConnectionProfile) super.set(fieldName, value);
  }

  @Override
  public MySqlConnectionProfile clone() {
    return (MySqlConnectionProfile) super.clone();
  }

}