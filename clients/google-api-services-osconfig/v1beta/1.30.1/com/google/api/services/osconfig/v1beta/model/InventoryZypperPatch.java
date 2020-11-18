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

package com.google.api.services.osconfig.v1beta.model;

/**
 * Details related to a Zypper Patch.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InventoryZypperPatch extends com.google.api.client.json.GenericJson {

  /**
   * The category of the patch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * The name of the patch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String patchName;

  /**
   * The severity specified for this patch
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * Any summary information provided about this patch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String summary;

  /**
   * The category of the patch.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * The category of the patch.
   * @param category category or {@code null} for none
   */
  public InventoryZypperPatch setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * The name of the patch.
   * @return value or {@code null} for none
   */
  public java.lang.String getPatchName() {
    return patchName;
  }

  /**
   * The name of the patch.
   * @param patchName patchName or {@code null} for none
   */
  public InventoryZypperPatch setPatchName(java.lang.String patchName) {
    this.patchName = patchName;
    return this;
  }

  /**
   * The severity specified for this patch
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * The severity specified for this patch
   * @param severity severity or {@code null} for none
   */
  public InventoryZypperPatch setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Any summary information provided about this patch.
   * @return value or {@code null} for none
   */
  public java.lang.String getSummary() {
    return summary;
  }

  /**
   * Any summary information provided about this patch.
   * @param summary summary or {@code null} for none
   */
  public InventoryZypperPatch setSummary(java.lang.String summary) {
    this.summary = summary;
    return this;
  }

  @Override
  public InventoryZypperPatch set(String fieldName, Object value) {
    return (InventoryZypperPatch) super.set(fieldName, value);
  }

  @Override
  public InventoryZypperPatch clone() {
    return (InventoryZypperPatch) super.clone();
  }

}