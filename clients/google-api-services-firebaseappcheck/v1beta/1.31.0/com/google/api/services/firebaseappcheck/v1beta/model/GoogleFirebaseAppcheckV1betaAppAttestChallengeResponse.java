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

package com.google.api.services.firebaseappcheck.v1beta.model;

/**
 * Response object for GenerateAppAttestChallenge
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Check API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseAppcheckV1betaAppAttestChallengeResponse extends com.google.api.client.json.GenericJson {

  /**
   * A one time use challenge for the client to pass to Apple's App Attest API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String challenge;

  /**
   * The duration from the time this challenge is minted until it is expired. This field is intended
   * to ease client-side token management, since the device may have clock skew, but is still able
   * to accurately measure a duration. This expiration is intended to minimize the replay window
   * within which a single challenge may be reused. See AIP 142 for naming of this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String ttl;

  /**
   * A one time use challenge for the client to pass to Apple's App Attest API.
   * @see #decodeChallenge()
   * @return value or {@code null} for none
   */
  public java.lang.String getChallenge() {
    return challenge;
  }

  /**
   * A one time use challenge for the client to pass to Apple's App Attest API.
   * @see #getChallenge()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeChallenge() {
    return com.google.api.client.util.Base64.decodeBase64(challenge);
  }

  /**
   * A one time use challenge for the client to pass to Apple's App Attest API.
   * @see #encodeChallenge()
   * @param challenge challenge or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaAppAttestChallengeResponse setChallenge(java.lang.String challenge) {
    this.challenge = challenge;
    return this;
  }

  /**
   * A one time use challenge for the client to pass to Apple's App Attest API.
   * @see #setChallenge()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleFirebaseAppcheckV1betaAppAttestChallengeResponse encodeChallenge(byte[] challenge) {
    this.challenge = com.google.api.client.util.Base64.encodeBase64URLSafeString(challenge);
    return this;
  }

  /**
   * The duration from the time this challenge is minted until it is expired. This field is intended
   * to ease client-side token management, since the device may have clock skew, but is still able
   * to accurately measure a duration. This expiration is intended to minimize the replay window
   * within which a single challenge may be reused. See AIP 142 for naming of this field.
   * @return value or {@code null} for none
   */
  public String getTtl() {
    return ttl;
  }

  /**
   * The duration from the time this challenge is minted until it is expired. This field is intended
   * to ease client-side token management, since the device may have clock skew, but is still able
   * to accurately measure a duration. This expiration is intended to minimize the replay window
   * within which a single challenge may be reused. See AIP 142 for naming of this field.
   * @param ttl ttl or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaAppAttestChallengeResponse setTtl(String ttl) {
    this.ttl = ttl;
    return this;
  }

  @Override
  public GoogleFirebaseAppcheckV1betaAppAttestChallengeResponse set(String fieldName, Object value) {
    return (GoogleFirebaseAppcheckV1betaAppAttestChallengeResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppcheckV1betaAppAttestChallengeResponse clone() {
    return (GoogleFirebaseAppcheckV1betaAppAttestChallengeResponse) super.clone();
  }

}
