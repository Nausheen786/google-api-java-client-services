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

package com.google.api.services.jobs.v3.model;

/**
 * Options for job processing.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudTalentV4JobProcessingOptions extends com.google.api.client.json.GenericJson {

  /**
   * If set to `true`, the service does not attempt to resolve a more precise address for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableStreetAddressResolution;

  /**
   * Option for job HTML content sanitization. Applied fields are: * description *
   * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these
   * fields may be stripped if sanitiazation isn't disabled. Defaults to
   * HtmlSanitization.SIMPLE_FORMATTING_ONLY.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String htmlSanitization;

  /**
   * If set to `true`, the service does not attempt to resolve a more precise address for the job.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableStreetAddressResolution() {
    return disableStreetAddressResolution;
  }

  /**
   * If set to `true`, the service does not attempt to resolve a more precise address for the job.
   * @param disableStreetAddressResolution disableStreetAddressResolution or {@code null} for none
   */
  public GoogleCloudTalentV4JobProcessingOptions setDisableStreetAddressResolution(java.lang.Boolean disableStreetAddressResolution) {
    this.disableStreetAddressResolution = disableStreetAddressResolution;
    return this;
  }

  /**
   * Option for job HTML content sanitization. Applied fields are: * description *
   * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these
   * fields may be stripped if sanitiazation isn't disabled. Defaults to
   * HtmlSanitization.SIMPLE_FORMATTING_ONLY.
   * @return value or {@code null} for none
   */
  public java.lang.String getHtmlSanitization() {
    return htmlSanitization;
  }

  /**
   * Option for job HTML content sanitization. Applied fields are: * description *
   * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these
   * fields may be stripped if sanitiazation isn't disabled. Defaults to
   * HtmlSanitization.SIMPLE_FORMATTING_ONLY.
   * @param htmlSanitization htmlSanitization or {@code null} for none
   */
  public GoogleCloudTalentV4JobProcessingOptions setHtmlSanitization(java.lang.String htmlSanitization) {
    this.htmlSanitization = htmlSanitization;
    return this;
  }

  @Override
  public GoogleCloudTalentV4JobProcessingOptions set(String fieldName, Object value) {
    return (GoogleCloudTalentV4JobProcessingOptions) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudTalentV4JobProcessingOptions clone() {
    return (GoogleCloudTalentV4JobProcessingOptions) super.clone();
  }

}