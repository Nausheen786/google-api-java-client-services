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

package com.google.api.services.area120tables.v1alpha1.model;

/**
 * Response message for TablesService.ListWorkspaces.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Area120 Tables API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListWorkspacesResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is empty,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of workspaces.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Workspace> workspaces;

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is empty,
   * there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is empty,
   * there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListWorkspacesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of workspaces.
   * @return value or {@code null} for none
   */
  public java.util.List<Workspace> getWorkspaces() {
    return workspaces;
  }

  /**
   * The list of workspaces.
   * @param workspaces workspaces or {@code null} for none
   */
  public ListWorkspacesResponse setWorkspaces(java.util.List<Workspace> workspaces) {
    this.workspaces = workspaces;
    return this;
  }

  @Override
  public ListWorkspacesResponse set(String fieldName, Object value) {
    return (ListWorkspacesResponse) super.set(fieldName, value);
  }

  @Override
  public ListWorkspacesResponse clone() {
    return (ListWorkspacesResponse) super.clone();
  }

}