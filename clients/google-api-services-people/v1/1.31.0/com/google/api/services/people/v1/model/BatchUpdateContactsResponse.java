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

package com.google.api.services.people.v1.model;

/**
 * The response to a request to create a batch of contacts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchUpdateContactsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A map of resource names to the contacts that were updated, unless the request `read_mask` is
   * empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, PersonResponse> updateResult;

  /**
   * A map of resource names to the contacts that were updated, unless the request `read_mask` is
   * empty.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, PersonResponse> getUpdateResult() {
    return updateResult;
  }

  /**
   * A map of resource names to the contacts that were updated, unless the request `read_mask` is
   * empty.
   * @param updateResult updateResult or {@code null} for none
   */
  public BatchUpdateContactsResponse setUpdateResult(java.util.Map<String, PersonResponse> updateResult) {
    this.updateResult = updateResult;
    return this;
  }

  @Override
  public BatchUpdateContactsResponse set(String fieldName, Object value) {
    return (BatchUpdateContactsResponse) super.set(fieldName, value);
  }

  @Override
  public BatchUpdateContactsResponse clone() {
    return (BatchUpdateContactsResponse) super.clone();
  }

}
