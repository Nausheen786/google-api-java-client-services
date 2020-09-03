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

package com.google.api.services.securitycenter.v1beta2.model;

/**
 * Resource capturing the state of an organization's subscription.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Subscription extends com.google.api.client.json.GenericJson {

  /**
   * The details of the most recent active subscription. If there has never been a subscription this
   * will be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Details details;

  /**
   * The resource name of the subscription. Format: organizations/{organization}/subscription
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The tier of SCC features this organization currently has access to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tier;

  /**
   * The details of the most recent active subscription. If there has never been a subscription this
   * will be empty.
   * @return value or {@code null} for none
   */
  public Details getDetails() {
    return details;
  }

  /**
   * The details of the most recent active subscription. If there has never been a subscription this
   * will be empty.
   * @param details details or {@code null} for none
   */
  public Subscription setDetails(Details details) {
    this.details = details;
    return this;
  }

  /**
   * The resource name of the subscription. Format: organizations/{organization}/subscription
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the subscription. Format: organizations/{organization}/subscription
   * @param name name or {@code null} for none
   */
  public Subscription setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The tier of SCC features this organization currently has access to.
   * @return value or {@code null} for none
   */
  public java.lang.String getTier() {
    return tier;
  }

  /**
   * The tier of SCC features this organization currently has access to.
   * @param tier tier or {@code null} for none
   */
  public Subscription setTier(java.lang.String tier) {
    this.tier = tier;
    return this;
  }

  @Override
  public Subscription set(String fieldName, Object value) {
    return (Subscription) super.set(fieldName, value);
  }

  @Override
  public Subscription clone() {
    return (Subscription) super.clone();
  }

}