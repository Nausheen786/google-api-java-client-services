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

package com.google.api.services.binaryauthorization.v1beta1.model;

/**
 * Model definition for Jwt.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Binary Authorization API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Jwt extends com.google.api.client.json.GenericJson {

  /**
   * The compact encoding of a JWS, which is always three base64 encoded strings joined by periods.
   * For details, see: https://tools.ietf.org/html/rfc7515.html#section-3.1
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String compactJwt;

  /**
   * The compact encoding of a JWS, which is always three base64 encoded strings joined by periods.
   * For details, see: https://tools.ietf.org/html/rfc7515.html#section-3.1
   * @return value or {@code null} for none
   */
  public java.lang.String getCompactJwt() {
    return compactJwt;
  }

  /**
   * The compact encoding of a JWS, which is always three base64 encoded strings joined by periods.
   * For details, see: https://tools.ietf.org/html/rfc7515.html#section-3.1
   * @param compactJwt compactJwt or {@code null} for none
   */
  public Jwt setCompactJwt(java.lang.String compactJwt) {
    this.compactJwt = compactJwt;
    return this;
  }

  @Override
  public Jwt set(String fieldName, Object value) {
    return (Jwt) super.set(fieldName, value);
  }

  @Override
  public Jwt clone() {
    return (Jwt) super.clone();
  }

}