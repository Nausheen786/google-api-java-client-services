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

package com.google.api.services.accesscontextmanager.v1.model;

/**
 * Response of ListGcpUserAccessBindings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Context Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListGcpUserAccessBindingsResponse extends com.google.api.client.json.GenericJson {

  /**
   * GcpUserAccessBinding
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GcpUserAccessBinding> gcpUserAccessBindings;

  static {
    // hack to force ProGuard to consider GcpUserAccessBinding used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GcpUserAccessBinding.class);
  }

  /**
   * Token to get the next page of items. If blank, there are no more items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * GcpUserAccessBinding
   * @return value or {@code null} for none
   */
  public java.util.List<GcpUserAccessBinding> getGcpUserAccessBindings() {
    return gcpUserAccessBindings;
  }

  /**
   * GcpUserAccessBinding
   * @param gcpUserAccessBindings gcpUserAccessBindings or {@code null} for none
   */
  public ListGcpUserAccessBindingsResponse setGcpUserAccessBindings(java.util.List<GcpUserAccessBinding> gcpUserAccessBindings) {
    this.gcpUserAccessBindings = gcpUserAccessBindings;
    return this;
  }

  /**
   * Token to get the next page of items. If blank, there are no more items.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to get the next page of items. If blank, there are no more items.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListGcpUserAccessBindingsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListGcpUserAccessBindingsResponse set(String fieldName, Object value) {
    return (ListGcpUserAccessBindingsResponse) super.set(fieldName, value);
  }

  @Override
  public ListGcpUserAccessBindingsResponse clone() {
    return (ListGcpUserAccessBindingsResponse) super.clone();
  }

}