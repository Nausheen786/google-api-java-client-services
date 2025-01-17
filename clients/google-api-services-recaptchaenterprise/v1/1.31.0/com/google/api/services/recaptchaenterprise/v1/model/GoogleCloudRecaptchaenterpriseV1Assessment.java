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

package com.google.api.services.recaptchaenterprise.v1.model;

/**
 * A recaptcha assessment resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the reCAPTCHA Enterprise API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecaptchaenterpriseV1Assessment extends com.google.api.client.json.GenericJson {

  /**
   * The event being assessed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecaptchaenterpriseV1Event event;

  /**
   * Output only. The resource name for the Assessment in the format
   * "projects/{project}/assessments/{assessment}".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The risk analysis result for the event being assessed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecaptchaenterpriseV1RiskAnalysis riskAnalysis;

  /**
   * Output only. Properties of the provided event token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecaptchaenterpriseV1TokenProperties tokenProperties;

  /**
   * The event being assessed.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1Event getEvent() {
    return event;
  }

  /**
   * The event being assessed.
   * @param event event or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1Assessment setEvent(GoogleCloudRecaptchaenterpriseV1Event event) {
    this.event = event;
    return this;
  }

  /**
   * Output only. The resource name for the Assessment in the format
   * "projects/{project}/assessments/{assessment}".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name for the Assessment in the format
   * "projects/{project}/assessments/{assessment}".
   * @param name name or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1Assessment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The risk analysis result for the event being assessed.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1RiskAnalysis getRiskAnalysis() {
    return riskAnalysis;
  }

  /**
   * Output only. The risk analysis result for the event being assessed.
   * @param riskAnalysis riskAnalysis or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1Assessment setRiskAnalysis(GoogleCloudRecaptchaenterpriseV1RiskAnalysis riskAnalysis) {
    this.riskAnalysis = riskAnalysis;
    return this;
  }

  /**
   * Output only. Properties of the provided event token.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1TokenProperties getTokenProperties() {
    return tokenProperties;
  }

  /**
   * Output only. Properties of the provided event token.
   * @param tokenProperties tokenProperties or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1Assessment setTokenProperties(GoogleCloudRecaptchaenterpriseV1TokenProperties tokenProperties) {
    this.tokenProperties = tokenProperties;
    return this;
  }

  @Override
  public GoogleCloudRecaptchaenterpriseV1Assessment set(String fieldName, Object value) {
    return (GoogleCloudRecaptchaenterpriseV1Assessment) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecaptchaenterpriseV1Assessment clone() {
    return (GoogleCloudRecaptchaenterpriseV1Assessment) super.clone();
  }

}
