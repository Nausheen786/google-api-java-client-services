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

package com.google.api.services.osconfig.v1beta.model;

/**
 * The inventory details of a VM.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Inventory extends com.google.api.client.json.GenericJson {

  /**
   * Inventory items related to the VM keyed by an opaque unique identifier for each inventory item.
   * The identifier is unique to each distinct and addressable inventory item and will change, when
   * there is a new package version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, InventoryItem> items;

  /**
   * Base level operating system information for the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InventoryOsInfo osInfo;

  /**
   * Inventory items related to the VM keyed by an opaque unique identifier for each inventory item.
   * The identifier is unique to each distinct and addressable inventory item and will change, when
   * there is a new package version.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, InventoryItem> getItems() {
    return items;
  }

  /**
   * Inventory items related to the VM keyed by an opaque unique identifier for each inventory item.
   * The identifier is unique to each distinct and addressable inventory item and will change, when
   * there is a new package version.
   * @param items items or {@code null} for none
   */
  public Inventory setItems(java.util.Map<String, InventoryItem> items) {
    this.items = items;
    return this;
  }

  /**
   * Base level operating system information for the VM.
   * @return value or {@code null} for none
   */
  public InventoryOsInfo getOsInfo() {
    return osInfo;
  }

  /**
   * Base level operating system information for the VM.
   * @param osInfo osInfo or {@code null} for none
   */
  public Inventory setOsInfo(InventoryOsInfo osInfo) {
    this.osInfo = osInfo;
    return this;
  }

  @Override
  public Inventory set(String fieldName, Object value) {
    return (Inventory) super.set(fieldName, value);
  }

  @Override
  public Inventory clone() {
    return (Inventory) super.clone();
  }

}