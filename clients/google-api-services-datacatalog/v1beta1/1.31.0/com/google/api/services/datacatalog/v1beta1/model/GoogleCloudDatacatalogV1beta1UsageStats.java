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

package com.google.api.services.datacatalog.v1beta1.model;

/**
 * Detailed counts on the entry's usage. Caveats: - Only BigQuery tables have usage stats - The
 * usage stats only inlude BigQuery query jobs - The usage stats might be underestimated, e.g.
 * wildcard table references are not yet counted in usage computation
 * https://cloud.google.com/bigquery/docs/querying-wildcard-tables
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1beta1UsageStats extends com.google.api.client.json.GenericJson {

  /**
   * The number of times that the underlying entry was attempted to be used but was cancelled by the
   * user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float totalCancellations;

  /**
   * The number of times that the underlying entry was successfully used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float totalCompletions;

  /**
   * Total time spent (in milliseconds) during uses the resulted in completions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float totalExecutionTimeForCompletionsMillis;

  /**
   * The number of times that the underlying entry was attempted to be used but failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float totalFailures;

  /**
   * The number of times that the underlying entry was attempted to be used but was cancelled by the
   * user.
   * @return value or {@code null} for none
   */
  public java.lang.Float getTotalCancellations() {
    return totalCancellations;
  }

  /**
   * The number of times that the underlying entry was attempted to be used but was cancelled by the
   * user.
   * @param totalCancellations totalCancellations or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1UsageStats setTotalCancellations(java.lang.Float totalCancellations) {
    this.totalCancellations = totalCancellations;
    return this;
  }

  /**
   * The number of times that the underlying entry was successfully used.
   * @return value or {@code null} for none
   */
  public java.lang.Float getTotalCompletions() {
    return totalCompletions;
  }

  /**
   * The number of times that the underlying entry was successfully used.
   * @param totalCompletions totalCompletions or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1UsageStats setTotalCompletions(java.lang.Float totalCompletions) {
    this.totalCompletions = totalCompletions;
    return this;
  }

  /**
   * Total time spent (in milliseconds) during uses the resulted in completions.
   * @return value or {@code null} for none
   */
  public java.lang.Float getTotalExecutionTimeForCompletionsMillis() {
    return totalExecutionTimeForCompletionsMillis;
  }

  /**
   * Total time spent (in milliseconds) during uses the resulted in completions.
   * @param totalExecutionTimeForCompletionsMillis totalExecutionTimeForCompletionsMillis or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1UsageStats setTotalExecutionTimeForCompletionsMillis(java.lang.Float totalExecutionTimeForCompletionsMillis) {
    this.totalExecutionTimeForCompletionsMillis = totalExecutionTimeForCompletionsMillis;
    return this;
  }

  /**
   * The number of times that the underlying entry was attempted to be used but failed.
   * @return value or {@code null} for none
   */
  public java.lang.Float getTotalFailures() {
    return totalFailures;
  }

  /**
   * The number of times that the underlying entry was attempted to be used but failed.
   * @param totalFailures totalFailures or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1UsageStats setTotalFailures(java.lang.Float totalFailures) {
    this.totalFailures = totalFailures;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1beta1UsageStats set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1beta1UsageStats) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1beta1UsageStats clone() {
    return (GoogleCloudDatacatalogV1beta1UsageStats) super.clone();
  }

}
