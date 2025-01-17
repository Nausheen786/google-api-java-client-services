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

package com.google.api.services.compute.model;

/**
 * Represents an external VPN gateway.
 *
 * External VPN gateway is the on-premises VPN gateway(s) or another cloud provider's VPN gateway
 * that connects to your Google Cloud VPN gateway.
 *
 * To create a highly available VPN from Google Cloud Platform to your VPN gateway or another cloud
 * provider's VPN gateway, you must create a external VPN gateway resource with information about
 * the other gateway.
 *
 * For more information about using external VPN gateways, see  Creating an HA VPN gateway and
 * tunnel pair to a peer VPN. (== resource_for {$api_version}.externalVpnGateways ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExternalVpnGateway extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * List of interfaces for this external VPN gateway.
   *
   * If your peer-side gateway is an on-premises gateway and non-AWS cloud providers? gateway, at
   * most two interfaces can be provided for an external VPN gateway. If your peer side is an AWS
   * virtual private gateway, four interfaces should be provided for an external VPN gateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ExternalVpnGatewayInterface> interfaces;

  /**
   * [Output Only] Type of the resource. Always compute#externalVpnGateway for externalVpnGateways.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A fingerprint for the labels being applied to this ExternalVpnGateway, which is essentially a
   * hash of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an ExternalVpnGateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelFingerprint;

  /**
   * Labels for this resource. These can only be added or modified by the setLabels method. Each
   * label key/value pair must comply with RFC1035. Label values may be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Indicates the user-supplied redundancy type of this external VPN gateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String redundancyType;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public ExternalVpnGateway setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public ExternalVpnGateway setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public ExternalVpnGateway setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * List of interfaces for this external VPN gateway.
   *
   * If your peer-side gateway is an on-premises gateway and non-AWS cloud providers? gateway, at
   * most two interfaces can be provided for an external VPN gateway. If your peer side is an AWS
   * virtual private gateway, four interfaces should be provided for an external VPN gateway.
   * @return value or {@code null} for none
   */
  public java.util.List<ExternalVpnGatewayInterface> getInterfaces() {
    return interfaces;
  }

  /**
   * List of interfaces for this external VPN gateway.
   *
   * If your peer-side gateway is an on-premises gateway and non-AWS cloud providers? gateway, at
   * most two interfaces can be provided for an external VPN gateway. If your peer side is an AWS
   * virtual private gateway, four interfaces should be provided for an external VPN gateway.
   * @param interfaces interfaces or {@code null} for none
   */
  public ExternalVpnGateway setInterfaces(java.util.List<ExternalVpnGatewayInterface> interfaces) {
    this.interfaces = interfaces;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#externalVpnGateway for externalVpnGateways.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#externalVpnGateway for externalVpnGateways.
   * @param kind kind or {@code null} for none
   */
  public ExternalVpnGateway setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this ExternalVpnGateway, which is essentially a
   * hash of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an ExternalVpnGateway.
   * @see #decodeLabelFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelFingerprint() {
    return labelFingerprint;
  }

  /**
   * A fingerprint for the labels being applied to this ExternalVpnGateway, which is essentially a
   * hash of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an ExternalVpnGateway.
   * @see #getLabelFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeLabelFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(labelFingerprint);
  }

  /**
   * A fingerprint for the labels being applied to this ExternalVpnGateway, which is essentially a
   * hash of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an ExternalVpnGateway.
   * @see #encodeLabelFingerprint()
   * @param labelFingerprint labelFingerprint or {@code null} for none
   */
  public ExternalVpnGateway setLabelFingerprint(java.lang.String labelFingerprint) {
    this.labelFingerprint = labelFingerprint;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this ExternalVpnGateway, which is essentially a
   * hash of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an ExternalVpnGateway.
   * @see #setLabelFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ExternalVpnGateway encodeLabelFingerprint(byte[] labelFingerprint) {
    this.labelFingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(labelFingerprint);
    return this;
  }

  /**
   * Labels for this resource. These can only be added or modified by the setLabels method. Each
   * label key/value pair must comply with RFC1035. Label values may be empty.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels for this resource. These can only be added or modified by the setLabels method. Each
   * label key/value pair must comply with RFC1035. Label values may be empty.
   * @param labels labels or {@code null} for none
   */
  public ExternalVpnGateway setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public ExternalVpnGateway setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Indicates the user-supplied redundancy type of this external VPN gateway.
   * @return value or {@code null} for none
   */
  public java.lang.String getRedundancyType() {
    return redundancyType;
  }

  /**
   * Indicates the user-supplied redundancy type of this external VPN gateway.
   * @param redundancyType redundancyType or {@code null} for none
   */
  public ExternalVpnGateway setRedundancyType(java.lang.String redundancyType) {
    this.redundancyType = redundancyType;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public ExternalVpnGateway setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public ExternalVpnGateway set(String fieldName, Object value) {
    return (ExternalVpnGateway) super.set(fieldName, value);
  }

  @Override
  public ExternalVpnGateway clone() {
    return (ExternalVpnGateway) super.clone();
  }

}
