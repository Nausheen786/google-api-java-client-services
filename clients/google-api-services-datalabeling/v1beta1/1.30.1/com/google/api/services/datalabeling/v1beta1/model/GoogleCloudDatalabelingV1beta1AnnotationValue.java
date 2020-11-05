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
 * Annotation value for an example.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1beta1AnnotationValue extends com.google.api.client.json.GenericJson {

  /**
   * Annotation value for image bounding box, oriented bounding box and polygon cases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1ImageBoundingPolyAnnotation imageBoundingPolyAnnotation;

  /**
   * Annotation value for image classification case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation imageClassificationAnnotation;

  /**
   * Annotation value for image polyline cases. Polyline here is different from BoundingPoly. It is
   * formed by line segments connected to each other but not closed form(Bounding Poly). The line
   * segments can cross each other.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation imagePolylineAnnotation;

  /**
   * Annotation value for image segmentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation imageSegmentationAnnotation;

  /**
   * Annotation value for text classification case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1TextClassificationAnnotation textClassificationAnnotation;

  /**
   * Annotation value for text entity extraction case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation textEntityExtractionAnnotation;

  /**
   * Annotation value for video classification case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1VideoClassificationAnnotation videoClassificationAnnotation;

  /**
   * Annotation value for video event case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1VideoEventAnnotation videoEventAnnotation;

  /**
   * Annotation value for video object detection and tracking case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1VideoObjectTrackingAnnotation videoObjectTrackingAnnotation;

  /**
   * Annotation value for image bounding box, oriented bounding box and polygon cases.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ImageBoundingPolyAnnotation getImageBoundingPolyAnnotation() {
    return imageBoundingPolyAnnotation;
  }

  /**
   * Annotation value for image bounding box, oriented bounding box and polygon cases.
   * @param imageBoundingPolyAnnotation imageBoundingPolyAnnotation or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationValue setImageBoundingPolyAnnotation(GoogleCloudDatalabelingV1beta1ImageBoundingPolyAnnotation imageBoundingPolyAnnotation) {
    this.imageBoundingPolyAnnotation = imageBoundingPolyAnnotation;
    return this;
  }

  /**
   * Annotation value for image classification case.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation getImageClassificationAnnotation() {
    return imageClassificationAnnotation;
  }

  /**
   * Annotation value for image classification case.
   * @param imageClassificationAnnotation imageClassificationAnnotation or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationValue setImageClassificationAnnotation(GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation imageClassificationAnnotation) {
    this.imageClassificationAnnotation = imageClassificationAnnotation;
    return this;
  }

  /**
   * Annotation value for image polyline cases. Polyline here is different from BoundingPoly. It is
   * formed by line segments connected to each other but not closed form(Bounding Poly). The line
   * segments can cross each other.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation getImagePolylineAnnotation() {
    return imagePolylineAnnotation;
  }

  /**
   * Annotation value for image polyline cases. Polyline here is different from BoundingPoly. It is
   * formed by line segments connected to each other but not closed form(Bounding Poly). The line
   * segments can cross each other.
   * @param imagePolylineAnnotation imagePolylineAnnotation or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationValue setImagePolylineAnnotation(GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation imagePolylineAnnotation) {
    this.imagePolylineAnnotation = imagePolylineAnnotation;
    return this;
  }

  /**
   * Annotation value for image segmentation.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation getImageSegmentationAnnotation() {
    return imageSegmentationAnnotation;
  }

  /**
   * Annotation value for image segmentation.
   * @param imageSegmentationAnnotation imageSegmentationAnnotation or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationValue setImageSegmentationAnnotation(GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation imageSegmentationAnnotation) {
    this.imageSegmentationAnnotation = imageSegmentationAnnotation;
    return this;
  }

  /**
   * Annotation value for text classification case.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1TextClassificationAnnotation getTextClassificationAnnotation() {
    return textClassificationAnnotation;
  }

  /**
   * Annotation value for text classification case.
   * @param textClassificationAnnotation textClassificationAnnotation or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationValue setTextClassificationAnnotation(GoogleCloudDatalabelingV1beta1TextClassificationAnnotation textClassificationAnnotation) {
    this.textClassificationAnnotation = textClassificationAnnotation;
    return this;
  }

  /**
   * Annotation value for text entity extraction case.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation getTextEntityExtractionAnnotation() {
    return textEntityExtractionAnnotation;
  }

  /**
   * Annotation value for text entity extraction case.
   * @param textEntityExtractionAnnotation textEntityExtractionAnnotation or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationValue setTextEntityExtractionAnnotation(GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation textEntityExtractionAnnotation) {
    this.textEntityExtractionAnnotation = textEntityExtractionAnnotation;
    return this;
  }

  /**
   * Annotation value for video classification case.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1VideoClassificationAnnotation getVideoClassificationAnnotation() {
    return videoClassificationAnnotation;
  }

  /**
   * Annotation value for video classification case.
   * @param videoClassificationAnnotation videoClassificationAnnotation or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationValue setVideoClassificationAnnotation(GoogleCloudDatalabelingV1beta1VideoClassificationAnnotation videoClassificationAnnotation) {
    this.videoClassificationAnnotation = videoClassificationAnnotation;
    return this;
  }

  /**
   * Annotation value for video event case.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1VideoEventAnnotation getVideoEventAnnotation() {
    return videoEventAnnotation;
  }

  /**
   * Annotation value for video event case.
   * @param videoEventAnnotation videoEventAnnotation or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationValue setVideoEventAnnotation(GoogleCloudDatalabelingV1beta1VideoEventAnnotation videoEventAnnotation) {
    this.videoEventAnnotation = videoEventAnnotation;
    return this;
  }

  /**
   * Annotation value for video object detection and tracking case.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1VideoObjectTrackingAnnotation getVideoObjectTrackingAnnotation() {
    return videoObjectTrackingAnnotation;
  }

  /**
   * Annotation value for video object detection and tracking case.
   * @param videoObjectTrackingAnnotation videoObjectTrackingAnnotation or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationValue setVideoObjectTrackingAnnotation(GoogleCloudDatalabelingV1beta1VideoObjectTrackingAnnotation videoObjectTrackingAnnotation) {
    this.videoObjectTrackingAnnotation = videoObjectTrackingAnnotation;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1beta1AnnotationValue set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1beta1AnnotationValue) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1beta1AnnotationValue clone() {
    return (GoogleCloudDatalabelingV1beta1AnnotationValue) super.clone();
  }

}