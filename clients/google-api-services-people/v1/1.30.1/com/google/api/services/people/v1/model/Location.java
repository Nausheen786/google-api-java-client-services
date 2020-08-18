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
 * A person's location.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Location extends com.google.api.client.json.GenericJson {

  /**
   * The building identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buildingId;

  /**
   * Whether the location is the current location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean current;

  /**
   * The individual desk location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deskCode;

  /**
   * The floor name or number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String floor;

  /**
   * The floor section in `floor_name`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String floorSection;

  /**
   * Metadata about the location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FieldMetadata metadata;

  /**
   * The type of the location. The type can be custom or one of these predefined values: * `desk` *
   * `grewUp`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The free-form value of the location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The building identifier.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuildingId() {
    return buildingId;
  }

  /**
   * The building identifier.
   * @param buildingId buildingId or {@code null} for none
   */
  public Location setBuildingId(java.lang.String buildingId) {
    this.buildingId = buildingId;
    return this;
  }

  /**
   * Whether the location is the current location.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCurrent() {
    return current;
  }

  /**
   * Whether the location is the current location.
   * @param current current or {@code null} for none
   */
  public Location setCurrent(java.lang.Boolean current) {
    this.current = current;
    return this;
  }

  /**
   * The individual desk location.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeskCode() {
    return deskCode;
  }

  /**
   * The individual desk location.
   * @param deskCode deskCode or {@code null} for none
   */
  public Location setDeskCode(java.lang.String deskCode) {
    this.deskCode = deskCode;
    return this;
  }

  /**
   * The floor name or number.
   * @return value or {@code null} for none
   */
  public java.lang.String getFloor() {
    return floor;
  }

  /**
   * The floor name or number.
   * @param floor floor or {@code null} for none
   */
  public Location setFloor(java.lang.String floor) {
    this.floor = floor;
    return this;
  }

  /**
   * The floor section in `floor_name`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFloorSection() {
    return floorSection;
  }

  /**
   * The floor section in `floor_name`.
   * @param floorSection floorSection or {@code null} for none
   */
  public Location setFloorSection(java.lang.String floorSection) {
    this.floorSection = floorSection;
    return this;
  }

  /**
   * Metadata about the location.
   * @return value or {@code null} for none
   */
  public FieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata about the location.
   * @param metadata metadata or {@code null} for none
   */
  public Location setMetadata(FieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The type of the location. The type can be custom or one of these predefined values: * `desk` *
   * `grewUp`
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the location. The type can be custom or one of these predefined values: * `desk` *
   * `grewUp`
   * @param type type or {@code null} for none
   */
  public Location setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The free-form value of the location.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The free-form value of the location.
   * @param value value or {@code null} for none
   */
  public Location setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public Location set(String fieldName, Object value) {
    return (Location) super.set(fieldName, value);
  }

  @Override
  public Location clone() {
    return (Location) super.clone();
  }

}