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

package com.google.api.services.documentai.v1beta3.model;

/**
 * Referencing the visual context of the entity in the Document.pages. Page anchors can be cross-
 * page, consist of multiple bounding polygons and optionally reference specific layout element
 * types.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta2DocumentPageAnchor extends com.google.api.client.json.GenericJson {

  /**
   * One or more references to visual page elements
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageAnchorPageRef> pageRefs;

  /**
   * One or more references to visual page elements
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageAnchorPageRef> getPageRefs() {
    return pageRefs;
  }

  /**
   * One or more references to visual page elements
   * @param pageRefs pageRefs or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageAnchor setPageRefs(java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageAnchorPageRef> pageRefs) {
    this.pageRefs = pageRefs;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentPageAnchor set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2DocumentPageAnchor) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentPageAnchor clone() {
    return (GoogleCloudDocumentaiV1beta2DocumentPageAnchor) super.clone();
  }

}