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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Represents a Consent store.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConsentStore extends com.google.api.client.json.GenericJson {

  /**
   * Default time to live for consents in this store. Must be at least 24 hours. Updating this field
   * will not affect the expiration time of existing consents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String defaultConsentTtl;

  /**
   * If true, UpdateConsent creates the consent if it does not already exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableConsentCreateOnUpdate;

  /**
   * User-supplied key-value pairs used to organize Consent stores. Label keys must be between 1 and
   * 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the
   * following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values must be between 1 and 63
   * characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following
   * PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated
   * with a given store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Resource name of the Consent store, of the form `projects/{project_id}/locations/{location_id}/
   * datasets/{dataset_id}/consentStores/{consent_store_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Default time to live for consents in this store. Must be at least 24 hours. Updating this field
   * will not affect the expiration time of existing consents.
   * @return value or {@code null} for none
   */
  public String getDefaultConsentTtl() {
    return defaultConsentTtl;
  }

  /**
   * Default time to live for consents in this store. Must be at least 24 hours. Updating this field
   * will not affect the expiration time of existing consents.
   * @param defaultConsentTtl defaultConsentTtl or {@code null} for none
   */
  public ConsentStore setDefaultConsentTtl(String defaultConsentTtl) {
    this.defaultConsentTtl = defaultConsentTtl;
    return this;
  }

  /**
   * If true, UpdateConsent creates the consent if it does not already exist.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableConsentCreateOnUpdate() {
    return enableConsentCreateOnUpdate;
  }

  /**
   * If true, UpdateConsent creates the consent if it does not already exist.
   * @param enableConsentCreateOnUpdate enableConsentCreateOnUpdate or {@code null} for none
   */
  public ConsentStore setEnableConsentCreateOnUpdate(java.lang.Boolean enableConsentCreateOnUpdate) {
    this.enableConsentCreateOnUpdate = enableConsentCreateOnUpdate;
    return this;
  }

  /**
   * User-supplied key-value pairs used to organize Consent stores. Label keys must be between 1 and
   * 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the
   * following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values must be between 1 and 63
   * characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following
   * PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated
   * with a given store.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * User-supplied key-value pairs used to organize Consent stores. Label keys must be between 1 and
   * 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the
   * following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values must be between 1 and 63
   * characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following
   * PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated
   * with a given store.
   * @param labels labels or {@code null} for none
   */
  public ConsentStore setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Resource name of the Consent store, of the form `projects/{project_id}/locations/{location_id}/
   * datasets/{dataset_id}/consentStores/{consent_store_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name of the Consent store, of the form `projects/{project_id}/locations/{location_id}/
   * datasets/{dataset_id}/consentStores/{consent_store_id}`.
   * @param name name or {@code null} for none
   */
  public ConsentStore setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public ConsentStore set(String fieldName, Object value) {
    return (ConsentStore) super.set(fieldName, value);
  }

  @Override
  public ConsentStore clone() {
    return (ConsentStore) super.clone();
  }

}