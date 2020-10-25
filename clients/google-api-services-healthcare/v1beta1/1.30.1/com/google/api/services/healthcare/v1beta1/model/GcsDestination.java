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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * The Cloud Storage output destination. The Cloud Healthcare Service Agent requires the
 * `roles/storage.objectAdmin` Cloud IAM roles on the Cloud Storage location.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GcsDestination extends com.google.api.client.json.GenericJson {

  /**
   * The format of the exported HL7v2 message files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentStructure;

  /**
   * Specifies the parts of the Message resource to include in the export. If not specified, FULL is
   * used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String messageView;

  /**
   * URI of an existing Cloud Storage directory where the server writes result files, in the format
   * `gs://{bucket-id}/{path/to/destination/dir}`. If there is no trailing slash, the service
   * appends one when composing the object path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uriPrefix;

  /**
   * The format of the exported HL7v2 message files.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentStructure() {
    return contentStructure;
  }

  /**
   * The format of the exported HL7v2 message files.
   * @param contentStructure contentStructure or {@code null} for none
   */
  public GcsDestination setContentStructure(java.lang.String contentStructure) {
    this.contentStructure = contentStructure;
    return this;
  }

  /**
   * Specifies the parts of the Message resource to include in the export. If not specified, FULL is
   * used.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessageView() {
    return messageView;
  }

  /**
   * Specifies the parts of the Message resource to include in the export. If not specified, FULL is
   * used.
   * @param messageView messageView or {@code null} for none
   */
  public GcsDestination setMessageView(java.lang.String messageView) {
    this.messageView = messageView;
    return this;
  }

  /**
   * URI of an existing Cloud Storage directory where the server writes result files, in the format
   * `gs://{bucket-id}/{path/to/destination/dir}`. If there is no trailing slash, the service
   * appends one when composing the object path.
   * @return value or {@code null} for none
   */
  public java.lang.String getUriPrefix() {
    return uriPrefix;
  }

  /**
   * URI of an existing Cloud Storage directory where the server writes result files, in the format
   * `gs://{bucket-id}/{path/to/destination/dir}`. If there is no trailing slash, the service
   * appends one when composing the object path.
   * @param uriPrefix uriPrefix or {@code null} for none
   */
  public GcsDestination setUriPrefix(java.lang.String uriPrefix) {
    this.uriPrefix = uriPrefix;
    return this;
  }

  @Override
  public GcsDestination set(String fieldName, Object value) {
    return (GcsDestination) super.set(fieldName, value);
  }

  @Override
  public GcsDestination clone() {
    return (GcsDestination) super.clone();
  }

}