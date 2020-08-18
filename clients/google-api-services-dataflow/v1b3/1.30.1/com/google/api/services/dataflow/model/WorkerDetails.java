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
 * Information about a worker
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkerDetails extends com.google.api.client.json.GenericJson {

  /**
   * Work items processed by this worker, sorted by time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WorkItemDetails> workItems;

  static {
    // hack to force ProGuard to consider WorkItemDetails used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(WorkItemDetails.class);
  }

  /**
   * Name of this worker
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workerName;

  /**
   * Work items processed by this worker, sorted by time.
   * @return value or {@code null} for none
   */
  public java.util.List<WorkItemDetails> getWorkItems() {
    return workItems;
  }

  /**
   * Work items processed by this worker, sorted by time.
   * @param workItems workItems or {@code null} for none
   */
  public WorkerDetails setWorkItems(java.util.List<WorkItemDetails> workItems) {
    this.workItems = workItems;
    return this;
  }

  /**
   * Name of this worker
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkerName() {
    return workerName;
  }

  /**
   * Name of this worker
   * @param workerName workerName or {@code null} for none
   */
  public WorkerDetails setWorkerName(java.lang.String workerName) {
    this.workerName = workerName;
    return this;
  }

  @Override
  public WorkerDetails set(String fieldName, Object value) {
    return (WorkerDetails) super.set(fieldName, value);
  }

  @Override
  public WorkerDetails clone() {
    return (WorkerDetails) super.clone();
  }

}