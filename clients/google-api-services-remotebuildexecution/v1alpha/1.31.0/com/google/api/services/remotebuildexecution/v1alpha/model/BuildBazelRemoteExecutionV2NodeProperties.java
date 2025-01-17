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

package com.google.api.services.remotebuildexecution.v1alpha.model;

/**
 * Node properties for FileNodes, DirectoryNodes, and SymlinkNodes. The server is responsible for
 * specifying the properties that it accepts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildBazelRemoteExecutionV2NodeProperties extends com.google.api.client.json.GenericJson {

  /**
   * The file's last modification timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String mtime;

  /**
   * A list of string-based NodeProperties.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BuildBazelRemoteExecutionV2NodeProperty> properties;

  /**
   * The UNIX file mode, e.g., 0755.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long unixMode;

  /**
   * The file's last modification timestamp.
   * @return value or {@code null} for none
   */
  public String getMtime() {
    return mtime;
  }

  /**
   * The file's last modification timestamp.
   * @param mtime mtime or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2NodeProperties setMtime(String mtime) {
    this.mtime = mtime;
    return this;
  }

  /**
   * A list of string-based NodeProperties.
   * @return value or {@code null} for none
   */
  public java.util.List<BuildBazelRemoteExecutionV2NodeProperty> getProperties() {
    return properties;
  }

  /**
   * A list of string-based NodeProperties.
   * @param properties properties or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2NodeProperties setProperties(java.util.List<BuildBazelRemoteExecutionV2NodeProperty> properties) {
    this.properties = properties;
    return this;
  }

  /**
   * The UNIX file mode, e.g., 0755.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUnixMode() {
    return unixMode;
  }

  /**
   * The UNIX file mode, e.g., 0755.
   * @param unixMode unixMode or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2NodeProperties setUnixMode(java.lang.Long unixMode) {
    this.unixMode = unixMode;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2NodeProperties set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2NodeProperties) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2NodeProperties clone() {
    return (BuildBazelRemoteExecutionV2NodeProperties) super.clone();
  }

}
