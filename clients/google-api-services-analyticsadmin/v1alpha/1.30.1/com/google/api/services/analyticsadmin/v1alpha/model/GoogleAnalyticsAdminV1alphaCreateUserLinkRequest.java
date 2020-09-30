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

package com.google.api.services.analyticsadmin.v1alpha.model;

/**
 * Request message for CreateUserLink RPC. Users can have multiple email addresses associated with
 * their Google account, and one of these email addresses is the "primary" email address. Any of the
 * email addresses associated with a Google account may be used for a new UserLink, but the returned
 * UserLink will always contain the "primary" email address. As a result, the input and output email
 * address for this request may differ.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1alphaCreateUserLinkRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If notify_new_user is set, then email new user that they've been given permissions on
   * the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean notifyNewUser;

  /**
   * Required. Example format: accounts/1234
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Required. The user link to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaUserLink userLink;

  /**
   * Optional. If notify_new_user is set, then email new user that they've been given permissions on
   * the resource.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNotifyNewUser() {
    return notifyNewUser;
  }

  /**
   * Optional. If notify_new_user is set, then email new user that they've been given permissions on
   * the resource.
   * @param notifyNewUser notifyNewUser or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaCreateUserLinkRequest setNotifyNewUser(java.lang.Boolean notifyNewUser) {
    this.notifyNewUser = notifyNewUser;
    return this;
  }

  /**
   * Required. Example format: accounts/1234
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Required. Example format: accounts/1234
   * @param parent parent or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaCreateUserLinkRequest setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Required. The user link to create.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaUserLink getUserLink() {
    return userLink;
  }

  /**
   * Required. The user link to create.
   * @param userLink userLink or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaCreateUserLinkRequest setUserLink(GoogleAnalyticsAdminV1alphaUserLink userLink) {
    this.userLink = userLink;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaCreateUserLinkRequest set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaCreateUserLinkRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaCreateUserLinkRequest clone() {
    return (GoogleAnalyticsAdminV1alphaCreateUserLinkRequest) super.clone();
  }

}