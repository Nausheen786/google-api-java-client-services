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

package com.google.api.services.privateca.v1beta1.model;

/**
 * A ReusableConfigWrapper describes values that may assist in creating an X.509 certificate, or a
 * reference to a pre-defined set of values.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReusableConfigWrapper extends com.google.api.client.json.GenericJson {

  /**
   * Required. A resource path to a ReusableConfig in the format
   * `projects/locations/reusableConfigs`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reusableConfig;

  /**
   * Required. A user-specified inline ReusableConfigValues.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReusableConfigValues reusableConfigValues;

  /**
   * Required. A resource path to a ReusableConfig in the format
   * `projects/locations/reusableConfigs`.
   * @return value or {@code null} for none
   */
  public java.lang.String getReusableConfig() {
    return reusableConfig;
  }

  /**
   * Required. A resource path to a ReusableConfig in the format
   * `projects/locations/reusableConfigs`.
   * @param reusableConfig reusableConfig or {@code null} for none
   */
  public ReusableConfigWrapper setReusableConfig(java.lang.String reusableConfig) {
    this.reusableConfig = reusableConfig;
    return this;
  }

  /**
   * Required. A user-specified inline ReusableConfigValues.
   * @return value or {@code null} for none
   */
  public ReusableConfigValues getReusableConfigValues() {
    return reusableConfigValues;
  }

  /**
   * Required. A user-specified inline ReusableConfigValues.
   * @param reusableConfigValues reusableConfigValues or {@code null} for none
   */
  public ReusableConfigWrapper setReusableConfigValues(ReusableConfigValues reusableConfigValues) {
    this.reusableConfigValues = reusableConfigValues;
    return this;
  }

  @Override
  public ReusableConfigWrapper set(String fieldName, Object value) {
    return (ReusableConfigWrapper) super.set(fieldName, value);
  }

  @Override
  public ReusableConfigWrapper clone() {
    return (ReusableConfigWrapper) super.clone();
  }

}