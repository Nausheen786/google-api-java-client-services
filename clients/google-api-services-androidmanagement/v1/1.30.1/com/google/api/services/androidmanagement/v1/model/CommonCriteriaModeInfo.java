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

package com.google.api.services.androidmanagement.v1.model;

/**
 * Information about Common Criteria Mode—security standards defined in the Common Criteria for
 * Information Technology Security Evaluation (https://www.commoncriteriaportal.org/) (CC).This
 * information is only available if statusReportingSettings.commonCriteriaModeEnabled is true in the
 * device's policy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CommonCriteriaModeInfo extends com.google.api.client.json.GenericJson {

  /**
   * Whether Common Criteria Mode is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commonCriteriaModeStatus;

  /**
   * Whether Common Criteria Mode is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommonCriteriaModeStatus() {
    return commonCriteriaModeStatus;
  }

  /**
   * Whether Common Criteria Mode is enabled.
   * @param commonCriteriaModeStatus commonCriteriaModeStatus or {@code null} for none
   */
  public CommonCriteriaModeInfo setCommonCriteriaModeStatus(java.lang.String commonCriteriaModeStatus) {
    this.commonCriteriaModeStatus = commonCriteriaModeStatus;
    return this;
  }

  @Override
  public CommonCriteriaModeInfo set(String fieldName, Object value) {
    return (CommonCriteriaModeInfo) super.set(fieldName, value);
  }

  @Override
  public CommonCriteriaModeInfo clone() {
    return (CommonCriteriaModeInfo) super.clone();
  }

}