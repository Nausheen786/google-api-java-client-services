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

package com.google.api.services.reseller.model;

/**
 * JSON template for a subscription.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Workspace Reseller API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Subscription extends com.google.api.client.json.GenericJson {

  /**
   * Read-only field that returns the current billing method for a subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String billingMethod;

  /**
   * The `creationTime` property is the date when subscription was created. It is in milliseconds
   * using the Epoch format. See an example Epoch converter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long creationTime;

  /**
   * Primary domain name of the customer
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerDomain;

  /**
   * This property will always be returned in a response as the unique identifier generated by
   * Google. In a request, this property can be either the primary domain or the unique identifier
   * generated by Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerId;

  /**
   * Google-issued code (100 char max) for discounted pricing on subscription plans. Deal code must
   * be included in `insert` requests in order to receive discounted rate. This property is
   * optional, regular pricing applies if left empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dealCode;

  /**
   * Identifies the resource as a Subscription. Value: `reseller#subscription`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The `plan` property is required. In this version of the API, the G Suite plans are the flexible
   * plan, annual commitment plan, and the 30-day free trial plan. For more information about the
   * API"s payment plans, see the API concepts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Plan plan;

  /**
   * This is an optional property. This purchase order (PO) information is for resellers to use for
   * their company tracking usage. If a `purchaseOrderId` value is given it appears in the API
   * responses and shows up in the invoice. The property accepts up to 80 plain text characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String purchaseOrderId;

  /**
   * Renewal settings for the annual commitment plan. For more detailed information, see renewal
   * options in the administrator help center.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RenewalSettings renewalSettings;

  /**
   * URL to customer's Subscriptions page in the Admin console. The read-only URL is generated by
   * the API service. This is used if your client application requires the customer to complete a
   * task using the Subscriptions page in the Admin console.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceUiUrl;

  /**
   * This is a required property. The number and limit of user seat licenses in the plan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Seats seats;

  /**
   * A required property. The `skuId` is a unique system identifier for a product's SKU assigned to
   * a customer in the subscription. For products and SKUs available in this version of the API, see
   * Product and SKU IDs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String skuId;

  /**
   * Read-only external display name for a product's SKU assigned to a customer in the subscription.
   * SKU names are subject to change at Google's discretion. For products and SKUs available in this
   * version of the API, see Product and SKU IDs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String skuName;

  /**
   * This is an optional property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The `subscriptionId` is the subscription identifier and is unique for each customer. This is a
   * required property. Since a `subscriptionId` changes when a subscription is updated, we
   * recommend not using this ID as a key for persistent data. Use the `subscriptionId` as described
   * in retrieve all reseller subscriptions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subscriptionId;

  /**
   * Read-only field containing an enumerable of all the current suspension reasons for a
   * subscription. It is possible for a subscription to have many concurrent, overlapping suspension
   * reasons. A subscription's `STATUS` is `SUSPENDED` until all pending suspensions are removed.
   * Possible options include: - `PENDING_TOS_ACCEPTANCE` - The customer has not logged in and
   * accepted the G Suite Resold Terms of Services. - `RENEWAL_WITH_TYPE_CANCEL` - The customer's
   * commitment ended and their service was cancelled at the end of their term. -
   * `RESELLER_INITIATED` - A manual suspension invoked by a Reseller. - `TRIAL_ENDED` - The
   * customer's trial expired without a plan selected. - `OTHER` - The customer is suspended for an
   * internal Google reason (e.g. abuse or otherwise).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suspensionReasons;

  /**
   * Read-only transfer related information for the subscription. For more information, see retrieve
   * transferable subscriptions for a customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TransferInfo transferInfo;

  /**
   * The G Suite annual commitment and flexible payment plans can be in a 30-day free trial. For
   * more information, see the API concepts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TrialSettings trialSettings;

  /**
   * Read-only field that returns the current billing method for a subscription.
   * @return value or {@code null} for none
   */
  public java.lang.String getBillingMethod() {
    return billingMethod;
  }

  /**
   * Read-only field that returns the current billing method for a subscription.
   * @param billingMethod billingMethod or {@code null} for none
   */
  public Subscription setBillingMethod(java.lang.String billingMethod) {
    this.billingMethod = billingMethod;
    return this;
  }

  /**
   * The `creationTime` property is the date when subscription was created. It is in milliseconds
   * using the Epoch format. See an example Epoch converter.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreationTime() {
    return creationTime;
  }

  /**
   * The `creationTime` property is the date when subscription was created. It is in milliseconds
   * using the Epoch format. See an example Epoch converter.
   * @param creationTime creationTime or {@code null} for none
   */
  public Subscription setCreationTime(java.lang.Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Primary domain name of the customer
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerDomain() {
    return customerDomain;
  }

  /**
   * Primary domain name of the customer
   * @param customerDomain customerDomain or {@code null} for none
   */
  public Subscription setCustomerDomain(java.lang.String customerDomain) {
    this.customerDomain = customerDomain;
    return this;
  }

  /**
   * This property will always be returned in a response as the unique identifier generated by
   * Google. In a request, this property can be either the primary domain or the unique identifier
   * generated by Google.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerId() {
    return customerId;
  }

  /**
   * This property will always be returned in a response as the unique identifier generated by
   * Google. In a request, this property can be either the primary domain or the unique identifier
   * generated by Google.
   * @param customerId customerId or {@code null} for none
   */
  public Subscription setCustomerId(java.lang.String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Google-issued code (100 char max) for discounted pricing on subscription plans. Deal code must
   * be included in `insert` requests in order to receive discounted rate. This property is
   * optional, regular pricing applies if left empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getDealCode() {
    return dealCode;
  }

  /**
   * Google-issued code (100 char max) for discounted pricing on subscription plans. Deal code must
   * be included in `insert` requests in order to receive discounted rate. This property is
   * optional, regular pricing applies if left empty.
   * @param dealCode dealCode or {@code null} for none
   */
  public Subscription setDealCode(java.lang.String dealCode) {
    this.dealCode = dealCode;
    return this;
  }

  /**
   * Identifies the resource as a Subscription. Value: `reseller#subscription`
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies the resource as a Subscription. Value: `reseller#subscription`
   * @param kind kind or {@code null} for none
   */
  public Subscription setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The `plan` property is required. In this version of the API, the G Suite plans are the flexible
   * plan, annual commitment plan, and the 30-day free trial plan. For more information about the
   * API"s payment plans, see the API concepts.
   * @return value or {@code null} for none
   */
  public Plan getPlan() {
    return plan;
  }

  /**
   * The `plan` property is required. In this version of the API, the G Suite plans are the flexible
   * plan, annual commitment plan, and the 30-day free trial plan. For more information about the
   * API"s payment plans, see the API concepts.
   * @param plan plan or {@code null} for none
   */
  public Subscription setPlan(Plan plan) {
    this.plan = plan;
    return this;
  }

  /**
   * This is an optional property. This purchase order (PO) information is for resellers to use for
   * their company tracking usage. If a `purchaseOrderId` value is given it appears in the API
   * responses and shows up in the invoice. The property accepts up to 80 plain text characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getPurchaseOrderId() {
    return purchaseOrderId;
  }

  /**
   * This is an optional property. This purchase order (PO) information is for resellers to use for
   * their company tracking usage. If a `purchaseOrderId` value is given it appears in the API
   * responses and shows up in the invoice. The property accepts up to 80 plain text characters.
   * @param purchaseOrderId purchaseOrderId or {@code null} for none
   */
  public Subscription setPurchaseOrderId(java.lang.String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
    return this;
  }

  /**
   * Renewal settings for the annual commitment plan. For more detailed information, see renewal
   * options in the administrator help center.
   * @return value or {@code null} for none
   */
  public RenewalSettings getRenewalSettings() {
    return renewalSettings;
  }

  /**
   * Renewal settings for the annual commitment plan. For more detailed information, see renewal
   * options in the administrator help center.
   * @param renewalSettings renewalSettings or {@code null} for none
   */
  public Subscription setRenewalSettings(RenewalSettings renewalSettings) {
    this.renewalSettings = renewalSettings;
    return this;
  }

  /**
   * URL to customer's Subscriptions page in the Admin console. The read-only URL is generated by
   * the API service. This is used if your client application requires the customer to complete a
   * task using the Subscriptions page in the Admin console.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceUiUrl() {
    return resourceUiUrl;
  }

  /**
   * URL to customer's Subscriptions page in the Admin console. The read-only URL is generated by
   * the API service. This is used if your client application requires the customer to complete a
   * task using the Subscriptions page in the Admin console.
   * @param resourceUiUrl resourceUiUrl or {@code null} for none
   */
  public Subscription setResourceUiUrl(java.lang.String resourceUiUrl) {
    this.resourceUiUrl = resourceUiUrl;
    return this;
  }

  /**
   * This is a required property. The number and limit of user seat licenses in the plan.
   * @return value or {@code null} for none
   */
  public Seats getSeats() {
    return seats;
  }

  /**
   * This is a required property. The number and limit of user seat licenses in the plan.
   * @param seats seats or {@code null} for none
   */
  public Subscription setSeats(Seats seats) {
    this.seats = seats;
    return this;
  }

  /**
   * A required property. The `skuId` is a unique system identifier for a product's SKU assigned to
   * a customer in the subscription. For products and SKUs available in this version of the API, see
   * Product and SKU IDs.
   * @return value or {@code null} for none
   */
  public java.lang.String getSkuId() {
    return skuId;
  }

  /**
   * A required property. The `skuId` is a unique system identifier for a product's SKU assigned to
   * a customer in the subscription. For products and SKUs available in this version of the API, see
   * Product and SKU IDs.
   * @param skuId skuId or {@code null} for none
   */
  public Subscription setSkuId(java.lang.String skuId) {
    this.skuId = skuId;
    return this;
  }

  /**
   * Read-only external display name for a product's SKU assigned to a customer in the subscription.
   * SKU names are subject to change at Google's discretion. For products and SKUs available in this
   * version of the API, see Product and SKU IDs.
   * @return value or {@code null} for none
   */
  public java.lang.String getSkuName() {
    return skuName;
  }

  /**
   * Read-only external display name for a product's SKU assigned to a customer in the subscription.
   * SKU names are subject to change at Google's discretion. For products and SKUs available in this
   * version of the API, see Product and SKU IDs.
   * @param skuName skuName or {@code null} for none
   */
  public Subscription setSkuName(java.lang.String skuName) {
    this.skuName = skuName;
    return this;
  }

  /**
   * This is an optional property.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * This is an optional property.
   * @param status status or {@code null} for none
   */
  public Subscription setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * The `subscriptionId` is the subscription identifier and is unique for each customer. This is a
   * required property. Since a `subscriptionId` changes when a subscription is updated, we
   * recommend not using this ID as a key for persistent data. Use the `subscriptionId` as described
   * in retrieve all reseller subscriptions.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * The `subscriptionId` is the subscription identifier and is unique for each customer. This is a
   * required property. Since a `subscriptionId` changes when a subscription is updated, we
   * recommend not using this ID as a key for persistent data. Use the `subscriptionId` as described
   * in retrieve all reseller subscriptions.
   * @param subscriptionId subscriptionId or {@code null} for none
   */
  public Subscription setSubscriptionId(java.lang.String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Read-only field containing an enumerable of all the current suspension reasons for a
   * subscription. It is possible for a subscription to have many concurrent, overlapping suspension
   * reasons. A subscription's `STATUS` is `SUSPENDED` until all pending suspensions are removed.
   * Possible options include: - `PENDING_TOS_ACCEPTANCE` - The customer has not logged in and
   * accepted the G Suite Resold Terms of Services. - `RENEWAL_WITH_TYPE_CANCEL` - The customer's
   * commitment ended and their service was cancelled at the end of their term. -
   * `RESELLER_INITIATED` - A manual suspension invoked by a Reseller. - `TRIAL_ENDED` - The
   * customer's trial expired without a plan selected. - `OTHER` - The customer is suspended for an
   * internal Google reason (e.g. abuse or otherwise).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuspensionReasons() {
    return suspensionReasons;
  }

  /**
   * Read-only field containing an enumerable of all the current suspension reasons for a
   * subscription. It is possible for a subscription to have many concurrent, overlapping suspension
   * reasons. A subscription's `STATUS` is `SUSPENDED` until all pending suspensions are removed.
   * Possible options include: - `PENDING_TOS_ACCEPTANCE` - The customer has not logged in and
   * accepted the G Suite Resold Terms of Services. - `RENEWAL_WITH_TYPE_CANCEL` - The customer's
   * commitment ended and their service was cancelled at the end of their term. -
   * `RESELLER_INITIATED` - A manual suspension invoked by a Reseller. - `TRIAL_ENDED` - The
   * customer's trial expired without a plan selected. - `OTHER` - The customer is suspended for an
   * internal Google reason (e.g. abuse or otherwise).
   * @param suspensionReasons suspensionReasons or {@code null} for none
   */
  public Subscription setSuspensionReasons(java.util.List<java.lang.String> suspensionReasons) {
    this.suspensionReasons = suspensionReasons;
    return this;
  }

  /**
   * Read-only transfer related information for the subscription. For more information, see retrieve
   * transferable subscriptions for a customer.
   * @return value or {@code null} for none
   */
  public TransferInfo getTransferInfo() {
    return transferInfo;
  }

  /**
   * Read-only transfer related information for the subscription. For more information, see retrieve
   * transferable subscriptions for a customer.
   * @param transferInfo transferInfo or {@code null} for none
   */
  public Subscription setTransferInfo(TransferInfo transferInfo) {
    this.transferInfo = transferInfo;
    return this;
  }

  /**
   * The G Suite annual commitment and flexible payment plans can be in a 30-day free trial. For
   * more information, see the API concepts.
   * @return value or {@code null} for none
   */
  public TrialSettings getTrialSettings() {
    return trialSettings;
  }

  /**
   * The G Suite annual commitment and flexible payment plans can be in a 30-day free trial. For
   * more information, see the API concepts.
   * @param trialSettings trialSettings or {@code null} for none
   */
  public Subscription setTrialSettings(TrialSettings trialSettings) {
    this.trialSettings = trialSettings;
    return this;
  }

  @Override
  public Subscription set(String fieldName, Object value) {
    return (Subscription) super.set(fieldName, value);
  }

  @Override
  public Subscription clone() {
    return (Subscription) super.clone();
  }

  /**
   * The `plan` property is required. In this version of the API, the G Suite plans are the flexible
   * plan, annual commitment plan, and the 30-day free trial plan. For more information about the
   * API"s payment plans, see the API concepts.
   */
  public static final class Plan extends com.google.api.client.json.GenericJson {

    /**
     * In this version of the API, annual commitment plan's interval is one year. *Note: *When
     * `billingMethod` value is `OFFLINE`, the subscription property object `plan.commitmentInterval`
     * is omitted in all API responses.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private CommitmentInterval commitmentInterval;

    /**
     * The `isCommitmentPlan` property's boolean value identifies the plan as an annual commitment
     * plan: - `true` — The subscription's plan is an annual commitment plan. - `false` — The plan is
     * not an annual commitment plan.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean isCommitmentPlan;

    /**
     * The `planName` property is required. This is the name of the subscription's plan. For more
     * information about the Google payment plans, see the API concepts. Possible values are: -
     * `ANNUAL_MONTHLY_PAY` — The annual commitment plan with monthly payments. *Caution:
     * *`ANNUAL_MONTHLY_PAY` is returned as `ANNUAL` in all API responses. - `ANNUAL_YEARLY_PAY` — The
     * annual commitment plan with yearly payments - `FLEXIBLE` — The flexible plan - `TRIAL` — The
     * 30-day free trial plan. A subscription in trial will be suspended after the 30th free day if no
     * payment plan is assigned. Calling `changePlan` will assign a payment plan to a trial but will
     * not activate the plan. A trial will automatically begin its assigned payment plan after its
     * 30th free day or immediately after calling `startPaidService`. - `FREE` — The free plan is
     * exclusive to the Cloud Identity SKU and does not incur any billing.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String planName;

    /**
     * In this version of the API, annual commitment plan's interval is one year. *Note: *When
     * `billingMethod` value is `OFFLINE`, the subscription property object `plan.commitmentInterval`
     * is omitted in all API responses.
     * @return value or {@code null} for none
     */
    public CommitmentInterval getCommitmentInterval() {
      return commitmentInterval;
    }

    /**
     * In this version of the API, annual commitment plan's interval is one year. *Note: *When
     * `billingMethod` value is `OFFLINE`, the subscription property object `plan.commitmentInterval`
     * is omitted in all API responses.
     * @param commitmentInterval commitmentInterval or {@code null} for none
     */
    public Plan setCommitmentInterval(CommitmentInterval commitmentInterval) {
      this.commitmentInterval = commitmentInterval;
      return this;
    }

    /**
     * The `isCommitmentPlan` property's boolean value identifies the plan as an annual commitment
     * plan: - `true` — The subscription's plan is an annual commitment plan. - `false` — The plan is
     * not an annual commitment plan.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getIsCommitmentPlan() {
      return isCommitmentPlan;
    }

    /**
     * The `isCommitmentPlan` property's boolean value identifies the plan as an annual commitment
     * plan: - `true` — The subscription's plan is an annual commitment plan. - `false` — The plan is
     * not an annual commitment plan.
     * @param isCommitmentPlan isCommitmentPlan or {@code null} for none
     */
    public Plan setIsCommitmentPlan(java.lang.Boolean isCommitmentPlan) {
      this.isCommitmentPlan = isCommitmentPlan;
      return this;
    }

    /**
     * The `planName` property is required. This is the name of the subscription's plan. For more
     * information about the Google payment plans, see the API concepts. Possible values are: -
     * `ANNUAL_MONTHLY_PAY` — The annual commitment plan with monthly payments. *Caution:
     * *`ANNUAL_MONTHLY_PAY` is returned as `ANNUAL` in all API responses. - `ANNUAL_YEARLY_PAY` — The
     * annual commitment plan with yearly payments - `FLEXIBLE` — The flexible plan - `TRIAL` — The
     * 30-day free trial plan. A subscription in trial will be suspended after the 30th free day if no
     * payment plan is assigned. Calling `changePlan` will assign a payment plan to a trial but will
     * not activate the plan. A trial will automatically begin its assigned payment plan after its
     * 30th free day or immediately after calling `startPaidService`. - `FREE` — The free plan is
     * exclusive to the Cloud Identity SKU and does not incur any billing.
     * @return value or {@code null} for none
     */
    public java.lang.String getPlanName() {
      return planName;
    }

    /**
     * The `planName` property is required. This is the name of the subscription's plan. For more
     * information about the Google payment plans, see the API concepts. Possible values are: -
     * `ANNUAL_MONTHLY_PAY` — The annual commitment plan with monthly payments. *Caution:
     * *`ANNUAL_MONTHLY_PAY` is returned as `ANNUAL` in all API responses. - `ANNUAL_YEARLY_PAY` — The
     * annual commitment plan with yearly payments - `FLEXIBLE` — The flexible plan - `TRIAL` — The
     * 30-day free trial plan. A subscription in trial will be suspended after the 30th free day if no
     * payment plan is assigned. Calling `changePlan` will assign a payment plan to a trial but will
     * not activate the plan. A trial will automatically begin its assigned payment plan after its
     * 30th free day or immediately after calling `startPaidService`. - `FREE` — The free plan is
     * exclusive to the Cloud Identity SKU and does not incur any billing.
     * @param planName planName or {@code null} for none
     */
    public Plan setPlanName(java.lang.String planName) {
      this.planName = planName;
      return this;
    }

    @Override
    public Plan set(String fieldName, Object value) {
      return (Plan) super.set(fieldName, value);
    }

    @Override
    public Plan clone() {
      return (Plan) super.clone();
    }

    /**
     * In this version of the API, annual commitment plan's interval is one year. *Note: *When
     * `billingMethod` value is `OFFLINE`, the subscription property object `plan.commitmentInterval` is
     * omitted in all API responses.
     */
    public static final class CommitmentInterval extends com.google.api.client.json.GenericJson {

      /**
       * An annual commitment plan's interval's `endTime` in milliseconds using the UNIX Epoch format.
       * See an example Epoch converter.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key @com.google.api.client.json.JsonString
      private java.lang.Long endTime;

      /**
       * An annual commitment plan's interval's `startTime` in milliseconds using UNIX Epoch format. See
       * an example Epoch converter.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key @com.google.api.client.json.JsonString
      private java.lang.Long startTime;

      /**
       * An annual commitment plan's interval's `endTime` in milliseconds using the UNIX Epoch format.
       * See an example Epoch converter.
       * @return value or {@code null} for none
       */
      public java.lang.Long getEndTime() {
        return endTime;
      }

      /**
       * An annual commitment plan's interval's `endTime` in milliseconds using the UNIX Epoch format.
       * See an example Epoch converter.
       * @param endTime endTime or {@code null} for none
       */
      public CommitmentInterval setEndTime(java.lang.Long endTime) {
        this.endTime = endTime;
        return this;
      }

      /**
       * An annual commitment plan's interval's `startTime` in milliseconds using UNIX Epoch format. See
       * an example Epoch converter.
       * @return value or {@code null} for none
       */
      public java.lang.Long getStartTime() {
        return startTime;
      }

      /**
       * An annual commitment plan's interval's `startTime` in milliseconds using UNIX Epoch format. See
       * an example Epoch converter.
       * @param startTime startTime or {@code null} for none
       */
      public CommitmentInterval setStartTime(java.lang.Long startTime) {
        this.startTime = startTime;
        return this;
      }

      @Override
      public CommitmentInterval set(String fieldName, Object value) {
        return (CommitmentInterval) super.set(fieldName, value);
      }

      @Override
      public CommitmentInterval clone() {
        return (CommitmentInterval) super.clone();
      }

    }
  }

  /**
   * Read-only transfer related information for the subscription. For more information, see retrieve
   * transferable subscriptions for a customer.
   */
  public static final class TransferInfo extends com.google.api.client.json.GenericJson {

    /**
     * Sku id of the current resold subscription. This is populated only when customer has
     * subscription with legacy sku and the subscription resource is populated with recommeded sku for
     * transfer in.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String currentLegacySkuId;

    /**
     * When inserting a subscription, this is the minimum number of seats listed in the transfer order
     * for this product. For example, if the customer has 20 users, the reseller cannot place a
     * transfer order of 15 seats. The minimum is 20 seats.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer minimumTransferableSeats;

    /**
     * The time when transfer token or intent to transfer will expire. The time is in milliseconds
     * using UNIX Epoch format.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key @com.google.api.client.json.JsonString
    private java.lang.Long transferabilityExpirationTime;

    /**
     * Sku id of the current resold subscription. This is populated only when customer has
     * subscription with legacy sku and the subscription resource is populated with recommeded sku for
     * transfer in.
     * @return value or {@code null} for none
     */
    public java.lang.String getCurrentLegacySkuId() {
      return currentLegacySkuId;
    }

    /**
     * Sku id of the current resold subscription. This is populated only when customer has
     * subscription with legacy sku and the subscription resource is populated with recommeded sku for
     * transfer in.
     * @param currentLegacySkuId currentLegacySkuId or {@code null} for none
     */
    public TransferInfo setCurrentLegacySkuId(java.lang.String currentLegacySkuId) {
      this.currentLegacySkuId = currentLegacySkuId;
      return this;
    }

    /**
     * When inserting a subscription, this is the minimum number of seats listed in the transfer order
     * for this product. For example, if the customer has 20 users, the reseller cannot place a
     * transfer order of 15 seats. The minimum is 20 seats.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getMinimumTransferableSeats() {
      return minimumTransferableSeats;
    }

    /**
     * When inserting a subscription, this is the minimum number of seats listed in the transfer order
     * for this product. For example, if the customer has 20 users, the reseller cannot place a
     * transfer order of 15 seats. The minimum is 20 seats.
     * @param minimumTransferableSeats minimumTransferableSeats or {@code null} for none
     */
    public TransferInfo setMinimumTransferableSeats(java.lang.Integer minimumTransferableSeats) {
      this.minimumTransferableSeats = minimumTransferableSeats;
      return this;
    }

    /**
     * The time when transfer token or intent to transfer will expire. The time is in milliseconds
     * using UNIX Epoch format.
     * @return value or {@code null} for none
     */
    public java.lang.Long getTransferabilityExpirationTime() {
      return transferabilityExpirationTime;
    }

    /**
     * The time when transfer token or intent to transfer will expire. The time is in milliseconds
     * using UNIX Epoch format.
     * @param transferabilityExpirationTime transferabilityExpirationTime or {@code null} for none
     */
    public TransferInfo setTransferabilityExpirationTime(java.lang.Long transferabilityExpirationTime) {
      this.transferabilityExpirationTime = transferabilityExpirationTime;
      return this;
    }

    @Override
    public TransferInfo set(String fieldName, Object value) {
      return (TransferInfo) super.set(fieldName, value);
    }

    @Override
    public TransferInfo clone() {
      return (TransferInfo) super.clone();
    }

  }

  /**
   * The G Suite annual commitment and flexible payment plans can be in a 30-day free trial. For more
   * information, see the API concepts.
   */
  public static final class TrialSettings extends com.google.api.client.json.GenericJson {

    /**
     * Determines if a subscription's plan is in a 30-day free trial or not: - `true` — The plan is in
     * trial. - `false` — The plan is not in trial.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean isInTrial;

    /**
     * Date when the trial ends. The value is in milliseconds using the UNIX Epoch format. See an
     * example Epoch converter.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key @com.google.api.client.json.JsonString
    private java.lang.Long trialEndTime;

    /**
     * Determines if a subscription's plan is in a 30-day free trial or not: - `true` — The plan is in
     * trial. - `false` — The plan is not in trial.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getIsInTrial() {
      return isInTrial;
    }

    /**
     * Determines if a subscription's plan is in a 30-day free trial or not: - `true` — The plan is in
     * trial. - `false` — The plan is not in trial.
     * @param isInTrial isInTrial or {@code null} for none
     */
    public TrialSettings setIsInTrial(java.lang.Boolean isInTrial) {
      this.isInTrial = isInTrial;
      return this;
    }

    /**
     * Date when the trial ends. The value is in milliseconds using the UNIX Epoch format. See an
     * example Epoch converter.
     * @return value or {@code null} for none
     */
    public java.lang.Long getTrialEndTime() {
      return trialEndTime;
    }

    /**
     * Date when the trial ends. The value is in milliseconds using the UNIX Epoch format. See an
     * example Epoch converter.
     * @param trialEndTime trialEndTime or {@code null} for none
     */
    public TrialSettings setTrialEndTime(java.lang.Long trialEndTime) {
      this.trialEndTime = trialEndTime;
      return this;
    }

    @Override
    public TrialSettings set(String fieldName, Object value) {
      return (TrialSettings) super.set(fieldName, value);
    }

    @Override
    public TrialSettings clone() {
      return (TrialSettings) super.clone();
    }

  }
}
