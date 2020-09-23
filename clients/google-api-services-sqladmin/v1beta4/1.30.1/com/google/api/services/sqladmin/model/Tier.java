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

package com.google.api.services.sqladmin.model;

/**
 * A Google Cloud SQL service tier resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Tier extends com.google.api.client.json.GenericJson {

  /**
   * The maximum disk size of this tier in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("DiskQuota") @com.google.api.client.json.JsonString
  private java.lang.Long diskQuota;

  /**
   * The maximum RAM usage of this tier in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("RAM") @com.google.api.client.json.JsonString
  private java.lang.Long rAM;

  /**
   * This is always *sql#tier*.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The applicable regions for this tier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> region;

  /**
   * An identifier for the machine type, for example, db-n1-standard-1. For related information, see
   * Pricing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tier;

  /**
   * The maximum disk size of this tier in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDiskQuota() {
    return diskQuota;
  }

  /**
   * The maximum disk size of this tier in bytes.
   * @param diskQuota diskQuota or {@code null} for none
   */
  public Tier setDiskQuota(java.lang.Long diskQuota) {
    this.diskQuota = diskQuota;
    return this;
  }

  /**
   * The maximum RAM usage of this tier in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRAM() {
    return rAM;
  }

  /**
   * The maximum RAM usage of this tier in bytes.
   * @param rAM rAM or {@code null} for none
   */
  public Tier setRAM(java.lang.Long rAM) {
    this.rAM = rAM;
    return this;
  }

  /**
   * This is always *sql#tier*.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always *sql#tier*.
   * @param kind kind or {@code null} for none
   */
  public Tier setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The applicable regions for this tier.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRegion() {
    return region;
  }

  /**
   * The applicable regions for this tier.
   * @param region region or {@code null} for none
   */
  public Tier setRegion(java.util.List<java.lang.String> region) {
    this.region = region;
    return this;
  }

  /**
   * An identifier for the machine type, for example, db-n1-standard-1. For related information, see
   * Pricing.
   * @return value or {@code null} for none
   */
  public java.lang.String getTier() {
    return tier;
  }

  /**
   * An identifier for the machine type, for example, db-n1-standard-1. For related information, see
   * Pricing.
   * @param tier tier or {@code null} for none
   */
  public Tier setTier(java.lang.String tier) {
    this.tier = tier;
    return this;
  }

  @Override
  public Tier set(String fieldName, Object value) {
    return (Tier) super.set(fieldName, value);
  }

  @Override
  public Tier clone() {
    return (Tier) super.clone();
  }

}