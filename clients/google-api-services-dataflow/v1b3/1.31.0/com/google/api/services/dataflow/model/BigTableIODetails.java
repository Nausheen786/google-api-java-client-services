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

package com.google.api.services.dataflow.model;

/**
 * Metadata for a Cloud BigTable connector used by the job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BigTableIODetails extends com.google.api.client.json.GenericJson {

  /**
   * InstanceId accessed in the connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceId;

  /**
   * ProjectId accessed in the connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * TableId accessed in the connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tableId;

  /**
   * InstanceId accessed in the connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceId() {
    return instanceId;
  }

  /**
   * InstanceId accessed in the connection.
   * @param instanceId instanceId or {@code null} for none
   */
  public BigTableIODetails setInstanceId(java.lang.String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * ProjectId accessed in the connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * ProjectId accessed in the connection.
   * @param projectId projectId or {@code null} for none
   */
  public BigTableIODetails setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * TableId accessed in the connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getTableId() {
    return tableId;
  }

  /**
   * TableId accessed in the connection.
   * @param tableId tableId or {@code null} for none
   */
  public BigTableIODetails setTableId(java.lang.String tableId) {
    this.tableId = tableId;
    return this;
  }

  @Override
  public BigTableIODetails set(String fieldName, Object value) {
    return (BigTableIODetails) super.set(fieldName, value);
  }

  @Override
  public BigTableIODetails clone() {
    return (BigTableIODetails) super.clone();
  }

}
