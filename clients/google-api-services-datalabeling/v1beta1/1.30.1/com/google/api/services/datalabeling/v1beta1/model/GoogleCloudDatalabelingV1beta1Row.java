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

package com.google.api.services.datalabeling.v1beta1.model;

/**
 * A row in the confusion matrix. Each entry in this row has the same ground truth label.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1beta1Row extends com.google.api.client.json.GenericJson {

  /**
   * The annotation spec of the ground truth label for this row.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1AnnotationSpec annotationSpec;

  /**
   * A list of the confusion matrix entries. One entry for each possible predicted label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry> entries;

  static {
    // hack to force ProGuard to consider GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry.class);
  }

  /**
   * The annotation spec of the ground truth label for this row.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationSpec getAnnotationSpec() {
    return annotationSpec;
  }

  /**
   * The annotation spec of the ground truth label for this row.
   * @param annotationSpec annotationSpec or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1Row setAnnotationSpec(GoogleCloudDatalabelingV1beta1AnnotationSpec annotationSpec) {
    this.annotationSpec = annotationSpec;
    return this;
  }

  /**
   * A list of the confusion matrix entries. One entry for each possible predicted label.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry> getEntries() {
    return entries;
  }

  /**
   * A list of the confusion matrix entries. One entry for each possible predicted label.
   * @param entries entries or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1Row setEntries(java.util.List<GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry> entries) {
    this.entries = entries;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1beta1Row set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1beta1Row) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1beta1Row clone() {
    return (GoogleCloudDatalabelingV1beta1Row) super.clone();
  }

}