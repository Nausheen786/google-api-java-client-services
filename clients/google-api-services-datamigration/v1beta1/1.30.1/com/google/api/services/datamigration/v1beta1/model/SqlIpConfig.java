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
 * IP Management configuration.
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
public final class SqlIpConfig extends com.google.api.client.json.GenericJson {

  /**
   * The list of external networks that are allowed to connect to the instance using the IP. See
   * https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as 'slash' notation (e.g.
   * `192.168.100.0/24`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SqlAclEntry> authorizedNetworks;

  static {
    // hack to force ProGuard to consider SqlAclEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SqlAclEntry.class);
  }

  /**
   * Whether the instance should be assigned an IPv4 address or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableIpv4;

  /**
   * The resource link for the VPC network from which the Cloud SQL instance is accessible for
   * private IP. For example, `/projects/myProject/global/networks/default`. This setting can be
   * updated, but it cannot be removed after it is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privateNetwork;

  /**
   * Whether SSL connections over IP should be enforced or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requireSsl;

  /**
   * The list of external networks that are allowed to connect to the instance using the IP. See
   * https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as 'slash' notation (e.g.
   * `192.168.100.0/24`).
   * @return value or {@code null} for none
   */
  public java.util.List<SqlAclEntry> getAuthorizedNetworks() {
    return authorizedNetworks;
  }

  /**
   * The list of external networks that are allowed to connect to the instance using the IP. See
   * https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as 'slash' notation (e.g.
   * `192.168.100.0/24`).
   * @param authorizedNetworks authorizedNetworks or {@code null} for none
   */
  public SqlIpConfig setAuthorizedNetworks(java.util.List<SqlAclEntry> authorizedNetworks) {
    this.authorizedNetworks = authorizedNetworks;
    return this;
  }

  /**
   * Whether the instance should be assigned an IPv4 address or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableIpv4() {
    return enableIpv4;
  }

  /**
   * Whether the instance should be assigned an IPv4 address or not.
   * @param enableIpv4 enableIpv4 or {@code null} for none
   */
  public SqlIpConfig setEnableIpv4(java.lang.Boolean enableIpv4) {
    this.enableIpv4 = enableIpv4;
    return this;
  }

  /**
   * The resource link for the VPC network from which the Cloud SQL instance is accessible for
   * private IP. For example, `/projects/myProject/global/networks/default`. This setting can be
   * updated, but it cannot be removed after it is set.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivateNetwork() {
    return privateNetwork;
  }

  /**
   * The resource link for the VPC network from which the Cloud SQL instance is accessible for
   * private IP. For example, `/projects/myProject/global/networks/default`. This setting can be
   * updated, but it cannot be removed after it is set.
   * @param privateNetwork privateNetwork or {@code null} for none
   */
  public SqlIpConfig setPrivateNetwork(java.lang.String privateNetwork) {
    this.privateNetwork = privateNetwork;
    return this;
  }

  /**
   * Whether SSL connections over IP should be enforced or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequireSsl() {
    return requireSsl;
  }

  /**
   * Whether SSL connections over IP should be enforced or not.
   * @param requireSsl requireSsl or {@code null} for none
   */
  public SqlIpConfig setRequireSsl(java.lang.Boolean requireSsl) {
    this.requireSsl = requireSsl;
    return this;
  }

  @Override
  public SqlIpConfig set(String fieldName, Object value) {
    return (SqlIpConfig) super.set(fieldName, value);
  }

  @Override
  public SqlIpConfig clone() {
    return (SqlIpConfig) super.clone();
  }

}