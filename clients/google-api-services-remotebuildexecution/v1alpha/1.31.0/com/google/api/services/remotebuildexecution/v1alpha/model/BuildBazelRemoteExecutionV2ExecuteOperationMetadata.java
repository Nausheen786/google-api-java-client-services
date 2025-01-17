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
 * Metadata about an ongoing execution, which will be contained in the metadata field of the
 * Operation.
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
public final class BuildBazelRemoteExecutionV2ExecuteOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The digest of the Action being executed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildBazelRemoteExecutionV2Digest actionDigest;

  /**
   * The current stage of execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stage;

  /**
   * If set, the client can use this resource name with ByteStream.Read to stream the standard error
   * from the endpoint hosting streamed responses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stderrStreamName;

  /**
   * If set, the client can use this resource name with ByteStream.Read to stream the standard
   * output from the endpoint hosting streamed responses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stdoutStreamName;

  /**
   * The digest of the Action being executed.
   * @return value or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2Digest getActionDigest() {
    return actionDigest;
  }

  /**
   * The digest of the Action being executed.
   * @param actionDigest actionDigest or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecuteOperationMetadata setActionDigest(BuildBazelRemoteExecutionV2Digest actionDigest) {
    this.actionDigest = actionDigest;
    return this;
  }

  /**
   * The current stage of execution.
   * @return value or {@code null} for none
   */
  public java.lang.String getStage() {
    return stage;
  }

  /**
   * The current stage of execution.
   * @param stage stage or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecuteOperationMetadata setStage(java.lang.String stage) {
    this.stage = stage;
    return this;
  }

  /**
   * If set, the client can use this resource name with ByteStream.Read to stream the standard error
   * from the endpoint hosting streamed responses.
   * @return value or {@code null} for none
   */
  public java.lang.String getStderrStreamName() {
    return stderrStreamName;
  }

  /**
   * If set, the client can use this resource name with ByteStream.Read to stream the standard error
   * from the endpoint hosting streamed responses.
   * @param stderrStreamName stderrStreamName or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecuteOperationMetadata setStderrStreamName(java.lang.String stderrStreamName) {
    this.stderrStreamName = stderrStreamName;
    return this;
  }

  /**
   * If set, the client can use this resource name with ByteStream.Read to stream the standard
   * output from the endpoint hosting streamed responses.
   * @return value or {@code null} for none
   */
  public java.lang.String getStdoutStreamName() {
    return stdoutStreamName;
  }

  /**
   * If set, the client can use this resource name with ByteStream.Read to stream the standard
   * output from the endpoint hosting streamed responses.
   * @param stdoutStreamName stdoutStreamName or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecuteOperationMetadata setStdoutStreamName(java.lang.String stdoutStreamName) {
    this.stdoutStreamName = stdoutStreamName;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2ExecuteOperationMetadata set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2ExecuteOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2ExecuteOperationMetadata clone() {
    return (BuildBazelRemoteExecutionV2ExecuteOperationMetadata) super.clone();
  }

}
