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
 * A feedback message inside a feedback thread.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1beta1FeedbackMessage extends com.google.api.client.json.GenericJson {

  /**
   * String content of the feedback. Maximum of 10000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String body;

  /**
   * Create time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The image storing this feedback if the feedback is an image representing operator's comments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String image;

  /**
   * Name of the feedback message in a feedback thread. Format: 'project/{project_id}/datasets/{data
   * set_id}/annotatedDatasets/{annotated_dataset_id}/feedbackThreads/{feedback_thread_id}/feedbackM
   * essage/{feedback_message_id}'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadata operatorFeedbackMetadata;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadata requesterFeedbackMetadata;

  /**
   * String content of the feedback. Maximum of 10000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getBody() {
    return body;
  }

  /**
   * String content of the feedback. Maximum of 10000 characters.
   * @param body body or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1FeedbackMessage setBody(java.lang.String body) {
    this.body = body;
    return this;
  }

  /**
   * Create time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Create time.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1FeedbackMessage setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The image storing this feedback if the feedback is an image representing operator's comments.
   * @see #decodeImage()
   * @return value or {@code null} for none
   */
  public java.lang.String getImage() {
    return image;
  }

  /**
   * The image storing this feedback if the feedback is an image representing operator's comments.
   * @see #getImage()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeImage() {
    return com.google.api.client.util.Base64.decodeBase64(image);
  }

  /**
   * The image storing this feedback if the feedback is an image representing operator's comments.
   * @see #encodeImage()
   * @param image image or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1FeedbackMessage setImage(java.lang.String image) {
    this.image = image;
    return this;
  }

  /**
   * The image storing this feedback if the feedback is an image representing operator's comments.
   * @see #setImage()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDatalabelingV1beta1FeedbackMessage encodeImage(byte[] image) {
    this.image = com.google.api.client.util.Base64.encodeBase64URLSafeString(image);
    return this;
  }

  /**
   * Name of the feedback message in a feedback thread. Format: 'project/{project_id}/datasets/{data
   * set_id}/annotatedDatasets/{annotated_dataset_id}/feedbackThreads/{feedback_thread_id}/feedbackM
   * essage/{feedback_message_id}'
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the feedback message in a feedback thread. Format: 'project/{project_id}/datasets/{data
   * set_id}/annotatedDatasets/{annotated_dataset_id}/feedbackThreads/{feedback_thread_id}/feedbackM
   * essage/{feedback_message_id}'
   * @param name name or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1FeedbackMessage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadata getOperatorFeedbackMetadata() {
    return operatorFeedbackMetadata;
  }

  /**
   * @param operatorFeedbackMetadata operatorFeedbackMetadata or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1FeedbackMessage setOperatorFeedbackMetadata(GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadata operatorFeedbackMetadata) {
    this.operatorFeedbackMetadata = operatorFeedbackMetadata;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadata getRequesterFeedbackMetadata() {
    return requesterFeedbackMetadata;
  }

  /**
   * @param requesterFeedbackMetadata requesterFeedbackMetadata or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1FeedbackMessage setRequesterFeedbackMetadata(GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadata requesterFeedbackMetadata) {
    this.requesterFeedbackMetadata = requesterFeedbackMetadata;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1beta1FeedbackMessage set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1beta1FeedbackMessage) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1beta1FeedbackMessage clone() {
    return (GoogleCloudDatalabelingV1beta1FeedbackMessage) super.clone();
  }

}