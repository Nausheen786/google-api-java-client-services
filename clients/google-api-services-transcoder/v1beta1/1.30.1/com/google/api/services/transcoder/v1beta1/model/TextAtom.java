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

package com.google.api.services.transcoder.v1beta1.model;

/**
 * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TextAtom extends com.google.api.client.json.GenericJson {

  /**
   * List of `Job.inputs` that should be embedded in this atom. Only one input is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TextInput> inputs;

  /**
   * Required. The `EditAtom.key` that references atom with text inputs in the `Job.edit_list`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * List of `Job.inputs` that should be embedded in this atom. Only one input is supported.
   * @return value or {@code null} for none
   */
  public java.util.List<TextInput> getInputs() {
    return inputs;
  }

  /**
   * List of `Job.inputs` that should be embedded in this atom. Only one input is supported.
   * @param inputs inputs or {@code null} for none
   */
  public TextAtom setInputs(java.util.List<TextInput> inputs) {
    this.inputs = inputs;
    return this;
  }

  /**
   * Required. The `EditAtom.key` that references atom with text inputs in the `Job.edit_list`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Required. The `EditAtom.key` that references atom with text inputs in the `Job.edit_list`.
   * @param key key or {@code null} for none
   */
  public TextAtom setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  @Override
  public TextAtom set(String fieldName, Object value) {
    return (TextAtom) super.set(fieldName, value);
  }

  @Override
  public TextAtom clone() {
    return (TextAtom) super.clone();
  }

}