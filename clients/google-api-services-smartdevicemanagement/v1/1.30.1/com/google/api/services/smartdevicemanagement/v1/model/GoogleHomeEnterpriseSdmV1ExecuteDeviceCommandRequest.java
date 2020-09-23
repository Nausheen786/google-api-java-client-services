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

package com.google.api.services.smartdevicemanagement.v1.model;

/**
 * Request message for SmartDeviceManagementService.ExecuteDeviceCommand
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Smart Device Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest extends com.google.api.client.json.GenericJson {

  /**
   * The command name to execute, represented by the fully qualified protobuf message name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String command;

  /**
   * The command message to execute, represented as a Struct.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> params;

  /**
   * The command name to execute, represented by the fully qualified protobuf message name.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommand() {
    return command;
  }

  /**
   * The command name to execute, represented by the fully qualified protobuf message name.
   * @param command command or {@code null} for none
   */
  public GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest setCommand(java.lang.String command) {
    this.command = command;
    return this;
  }

  /**
   * The command message to execute, represented as a Struct.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getParams() {
    return params;
  }

  /**
   * The command message to execute, represented as a Struct.
   * @param params params or {@code null} for none
   */
  public GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest setParams(java.util.Map<String, java.lang.Object> params) {
    this.params = params;
    return this;
  }

  @Override
  public GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest set(String fieldName, Object value) {
    return (GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest clone() {
    return (GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest) super.clone();
  }

}