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

package com.google.api.services.compute.model;

/**
 * Encapsulates numeric value that can be either absolute or relative.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FixedOrPercent extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Absolute value of VM instances calculated based on the specific mode.
   *
   *   - If the value is fixed, then the calculated value is equal to the fixed value.  - If the
   * value is a percent, then the calculated value is percent/100 * targetSize. For example, the
   * calculated value of a 80% of a managed instance group with 150 instances would be (80/100 *
   * 150) = 120 VM instances. If there is a remainder, the number is rounded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer calculated;

  /**
   * Specifies a fixed number of VM instances. This must be a positive integer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer fixed;

  /**
   * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for
   * 80%.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer percent;

  /**
   * [Output Only] Absolute value of VM instances calculated based on the specific mode.
   *
   *   - If the value is fixed, then the calculated value is equal to the fixed value.  - If the
   * value is a percent, then the calculated value is percent/100 * targetSize. For example, the
   * calculated value of a 80% of a managed instance group with 150 instances would be (80/100 *
   * 150) = 120 VM instances. If there is a remainder, the number is rounded.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCalculated() {
    return calculated;
  }

  /**
   * [Output Only] Absolute value of VM instances calculated based on the specific mode.
   *
   *   - If the value is fixed, then the calculated value is equal to the fixed value.  - If the
   * value is a percent, then the calculated value is percent/100 * targetSize. For example, the
   * calculated value of a 80% of a managed instance group with 150 instances would be (80/100 *
   * 150) = 120 VM instances. If there is a remainder, the number is rounded.
   * @param calculated calculated or {@code null} for none
   */
  public FixedOrPercent setCalculated(java.lang.Integer calculated) {
    this.calculated = calculated;
    return this;
  }

  /**
   * Specifies a fixed number of VM instances. This must be a positive integer.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFixed() {
    return fixed;
  }

  /**
   * Specifies a fixed number of VM instances. This must be a positive integer.
   * @param fixed fixed or {@code null} for none
   */
  public FixedOrPercent setFixed(java.lang.Integer fixed) {
    this.fixed = fixed;
    return this;
  }

  /**
   * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for
   * 80%.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPercent() {
    return percent;
  }

  /**
   * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for
   * 80%.
   * @param percent percent or {@code null} for none
   */
  public FixedOrPercent setPercent(java.lang.Integer percent) {
    this.percent = percent;
    return this;
  }

  @Override
  public FixedOrPercent set(String fieldName, Object value) {
    return (FixedOrPercent) super.set(fieldName, value);
  }

  @Override
  public FixedOrPercent clone() {
    return (FixedOrPercent) super.clone();
  }

}
