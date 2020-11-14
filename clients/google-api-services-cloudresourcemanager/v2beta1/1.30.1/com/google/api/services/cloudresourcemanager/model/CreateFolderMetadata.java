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

package com.google.api.services.cloudresourcemanager.model;

/**
 * Metadata pertaining to the Folder creation process.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateFolderMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The display name of the folder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The resource name of the folder or organization we are creating the folder under.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * The display name of the folder.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the folder.
   * @param displayName displayName or {@code null} for none
   */
  public CreateFolderMetadata setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The resource name of the folder or organization we are creating the folder under.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * The resource name of the folder or organization we are creating the folder under.
   * @param parent parent or {@code null} for none
   */
  public CreateFolderMetadata setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  @Override
  public CreateFolderMetadata set(String fieldName, Object value) {
    return (CreateFolderMetadata) super.set(fieldName, value);
  }

  @Override
  public CreateFolderMetadata clone() {
    return (CreateFolderMetadata) super.clone();
  }

}