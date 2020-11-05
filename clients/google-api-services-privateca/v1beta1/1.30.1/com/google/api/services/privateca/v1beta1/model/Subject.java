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

package com.google.api.services.privateca.v1beta1.model;

/**
 * Subject describes parts of a distinguished name that, in turn, describes the subject of the
 * certificate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Subject extends com.google.api.client.json.GenericJson {

  /**
   * The country code of the subject.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countryCode;

  /**
   * The locality or city of the subject.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locality;

  /**
   * The organization of the subject.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String organization;

  /**
   * The organizational_unit of the subject.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String organizationalUnit;

  /**
   * The postal code of the subject.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postalCode;

  /**
   * The province, territory, or regional state of the subject.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String province;

  /**
   * The street address of the subject.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String streetAddress;

  /**
   * The country code of the subject.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountryCode() {
    return countryCode;
  }

  /**
   * The country code of the subject.
   * @param countryCode countryCode or {@code null} for none
   */
  public Subject setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The locality or city of the subject.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocality() {
    return locality;
  }

  /**
   * The locality or city of the subject.
   * @param locality locality or {@code null} for none
   */
  public Subject setLocality(java.lang.String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * The organization of the subject.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrganization() {
    return organization;
  }

  /**
   * The organization of the subject.
   * @param organization organization or {@code null} for none
   */
  public Subject setOrganization(java.lang.String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * The organizational_unit of the subject.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrganizationalUnit() {
    return organizationalUnit;
  }

  /**
   * The organizational_unit of the subject.
   * @param organizationalUnit organizationalUnit or {@code null} for none
   */
  public Subject setOrganizationalUnit(java.lang.String organizationalUnit) {
    this.organizationalUnit = organizationalUnit;
    return this;
  }

  /**
   * The postal code of the subject.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostalCode() {
    return postalCode;
  }

  /**
   * The postal code of the subject.
   * @param postalCode postalCode or {@code null} for none
   */
  public Subject setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * The province, territory, or regional state of the subject.
   * @return value or {@code null} for none
   */
  public java.lang.String getProvince() {
    return province;
  }

  /**
   * The province, territory, or regional state of the subject.
   * @param province province or {@code null} for none
   */
  public Subject setProvince(java.lang.String province) {
    this.province = province;
    return this;
  }

  /**
   * The street address of the subject.
   * @return value or {@code null} for none
   */
  public java.lang.String getStreetAddress() {
    return streetAddress;
  }

  /**
   * The street address of the subject.
   * @param streetAddress streetAddress or {@code null} for none
   */
  public Subject setStreetAddress(java.lang.String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  @Override
  public Subject set(String fieldName, Object value) {
    return (Subject) super.set(fieldName, value);
  }

  @Override
  public Subject clone() {
    return (Subject) super.clone();
  }

}