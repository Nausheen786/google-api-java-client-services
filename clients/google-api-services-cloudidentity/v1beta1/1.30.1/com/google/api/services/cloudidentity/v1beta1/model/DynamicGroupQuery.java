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

package com.google.api.services.cloudidentity.v1beta1.model;

/**
 * Defines a query on a resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DynamicGroupQuery extends com.google.api.client.json.GenericJson {

  /**
   * Query that determines the memberships of the dynamic group. Examples: All users with at least
   * one `organizations.department` of engineering. `user.organizations.exists(org,
   * org.department=='engineering')` All users with at least one location that has `area` of `foo`
   * and `building_id` of `bar`. `user.locations.exists(loc, loc.area=='foo' &&
   * loc.building_id=='bar')`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceType;

  /**
   * Query that determines the memberships of the dynamic group. Examples: All users with at least
   * one `organizations.department` of engineering. `user.organizations.exists(org,
   * org.department=='engineering')` All users with at least one location that has `area` of `foo`
   * and `building_id` of `bar`. `user.locations.exists(loc, loc.area=='foo' &&
   * loc.building_id=='bar')`
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Query that determines the memberships of the dynamic group. Examples: All users with at least
   * one `organizations.department` of engineering. `user.organizations.exists(org,
   * org.department=='engineering')` All users with at least one location that has `area` of `foo`
   * and `building_id` of `bar`. `user.locations.exists(loc, loc.area=='foo' &&
   * loc.building_id=='bar')`
   * @param query query or {@code null} for none
   */
  public DynamicGroupQuery setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceType() {
    return resourceType;
  }

  /**
   * @param resourceType resourceType or {@code null} for none
   */
  public DynamicGroupQuery setResourceType(java.lang.String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  @Override
  public DynamicGroupQuery set(String fieldName, Object value) {
    return (DynamicGroupQuery) super.set(fieldName, value);
  }

  @Override
  public DynamicGroupQuery clone() {
    return (DynamicGroupQuery) super.clone();
  }

}