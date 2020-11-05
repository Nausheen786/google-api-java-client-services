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

package com.google.api.services.datamigration.v1beta1.model;

/**
 * Request message for 'GenerateSshScript' request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Database Migration API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GenerateSshScriptRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Bastion VM Instance name to use or to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vm;

  /**
   * The VM creation configuration
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VmCreationConfig vmCreationConfig;

  /**
   * The port that will be open on the bastion host
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer vmPort;

  /**
   * The VM selection configuration
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VmSelectionConfig vmSelectionConfig;

  /**
   * Required. Bastion VM Instance name to use or to create.
   * @return value or {@code null} for none
   */
  public java.lang.String getVm() {
    return vm;
  }

  /**
   * Required. Bastion VM Instance name to use or to create.
   * @param vm vm or {@code null} for none
   */
  public GenerateSshScriptRequest setVm(java.lang.String vm) {
    this.vm = vm;
    return this;
  }

  /**
   * The VM creation configuration
   * @return value or {@code null} for none
   */
  public VmCreationConfig getVmCreationConfig() {
    return vmCreationConfig;
  }

  /**
   * The VM creation configuration
   * @param vmCreationConfig vmCreationConfig or {@code null} for none
   */
  public GenerateSshScriptRequest setVmCreationConfig(VmCreationConfig vmCreationConfig) {
    this.vmCreationConfig = vmCreationConfig;
    return this;
  }

  /**
   * The port that will be open on the bastion host
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVmPort() {
    return vmPort;
  }

  /**
   * The port that will be open on the bastion host
   * @param vmPort vmPort or {@code null} for none
   */
  public GenerateSshScriptRequest setVmPort(java.lang.Integer vmPort) {
    this.vmPort = vmPort;
    return this;
  }

  /**
   * The VM selection configuration
   * @return value or {@code null} for none
   */
  public VmSelectionConfig getVmSelectionConfig() {
    return vmSelectionConfig;
  }

  /**
   * The VM selection configuration
   * @param vmSelectionConfig vmSelectionConfig or {@code null} for none
   */
  public GenerateSshScriptRequest setVmSelectionConfig(VmSelectionConfig vmSelectionConfig) {
    this.vmSelectionConfig = vmSelectionConfig;
    return this;
  }

  @Override
  public GenerateSshScriptRequest set(String fieldName, Object value) {
    return (GenerateSshScriptRequest) super.set(fieldName, value);
  }

  @Override
  public GenerateSshScriptRequest clone() {
    return (GenerateSshScriptRequest) super.clone();
  }

}