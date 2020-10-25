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

package com.google.api.services.domains.v1alpha2.model;

/**
 * Defines a host on your domain that is a DNS name server for your domain and/or other domains.
 * Glue records are a way of making the IP address of a name server known, even when it serves DNS
 * queries for its parent domain. For example, when `ns.example.com` is a name server for
 * `example.com`, the host `ns.example.com` must have a glue record to break the circular DNS
 * reference.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Domains API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GlueRecord extends com.google.api.client.json.GenericJson {

  /**
   * Required. Domain name of the host in Punycode format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hostName;

  /**
   * List of IPv4 addresses corresponding to this host in the standard decimal format (e.g.
   * `198.51.100.1`). At least one of `ipv4_address` and `ipv6_address` must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ipv4Addresses;

  /**
   * List of IPv6 addresses corresponding to this host in the standard hexadecimal format (e.g.
   * `2001:db8::`). At least one of `ipv4_address` and `ipv6_address` must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ipv6Addresses;

  /**
   * Required. Domain name of the host in Punycode format.
   * @return value or {@code null} for none
   */
  public java.lang.String getHostName() {
    return hostName;
  }

  /**
   * Required. Domain name of the host in Punycode format.
   * @param hostName hostName or {@code null} for none
   */
  public GlueRecord setHostName(java.lang.String hostName) {
    this.hostName = hostName;
    return this;
  }

  /**
   * List of IPv4 addresses corresponding to this host in the standard decimal format (e.g.
   * `198.51.100.1`). At least one of `ipv4_address` and `ipv6_address` must be set.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIpv4Addresses() {
    return ipv4Addresses;
  }

  /**
   * List of IPv4 addresses corresponding to this host in the standard decimal format (e.g.
   * `198.51.100.1`). At least one of `ipv4_address` and `ipv6_address` must be set.
   * @param ipv4Addresses ipv4Addresses or {@code null} for none
   */
  public GlueRecord setIpv4Addresses(java.util.List<java.lang.String> ipv4Addresses) {
    this.ipv4Addresses = ipv4Addresses;
    return this;
  }

  /**
   * List of IPv6 addresses corresponding to this host in the standard hexadecimal format (e.g.
   * `2001:db8::`). At least one of `ipv4_address` and `ipv6_address` must be set.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIpv6Addresses() {
    return ipv6Addresses;
  }

  /**
   * List of IPv6 addresses corresponding to this host in the standard hexadecimal format (e.g.
   * `2001:db8::`). At least one of `ipv4_address` and `ipv6_address` must be set.
   * @param ipv6Addresses ipv6Addresses or {@code null} for none
   */
  public GlueRecord setIpv6Addresses(java.util.List<java.lang.String> ipv6Addresses) {
    this.ipv6Addresses = ipv6Addresses;
    return this;
  }

  @Override
  public GlueRecord set(String fieldName, Object value) {
    return (GlueRecord) super.set(fieldName, value);
  }

  @Override
  public GlueRecord clone() {
    return (GlueRecord) super.clone();
  }

}