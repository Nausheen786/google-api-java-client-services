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

package com.google.api.services.vault.v1.model;

/**
 * Additional options for Gmail search
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MailOptions extends com.google.api.client.json.GenericJson {

  /**
   * Set to **true** to exclude drafts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean excludeDrafts;

  /**
   * Set to **true** to exclude drafts.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExcludeDrafts() {
    return excludeDrafts;
  }

  /**
   * Set to **true** to exclude drafts.
   * @param excludeDrafts excludeDrafts or {@code null} for none
   */
  public MailOptions setExcludeDrafts(java.lang.Boolean excludeDrafts) {
    this.excludeDrafts = excludeDrafts;
    return this;
  }

  @Override
  public MailOptions set(String fieldName, Object value) {
    return (MailOptions) super.set(fieldName, value);
  }

  @Override
  public MailOptions clone() {
    return (MailOptions) super.clone();
  }

}
