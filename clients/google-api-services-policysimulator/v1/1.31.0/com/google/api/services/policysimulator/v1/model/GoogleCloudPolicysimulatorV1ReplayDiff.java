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

package com.google.api.services.policysimulator.v1.model;

/**
 * The difference between the results of evaluating an access tuple under the current (baseline)
 * policies and under the proposed (simulated) policies. This difference explains how a member's
 * access could change if the proposed policies were applied.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Policy Simulator API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPolicysimulatorV1ReplayDiff extends com.google.api.client.json.GenericJson {

  /**
   * A summary and comparison of the member's access under the current (baseline) policies and the
   * proposed (simulated) policies for a single access tuple. The evaluation of the member's access
   * is reported in the AccessState field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudPolicysimulatorV1AccessStateDiff accessDiff;

  /**
   * A summary and comparison of the member's access under the current (baseline) policies and the
   * proposed (simulated) policies for a single access tuple. The evaluation of the member's access
   * is reported in the AccessState field.
   * @return value or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1AccessStateDiff getAccessDiff() {
    return accessDiff;
  }

  /**
   * A summary and comparison of the member's access under the current (baseline) policies and the
   * proposed (simulated) policies for a single access tuple. The evaluation of the member's access
   * is reported in the AccessState field.
   * @param accessDiff accessDiff or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1ReplayDiff setAccessDiff(GoogleCloudPolicysimulatorV1AccessStateDiff accessDiff) {
    this.accessDiff = accessDiff;
    return this;
  }

  @Override
  public GoogleCloudPolicysimulatorV1ReplayDiff set(String fieldName, Object value) {
    return (GoogleCloudPolicysimulatorV1ReplayDiff) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPolicysimulatorV1ReplayDiff clone() {
    return (GoogleCloudPolicysimulatorV1ReplayDiff) super.clone();
  }

}
