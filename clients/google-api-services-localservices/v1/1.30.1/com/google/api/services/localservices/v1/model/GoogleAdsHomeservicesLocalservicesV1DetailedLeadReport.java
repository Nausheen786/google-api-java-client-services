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

package com.google.api.services.localservices.v1.model;

/**
 * A Detailed Lead Report of a lead identified by their lead id and contains consumer, account,
 * monetization, and lead data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Local Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport extends com.google.api.client.json.GenericJson {

  /**
   * Identifies account that received the lead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long accountId;

  /**
   * Aggregator specific information related to the lead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAdsHomeservicesLocalservicesV1AggregatorInfo aggregatorInfo;

  /**
   * Business name associated to the account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String businessName;

  /**
   * Whether the lead has been charged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String chargeStatus;

  /**
   * Currency code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * Dispute status related to the lead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String disputeStatus;

  /**
   * Location of the associated account's home city.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String geo;

  /**
   * Lead category (e.g. hvac, plumber)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String leadCategory;

  /**
   * Timestamp of when the lead was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String leadCreationTimestamp;

  /**
   * Unique identifier of a Detailed Lead Report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long leadId;

  /**
   * Price of the lead (available only after it has been charged).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double leadPrice;

  /**
   * Lead type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String leadType;

  /**
   * More information associated to only message leads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAdsHomeservicesLocalservicesV1MessageLead messageLead;

  /**
   * More information associated to only phone leads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAdsHomeservicesLocalservicesV1PhoneLead phoneLead;

  /**
   * Timezone of the particular provider associated to a lead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeTimeZone timezone;

  /**
   * Identifies account that received the lead.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAccountId() {
    return accountId;
  }

  /**
   * Identifies account that received the lead.
   * @param accountId accountId or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setAccountId(java.lang.Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Aggregator specific information related to the lead.
   * @return value or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1AggregatorInfo getAggregatorInfo() {
    return aggregatorInfo;
  }

  /**
   * Aggregator specific information related to the lead.
   * @param aggregatorInfo aggregatorInfo or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setAggregatorInfo(GoogleAdsHomeservicesLocalservicesV1AggregatorInfo aggregatorInfo) {
    this.aggregatorInfo = aggregatorInfo;
    return this;
  }

  /**
   * Business name associated to the account.
   * @return value or {@code null} for none
   */
  public java.lang.String getBusinessName() {
    return businessName;
  }

  /**
   * Business name associated to the account.
   * @param businessName businessName or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setBusinessName(java.lang.String businessName) {
    this.businessName = businessName;
    return this;
  }

  /**
   * Whether the lead has been charged.
   * @return value or {@code null} for none
   */
  public java.lang.String getChargeStatus() {
    return chargeStatus;
  }

  /**
   * Whether the lead has been charged.
   * @param chargeStatus chargeStatus or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setChargeStatus(java.lang.String chargeStatus) {
    this.chargeStatus = chargeStatus;
    return this;
  }

  /**
   * Currency code.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Currency code.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Dispute status related to the lead.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisputeStatus() {
    return disputeStatus;
  }

  /**
   * Dispute status related to the lead.
   * @param disputeStatus disputeStatus or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setDisputeStatus(java.lang.String disputeStatus) {
    this.disputeStatus = disputeStatus;
    return this;
  }

  /**
   * Location of the associated account's home city.
   * @return value or {@code null} for none
   */
  public java.lang.String getGeo() {
    return geo;
  }

  /**
   * Location of the associated account's home city.
   * @param geo geo or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setGeo(java.lang.String geo) {
    this.geo = geo;
    return this;
  }

  /**
   * Lead category (e.g. hvac, plumber)
   * @return value or {@code null} for none
   */
  public java.lang.String getLeadCategory() {
    return leadCategory;
  }

  /**
   * Lead category (e.g. hvac, plumber)
   * @param leadCategory leadCategory or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setLeadCategory(java.lang.String leadCategory) {
    this.leadCategory = leadCategory;
    return this;
  }

  /**
   * Timestamp of when the lead was created.
   * @return value or {@code null} for none
   */
  public String getLeadCreationTimestamp() {
    return leadCreationTimestamp;
  }

  /**
   * Timestamp of when the lead was created.
   * @param leadCreationTimestamp leadCreationTimestamp or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setLeadCreationTimestamp(String leadCreationTimestamp) {
    this.leadCreationTimestamp = leadCreationTimestamp;
    return this;
  }

  /**
   * Unique identifier of a Detailed Lead Report.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLeadId() {
    return leadId;
  }

  /**
   * Unique identifier of a Detailed Lead Report.
   * @param leadId leadId or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setLeadId(java.lang.Long leadId) {
    this.leadId = leadId;
    return this;
  }

  /**
   * Price of the lead (available only after it has been charged).
   * @return value or {@code null} for none
   */
  public java.lang.Double getLeadPrice() {
    return leadPrice;
  }

  /**
   * Price of the lead (available only after it has been charged).
   * @param leadPrice leadPrice or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setLeadPrice(java.lang.Double leadPrice) {
    this.leadPrice = leadPrice;
    return this;
  }

  /**
   * Lead type.
   * @return value or {@code null} for none
   */
  public java.lang.String getLeadType() {
    return leadType;
  }

  /**
   * Lead type.
   * @param leadType leadType or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setLeadType(java.lang.String leadType) {
    this.leadType = leadType;
    return this;
  }

  /**
   * More information associated to only message leads.
   * @return value or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1MessageLead getMessageLead() {
    return messageLead;
  }

  /**
   * More information associated to only message leads.
   * @param messageLead messageLead or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setMessageLead(GoogleAdsHomeservicesLocalservicesV1MessageLead messageLead) {
    this.messageLead = messageLead;
    return this;
  }

  /**
   * More information associated to only phone leads.
   * @return value or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1PhoneLead getPhoneLead() {
    return phoneLead;
  }

  /**
   * More information associated to only phone leads.
   * @param phoneLead phoneLead or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setPhoneLead(GoogleAdsHomeservicesLocalservicesV1PhoneLead phoneLead) {
    this.phoneLead = phoneLead;
    return this;
  }

  /**
   * Timezone of the particular provider associated to a lead.
   * @return value or {@code null} for none
   */
  public GoogleTypeTimeZone getTimezone() {
    return timezone;
  }

  /**
   * Timezone of the particular provider associated to a lead.
   * @param timezone timezone or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport setTimezone(GoogleTypeTimeZone timezone) {
    this.timezone = timezone;
    return this;
  }

  @Override
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport set(String fieldName, Object value) {
    return (GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport clone() {
    return (GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport) super.clone();
  }

}