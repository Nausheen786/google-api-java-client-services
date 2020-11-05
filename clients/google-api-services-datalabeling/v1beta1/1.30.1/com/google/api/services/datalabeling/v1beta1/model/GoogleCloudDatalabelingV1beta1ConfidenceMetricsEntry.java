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
 * Model definition for GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry extends com.google.api.client.json.GenericJson {

  /**
   * Threshold used for this entry. For classification tasks, this is a classification threshold: a
   * predicted label is categorized as positive or negative (in the context of this point on the PR
   * curve) based on whether the label's score meets this threshold. For image object detection
   * (bounding box) tasks, this is the [intersection-over-union (IOU)](/vision/automl/object-
   * detection/docs/evaluate#intersection-over-union) threshold for the context of this point on the
   * PR curve.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidenceThreshold;

  /**
   * Harmonic mean of recall and precision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float f1Score;

  /**
   * The harmonic mean of recall_at1 and precision_at1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float f1ScoreAt1;

  /**
   * The harmonic mean of recall_at5 and precision_at5.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float f1ScoreAt5;

  /**
   * Precision value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float precision;

  /**
   * Precision value for entries with label that has highest score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float precisionAt1;

  /**
   * Precision value for entries with label that has highest 5 scores.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float precisionAt5;

  /**
   * Recall value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float recall;

  /**
   * Recall value for entries with label that has highest score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float recallAt1;

  /**
   * Recall value for entries with label that has highest 5 scores.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float recallAt5;

  /**
   * Threshold used for this entry. For classification tasks, this is a classification threshold: a
   * predicted label is categorized as positive or negative (in the context of this point on the PR
   * curve) based on whether the label's score meets this threshold. For image object detection
   * (bounding box) tasks, this is the [intersection-over-union (IOU)](/vision/automl/object-
   * detection/docs/evaluate#intersection-over-union) threshold for the context of this point on the
   * PR curve.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidenceThreshold() {
    return confidenceThreshold;
  }

  /**
   * Threshold used for this entry. For classification tasks, this is a classification threshold: a
   * predicted label is categorized as positive or negative (in the context of this point on the PR
   * curve) based on whether the label's score meets this threshold. For image object detection
   * (bounding box) tasks, this is the [intersection-over-union (IOU)](/vision/automl/object-
   * detection/docs/evaluate#intersection-over-union) threshold for the context of this point on the
   * PR curve.
   * @param confidenceThreshold confidenceThreshold or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry setConfidenceThreshold(java.lang.Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }

  /**
   * Harmonic mean of recall and precision.
   * @return value or {@code null} for none
   */
  public java.lang.Float getF1Score() {
    return f1Score;
  }

  /**
   * Harmonic mean of recall and precision.
   * @param f1Score f1Score or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry setF1Score(java.lang.Float f1Score) {
    this.f1Score = f1Score;
    return this;
  }

  /**
   * The harmonic mean of recall_at1 and precision_at1.
   * @return value or {@code null} for none
   */
  public java.lang.Float getF1ScoreAt1() {
    return f1ScoreAt1;
  }

  /**
   * The harmonic mean of recall_at1 and precision_at1.
   * @param f1ScoreAt1 f1ScoreAt1 or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry setF1ScoreAt1(java.lang.Float f1ScoreAt1) {
    this.f1ScoreAt1 = f1ScoreAt1;
    return this;
  }

  /**
   * The harmonic mean of recall_at5 and precision_at5.
   * @return value or {@code null} for none
   */
  public java.lang.Float getF1ScoreAt5() {
    return f1ScoreAt5;
  }

  /**
   * The harmonic mean of recall_at5 and precision_at5.
   * @param f1ScoreAt5 f1ScoreAt5 or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry setF1ScoreAt5(java.lang.Float f1ScoreAt5) {
    this.f1ScoreAt5 = f1ScoreAt5;
    return this;
  }

  /**
   * Precision value.
   * @return value or {@code null} for none
   */
  public java.lang.Float getPrecision() {
    return precision;
  }

  /**
   * Precision value.
   * @param precision precision or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry setPrecision(java.lang.Float precision) {
    this.precision = precision;
    return this;
  }

  /**
   * Precision value for entries with label that has highest score.
   * @return value or {@code null} for none
   */
  public java.lang.Float getPrecisionAt1() {
    return precisionAt1;
  }

  /**
   * Precision value for entries with label that has highest score.
   * @param precisionAt1 precisionAt1 or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry setPrecisionAt1(java.lang.Float precisionAt1) {
    this.precisionAt1 = precisionAt1;
    return this;
  }

  /**
   * Precision value for entries with label that has highest 5 scores.
   * @return value or {@code null} for none
   */
  public java.lang.Float getPrecisionAt5() {
    return precisionAt5;
  }

  /**
   * Precision value for entries with label that has highest 5 scores.
   * @param precisionAt5 precisionAt5 or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry setPrecisionAt5(java.lang.Float precisionAt5) {
    this.precisionAt5 = precisionAt5;
    return this;
  }

  /**
   * Recall value.
   * @return value or {@code null} for none
   */
  public java.lang.Float getRecall() {
    return recall;
  }

  /**
   * Recall value.
   * @param recall recall or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry setRecall(java.lang.Float recall) {
    this.recall = recall;
    return this;
  }

  /**
   * Recall value for entries with label that has highest score.
   * @return value or {@code null} for none
   */
  public java.lang.Float getRecallAt1() {
    return recallAt1;
  }

  /**
   * Recall value for entries with label that has highest score.
   * @param recallAt1 recallAt1 or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry setRecallAt1(java.lang.Float recallAt1) {
    this.recallAt1 = recallAt1;
    return this;
  }

  /**
   * Recall value for entries with label that has highest 5 scores.
   * @return value or {@code null} for none
   */
  public java.lang.Float getRecallAt5() {
    return recallAt5;
  }

  /**
   * Recall value for entries with label that has highest 5 scores.
   * @param recallAt5 recallAt5 or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry setRecallAt5(java.lang.Float recallAt5) {
    this.recallAt5 = recallAt5;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry clone() {
    return (GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry) super.clone();
  }

}