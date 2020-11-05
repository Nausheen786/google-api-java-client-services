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
 * Describes an evaluation between a machine learning model's predictions and ground truth labels.
 * Created when an EvaluationJob runs successfully.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1beta1Evaluation extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Type of task that the model version being evaluated performs, as defined in the
   * evaluationJobConfig.inputConfig.annotationType field of the evaluation job that created this
   * evaluation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotationType;

  /**
   * Output only. Options used in the evaluation job that created this evaluation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1EvaluationConfig config;

  /**
   * Output only. Timestamp for when this evaluation was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The number of items in the ground truth dataset that were used for this
   * evaluation. Only populated when the evaulation is for certain AnnotationTypes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long evaluatedItemCount;

  /**
   * Output only. Timestamp for when the evaluation job that created this evaluation ran.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String evaluationJobRunTime;

  /**
   * Output only. Metrics comparing predictions to ground truth labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1EvaluationMetrics evaluationMetrics;

  /**
   * Output only. Resource name of an evaluation. The name has the following format:
   * "projects/{project_id}/datasets/{dataset_id}/evaluations/ {evaluation_id}'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Type of task that the model version being evaluated performs, as defined in the
   * evaluationJobConfig.inputConfig.annotationType field of the evaluation job that created this
   * evaluation.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotationType() {
    return annotationType;
  }

  /**
   * Output only. Type of task that the model version being evaluated performs, as defined in the
   * evaluationJobConfig.inputConfig.annotationType field of the evaluation job that created this
   * evaluation.
   * @param annotationType annotationType or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1Evaluation setAnnotationType(java.lang.String annotationType) {
    this.annotationType = annotationType;
    return this;
  }

  /**
   * Output only. Options used in the evaluation job that created this evaluation.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationConfig getConfig() {
    return config;
  }

  /**
   * Output only. Options used in the evaluation job that created this evaluation.
   * @param config config or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1Evaluation setConfig(GoogleCloudDatalabelingV1beta1EvaluationConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Output only. Timestamp for when this evaluation was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp for when this evaluation was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1Evaluation setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The number of items in the ground truth dataset that were used for this
   * evaluation. Only populated when the evaulation is for certain AnnotationTypes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEvaluatedItemCount() {
    return evaluatedItemCount;
  }

  /**
   * Output only. The number of items in the ground truth dataset that were used for this
   * evaluation. Only populated when the evaulation is for certain AnnotationTypes.
   * @param evaluatedItemCount evaluatedItemCount or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1Evaluation setEvaluatedItemCount(java.lang.Long evaluatedItemCount) {
    this.evaluatedItemCount = evaluatedItemCount;
    return this;
  }

  /**
   * Output only. Timestamp for when the evaluation job that created this evaluation ran.
   * @return value or {@code null} for none
   */
  public String getEvaluationJobRunTime() {
    return evaluationJobRunTime;
  }

  /**
   * Output only. Timestamp for when the evaluation job that created this evaluation ran.
   * @param evaluationJobRunTime evaluationJobRunTime or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1Evaluation setEvaluationJobRunTime(String evaluationJobRunTime) {
    this.evaluationJobRunTime = evaluationJobRunTime;
    return this;
  }

  /**
   * Output only. Metrics comparing predictions to ground truth labels.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationMetrics getEvaluationMetrics() {
    return evaluationMetrics;
  }

  /**
   * Output only. Metrics comparing predictions to ground truth labels.
   * @param evaluationMetrics evaluationMetrics or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1Evaluation setEvaluationMetrics(GoogleCloudDatalabelingV1beta1EvaluationMetrics evaluationMetrics) {
    this.evaluationMetrics = evaluationMetrics;
    return this;
  }

  /**
   * Output only. Resource name of an evaluation. The name has the following format:
   * "projects/{project_id}/datasets/{dataset_id}/evaluations/ {evaluation_id}'
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of an evaluation. The name has the following format:
   * "projects/{project_id}/datasets/{dataset_id}/evaluations/ {evaluation_id}'
   * @param name name or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1Evaluation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1beta1Evaluation set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1beta1Evaluation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1beta1Evaluation clone() {
    return (GoogleCloudDatalabelingV1beta1Evaluation) super.clone();
  }

}