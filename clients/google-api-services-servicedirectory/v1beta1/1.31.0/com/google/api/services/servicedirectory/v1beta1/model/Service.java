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

package com.google.api.services.servicedirectory.v1beta1.model;

/**
 * An individual service. A service contains a name and optional metadata. A service must exist
 * before endpoints can be added to it.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Directory API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Service extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The timestamp when the service was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Endpoints associated with this service. Returned on LookupService.ResolveService.
   * Control plane clients should use RegistrationService.ListEndpoints.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Endpoint> endpoints;

  static {
    // hack to force ProGuard to consider Endpoint used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Endpoint.class);
  }

  /**
   * Optional. Metadata for the service. This data can be consumed by service clients. Restrictions:
   * * The entire metadata dictionary may contain up to 2000 characters, spread accoss all key-value
   * pairs. Metadata that goes beyond this limit are rejected * Valid metadata keys have two
   * segments: an optional prefix and name, separated by a slash (/). The name segment is required
   * and must be 63 characters or less, beginning and ending with an alphanumeric character
   * ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. The prefix
   * is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated
   * by dots (.), not longer than 253 characters in total, followed by a slash (/). Metadata that
   * fails to meet these requirements are rejected * The `(*.)google.com/` and `(*.)googleapis.com/`
   * prefixes are reserved for system metadata managed by Service Directory. If the user tries to
   * write to these keyspaces, those entries are silently ignored by the system Note: This field is
   * equivalent to the `annotations` field in the v1 API. They have the same syntax and read/write
   * to the same location in Service Directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * Immutable. The resource name for the service in the format
   * `projects/locations/namespaces/services`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The timestamp when the service was last updated. Note: endpoints being
   * created/deleted/updated within the service are not considered service updates for the purpose
   * of this timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The timestamp when the service was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when the service was created.
   * @param createTime createTime or {@code null} for none
   */
  public Service setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Endpoints associated with this service. Returned on LookupService.ResolveService.
   * Control plane clients should use RegistrationService.ListEndpoints.
   * @return value or {@code null} for none
   */
  public java.util.List<Endpoint> getEndpoints() {
    return endpoints;
  }

  /**
   * Output only. Endpoints associated with this service. Returned on LookupService.ResolveService.
   * Control plane clients should use RegistrationService.ListEndpoints.
   * @param endpoints endpoints or {@code null} for none
   */
  public Service setEndpoints(java.util.List<Endpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  /**
   * Optional. Metadata for the service. This data can be consumed by service clients. Restrictions:
   * * The entire metadata dictionary may contain up to 2000 characters, spread accoss all key-value
   * pairs. Metadata that goes beyond this limit are rejected * Valid metadata keys have two
   * segments: an optional prefix and name, separated by a slash (/). The name segment is required
   * and must be 63 characters or less, beginning and ending with an alphanumeric character
   * ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. The prefix
   * is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated
   * by dots (.), not longer than 253 characters in total, followed by a slash (/). Metadata that
   * fails to meet these requirements are rejected * The `(*.)google.com/` and `(*.)googleapis.com/`
   * prefixes are reserved for system metadata managed by Service Directory. If the user tries to
   * write to these keyspaces, those entries are silently ignored by the system Note: This field is
   * equivalent to the `annotations` field in the v1 API. They have the same syntax and read/write
   * to the same location in Service Directory.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * Optional. Metadata for the service. This data can be consumed by service clients. Restrictions:
   * * The entire metadata dictionary may contain up to 2000 characters, spread accoss all key-value
   * pairs. Metadata that goes beyond this limit are rejected * Valid metadata keys have two
   * segments: an optional prefix and name, separated by a slash (/). The name segment is required
   * and must be 63 characters or less, beginning and ending with an alphanumeric character
   * ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. The prefix
   * is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated
   * by dots (.), not longer than 253 characters in total, followed by a slash (/). Metadata that
   * fails to meet these requirements are rejected * The `(*.)google.com/` and `(*.)googleapis.com/`
   * prefixes are reserved for system metadata managed by Service Directory. If the user tries to
   * write to these keyspaces, those entries are silently ignored by the system Note: This field is
   * equivalent to the `annotations` field in the v1 API. They have the same syntax and read/write
   * to the same location in Service Directory.
   * @param metadata metadata or {@code null} for none
   */
  public Service setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Immutable. The resource name for the service in the format
   * `projects/locations/namespaces/services`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The resource name for the service in the format
   * `projects/locations/namespaces/services`.
   * @param name name or {@code null} for none
   */
  public Service setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The timestamp when the service was last updated. Note: endpoints being
   * created/deleted/updated within the service are not considered service updates for the purpose
   * of this timestamp.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the service was last updated. Note: endpoints being
   * created/deleted/updated within the service are not considered service updates for the purpose
   * of this timestamp.
   * @param updateTime updateTime or {@code null} for none
   */
  public Service setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Service set(String fieldName, Object value) {
    return (Service) super.set(fieldName, value);
  }

  @Override
  public Service clone() {
    return (Service) super.clone();
  }

}
