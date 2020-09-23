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

package com.google.api.services.apigateway.v1beta.model;

/**
 * A gRPC service definition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API Gateway API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApigatewayApiConfigGrpcServiceDefinition extends com.google.api.client.json.GenericJson {

  /**
   * Input only. File descriptor set, generated by protoc. To generate, use protoc with imports and
   * source info included. For an example test.proto file, the following command would put the value
   * in a new file named out.pb. $ protoc --include_imports --include_source_info test.proto -o
   * out.pb
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApigatewayApiConfigFile fileDescriptorSet;

  /**
   * Optional. Uncompiled proto files associated with the descriptor set, used for display purposes
   * (server-side compilation is not supported). These should match the inputs to 'protoc' command
   * used to generate file_descriptor_set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ApigatewayApiConfigFile> source;

  static {
    // hack to force ProGuard to consider ApigatewayApiConfigFile used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ApigatewayApiConfigFile.class);
  }

  /**
   * Input only. File descriptor set, generated by protoc. To generate, use protoc with imports and
   * source info included. For an example test.proto file, the following command would put the value
   * in a new file named out.pb. $ protoc --include_imports --include_source_info test.proto -o
   * out.pb
   * @return value or {@code null} for none
   */
  public ApigatewayApiConfigFile getFileDescriptorSet() {
    return fileDescriptorSet;
  }

  /**
   * Input only. File descriptor set, generated by protoc. To generate, use protoc with imports and
   * source info included. For an example test.proto file, the following command would put the value
   * in a new file named out.pb. $ protoc --include_imports --include_source_info test.proto -o
   * out.pb
   * @param fileDescriptorSet fileDescriptorSet or {@code null} for none
   */
  public ApigatewayApiConfigGrpcServiceDefinition setFileDescriptorSet(ApigatewayApiConfigFile fileDescriptorSet) {
    this.fileDescriptorSet = fileDescriptorSet;
    return this;
  }

  /**
   * Optional. Uncompiled proto files associated with the descriptor set, used for display purposes
   * (server-side compilation is not supported). These should match the inputs to 'protoc' command
   * used to generate file_descriptor_set.
   * @return value or {@code null} for none
   */
  public java.util.List<ApigatewayApiConfigFile> getSource() {
    return source;
  }

  /**
   * Optional. Uncompiled proto files associated with the descriptor set, used for display purposes
   * (server-side compilation is not supported). These should match the inputs to 'protoc' command
   * used to generate file_descriptor_set.
   * @param source source or {@code null} for none
   */
  public ApigatewayApiConfigGrpcServiceDefinition setSource(java.util.List<ApigatewayApiConfigFile> source) {
    this.source = source;
    return this;
  }

  @Override
  public ApigatewayApiConfigGrpcServiceDefinition set(String fieldName, Object value) {
    return (ApigatewayApiConfigGrpcServiceDefinition) super.set(fieldName, value);
  }

  @Override
  public ApigatewayApiConfigGrpcServiceDefinition clone() {
    return (ApigatewayApiConfigGrpcServiceDefinition) super.clone();
  }

}