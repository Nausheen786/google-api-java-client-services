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

package com.google.api.services.notebooks.v1.model;

/**
 * The definition of a single executed notebook.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Notebooks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Execution extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Time the Execution was instantiated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * A brief description of this execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. Name used for UI purposes. Name can only contain alphanumeric characters and
   * underscores '_'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * execute metadata including name, hardware spec, region, labels, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExecutionTemplate executionTemplate;

  /**
   * Output only. The URI of the external job used to execute the notebook.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobUri;

  /**
   * Output only. The resource name of the execute. Format:
   * `projects/{project_id}/locations/{location}/execution/{execution_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output notebook file generated by this execution
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputNotebookFile;

  /**
   * Output only. State of the underlying AI Platform job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Time the Execution was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Time the Execution was instantiated.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time the Execution was instantiated.
   * @param createTime createTime or {@code null} for none
   */
  public Execution setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * A brief description of this execution.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A brief description of this execution.
   * @param description description or {@code null} for none
   */
  public Execution setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. Name used for UI purposes. Name can only contain alphanumeric characters and
   * underscores '_'.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. Name used for UI purposes. Name can only contain alphanumeric characters and
   * underscores '_'.
   * @param displayName displayName or {@code null} for none
   */
  public Execution setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * execute metadata including name, hardware spec, region, labels, etc.
   * @return value or {@code null} for none
   */
  public ExecutionTemplate getExecutionTemplate() {
    return executionTemplate;
  }

  /**
   * execute metadata including name, hardware spec, region, labels, etc.
   * @param executionTemplate executionTemplate or {@code null} for none
   */
  public Execution setExecutionTemplate(ExecutionTemplate executionTemplate) {
    this.executionTemplate = executionTemplate;
    return this;
  }

  /**
   * Output only. The URI of the external job used to execute the notebook.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobUri() {
    return jobUri;
  }

  /**
   * Output only. The URI of the external job used to execute the notebook.
   * @param jobUri jobUri or {@code null} for none
   */
  public Execution setJobUri(java.lang.String jobUri) {
    this.jobUri = jobUri;
    return this;
  }

  /**
   * Output only. The resource name of the execute. Format:
   * `projects/{project_id}/locations/{location}/execution/{execution_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the execute. Format:
   * `projects/{project_id}/locations/{location}/execution/{execution_id}
   * @param name name or {@code null} for none
   */
  public Execution setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output notebook file generated by this execution
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputNotebookFile() {
    return outputNotebookFile;
  }

  /**
   * Output notebook file generated by this execution
   * @param outputNotebookFile outputNotebookFile or {@code null} for none
   */
  public Execution setOutputNotebookFile(java.lang.String outputNotebookFile) {
    this.outputNotebookFile = outputNotebookFile;
    return this;
  }

  /**
   * Output only. State of the underlying AI Platform job.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the underlying AI Platform job.
   * @param state state or {@code null} for none
   */
  public Execution setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Time the Execution was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time the Execution was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Execution setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Execution set(String fieldName, Object value) {
    return (Execution) super.set(fieldName, value);
  }

  @Override
  public Execution clone() {
    return (Execution) super.clone();
  }

}
