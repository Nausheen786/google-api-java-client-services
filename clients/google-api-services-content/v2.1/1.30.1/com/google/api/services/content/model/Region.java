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

package com.google.api.services.content.model;

/**
 * Represents a geographic region that you can use as a target with both the `RegionalInventory` and
 * `ShippingSettings` services. You can define regions as collections of either postal codes or, in
 * some countries, using predefined geotargets.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Region extends com.google.api.client.json.GenericJson {

  /**
   * The display name of the region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * A list of geotargets that defines the region area.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RegionGeoTargetArea geotargetArea;

  /**
   * Output only. Immutable. Merchant that owns the region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long merchantId;

  /**
   * A list of postal codes that defines the region area.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RegionPostalCodeArea postalCodeArea;

  /**
   * Output only. Immutable. The ID uniquely identifying each region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionId;

  /**
   * Output only. Indicates if the region is eligible to use in the Regional Inventory
   * configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean regionalInventoryEligible;

  /**
   * Output only. Indicates if the region is eligible to use in the Shipping Services configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean shippingEligible;

  /**
   * The display name of the region.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the region.
   * @param displayName displayName or {@code null} for none
   */
  public Region setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * A list of geotargets that defines the region area.
   * @return value or {@code null} for none
   */
  public RegionGeoTargetArea getGeotargetArea() {
    return geotargetArea;
  }

  /**
   * A list of geotargets that defines the region area.
   * @param geotargetArea geotargetArea or {@code null} for none
   */
  public Region setGeotargetArea(RegionGeoTargetArea geotargetArea) {
    this.geotargetArea = geotargetArea;
    return this;
  }

  /**
   * Output only. Immutable. Merchant that owns the region.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMerchantId() {
    return merchantId;
  }

  /**
   * Output only. Immutable. Merchant that owns the region.
   * @param merchantId merchantId or {@code null} for none
   */
  public Region setMerchantId(java.lang.Long merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * A list of postal codes that defines the region area.
   * @return value or {@code null} for none
   */
  public RegionPostalCodeArea getPostalCodeArea() {
    return postalCodeArea;
  }

  /**
   * A list of postal codes that defines the region area.
   * @param postalCodeArea postalCodeArea or {@code null} for none
   */
  public Region setPostalCodeArea(RegionPostalCodeArea postalCodeArea) {
    this.postalCodeArea = postalCodeArea;
    return this;
  }

  /**
   * Output only. Immutable. The ID uniquely identifying each region.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionId() {
    return regionId;
  }

  /**
   * Output only. Immutable. The ID uniquely identifying each region.
   * @param regionId regionId or {@code null} for none
   */
  public Region setRegionId(java.lang.String regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * Output only. Indicates if the region is eligible to use in the Regional Inventory
   * configuration.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRegionalInventoryEligible() {
    return regionalInventoryEligible;
  }

  /**
   * Output only. Indicates if the region is eligible to use in the Regional Inventory
   * configuration.
   * @param regionalInventoryEligible regionalInventoryEligible or {@code null} for none
   */
  public Region setRegionalInventoryEligible(java.lang.Boolean regionalInventoryEligible) {
    this.regionalInventoryEligible = regionalInventoryEligible;
    return this;
  }

  /**
   * Output only. Indicates if the region is eligible to use in the Shipping Services configuration.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getShippingEligible() {
    return shippingEligible;
  }

  /**
   * Output only. Indicates if the region is eligible to use in the Shipping Services configuration.
   * @param shippingEligible shippingEligible or {@code null} for none
   */
  public Region setShippingEligible(java.lang.Boolean shippingEligible) {
    this.shippingEligible = shippingEligible;
    return this;
  }

  @Override
  public Region set(String fieldName, Object value) {
    return (Region) super.set(fieldName, value);
  }

  @Override
  public Region clone() {
    return (Region) super.clone();
  }

}