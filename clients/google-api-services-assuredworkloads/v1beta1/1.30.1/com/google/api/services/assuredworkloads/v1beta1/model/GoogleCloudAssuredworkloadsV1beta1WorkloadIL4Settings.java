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

package com.google.api.services.assuredworkloads.v1beta1.model;

/**
 * Settings specific to resources needed for IL4.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Assured Workloads API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssuredworkloadsV1beta1WorkloadIL4Settings extends com.google.api.client.json.GenericJson {

  /**
   * Required. Input only. Immutable. Settings used to create a CMEK crypto key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings kmsSettings;

  /**
   * Required. Input only. Immutable. Settings used to create a CMEK crypto key.
   * @return value or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings getKmsSettings() {
    return kmsSettings;
  }

  /**
   * Required. Input only. Immutable. Settings used to create a CMEK crypto key.
   * @param kmsSettings kmsSettings or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1WorkloadIL4Settings setKmsSettings(GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings kmsSettings) {
    this.kmsSettings = kmsSettings;
    return this;
  }

  @Override
  public GoogleCloudAssuredworkloadsV1beta1WorkloadIL4Settings set(String fieldName, Object value) {
    return (GoogleCloudAssuredworkloadsV1beta1WorkloadIL4Settings) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssuredworkloadsV1beta1WorkloadIL4Settings clone() {
    return (GoogleCloudAssuredworkloadsV1beta1WorkloadIL4Settings) super.clone();
  }

}