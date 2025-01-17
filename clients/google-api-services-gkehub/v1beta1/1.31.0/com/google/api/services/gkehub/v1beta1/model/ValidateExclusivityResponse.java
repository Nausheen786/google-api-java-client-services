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

package com.google.api.services.gkehub.v1beta1.model;

/**
 * The response of exclusivity artifacts validation result status.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ValidateExclusivityResponse extends com.google.api.client.json.GenericJson {

  /**
   * The validation result. * `OK` means that exclusivity is validated, assuming the manifest
   * produced by GenerateExclusivityManifest is successfully applied. * `ALREADY_EXISTS` means that
   * the Membership CRD is already owned by another Hub. See `status.message` for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleRpcStatus status;

  /**
   * The validation result. * `OK` means that exclusivity is validated, assuming the manifest
   * produced by GenerateExclusivityManifest is successfully applied. * `ALREADY_EXISTS` means that
   * the Membership CRD is already owned by another Hub. See `status.message` for more information.
   * @return value or {@code null} for none
   */
  public GoogleRpcStatus getStatus() {
    return status;
  }

  /**
   * The validation result. * `OK` means that exclusivity is validated, assuming the manifest
   * produced by GenerateExclusivityManifest is successfully applied. * `ALREADY_EXISTS` means that
   * the Membership CRD is already owned by another Hub. See `status.message` for more information.
   * @param status status or {@code null} for none
   */
  public ValidateExclusivityResponse setStatus(GoogleRpcStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public ValidateExclusivityResponse set(String fieldName, Object value) {
    return (ValidateExclusivityResponse) super.set(fieldName, value);
  }

  @Override
  public ValidateExclusivityResponse clone() {
    return (ValidateExclusivityResponse) super.clone();
  }

}
