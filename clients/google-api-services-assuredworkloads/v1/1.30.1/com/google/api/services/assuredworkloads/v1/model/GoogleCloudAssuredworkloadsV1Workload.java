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

package com.google.api.services.assuredworkloads.v1.model;

/**
 * An Workload object for managing highly regulated workloads of cloud customers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Assured Workloads API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssuredworkloadsV1Workload extends com.google.api.client.json.GenericJson {

  /**
   * Required. Input only. The billing account used for the resources which are direct children of
   * workload. This billing account is initially associated with the resources created as part of
   * Workload creation. After the initial creation of these resources, the customer can change the
   * assigned billing account. The resource name has the form
   * `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String billingAccount;

  /**
   * Required. Immutable. Compliance Regime associated with this workload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String complianceRegime;

  /**
   * Output only. Immutable. The Workload creation timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. The user-assigned display name of the Workload. When present it must be between 4 to
   * 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and
   * spaces. Example: My Workload
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will
   * be used in Update & Delete operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key
   * is provisioned. This field is mandatory for a subset of Compliance Regimes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAssuredworkloadsV1WorkloadKMSSettings kmsSettings;

  /**
   * Optional. Labels applied to the workload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. The resource name of the workload. Format:
   * organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Input only. The parent resource for the resources managed by this Assured Workload. May be
   * either an organization or a folder. Must be the same or a child of the Workload parent. If not
   * specified all resources are created under the Workload parent. Formats: folders/{folder_id}
   * organizations/{organization_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provisionedResourcesParent;

  /**
   * Output only. The resources associated with this workload. These resources will be created when
   * creating the workload. If any of the projects already exist, the workload creation will fail.
   * Always read only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAssuredworkloadsV1WorkloadResourceInfo> resources;

  /**
   * Required. Input only. The billing account used for the resources which are direct children of
   * workload. This billing account is initially associated with the resources created as part of
   * Workload creation. After the initial creation of these resources, the customer can change the
   * assigned billing account. The resource name has the form
   * `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
   * @return value or {@code null} for none
   */
  public java.lang.String getBillingAccount() {
    return billingAccount;
  }

  /**
   * Required. Input only. The billing account used for the resources which are direct children of
   * workload. This billing account is initially associated with the resources created as part of
   * Workload creation. After the initial creation of these resources, the customer can change the
   * assigned billing account. The resource name has the form
   * `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
   * @param billingAccount billingAccount or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1Workload setBillingAccount(java.lang.String billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  /**
   * Required. Immutable. Compliance Regime associated with this workload.
   * @return value or {@code null} for none
   */
  public java.lang.String getComplianceRegime() {
    return complianceRegime;
  }

  /**
   * Required. Immutable. Compliance Regime associated with this workload.
   * @param complianceRegime complianceRegime or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1Workload setComplianceRegime(java.lang.String complianceRegime) {
    this.complianceRegime = complianceRegime;
    return this;
  }

  /**
   * Output only. Immutable. The Workload creation timestamp.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Immutable. The Workload creation timestamp.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1Workload setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. The user-assigned display name of the Workload. When present it must be between 4 to
   * 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and
   * spaces. Example: My Workload
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The user-assigned display name of the Workload. When present it must be between 4 to
   * 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and
   * spaces. Example: My Workload
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1Workload setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will
   * be used in Update & Delete operations.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will
   * be used in Update & Delete operations.
   * @param etag etag or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1Workload setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key
   * is provisioned. This field is mandatory for a subset of Compliance Regimes.
   * @return value or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1WorkloadKMSSettings getKmsSettings() {
    return kmsSettings;
  }

  /**
   * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key
   * is provisioned. This field is mandatory for a subset of Compliance Regimes.
   * @param kmsSettings kmsSettings or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1Workload setKmsSettings(GoogleCloudAssuredworkloadsV1WorkloadKMSSettings kmsSettings) {
    this.kmsSettings = kmsSettings;
    return this;
  }

  /**
   * Optional. Labels applied to the workload.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Labels applied to the workload.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1Workload setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. The resource name of the workload. Format:
   * organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optional. The resource name of the workload. Format:
   * organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
   * @param name name or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1Workload setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Input only. The parent resource for the resources managed by this Assured Workload. May be
   * either an organization or a folder. Must be the same or a child of the Workload parent. If not
   * specified all resources are created under the Workload parent. Formats: folders/{folder_id}
   * organizations/{organization_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getProvisionedResourcesParent() {
    return provisionedResourcesParent;
  }

  /**
   * Input only. The parent resource for the resources managed by this Assured Workload. May be
   * either an organization or a folder. Must be the same or a child of the Workload parent. If not
   * specified all resources are created under the Workload parent. Formats: folders/{folder_id}
   * organizations/{organization_id}
   * @param provisionedResourcesParent provisionedResourcesParent or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1Workload setProvisionedResourcesParent(java.lang.String provisionedResourcesParent) {
    this.provisionedResourcesParent = provisionedResourcesParent;
    return this;
  }

  /**
   * Output only. The resources associated with this workload. These resources will be created when
   * creating the workload. If any of the projects already exist, the workload creation will fail.
   * Always read only.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAssuredworkloadsV1WorkloadResourceInfo> getResources() {
    return resources;
  }

  /**
   * Output only. The resources associated with this workload. These resources will be created when
   * creating the workload. If any of the projects already exist, the workload creation will fail.
   * Always read only.
   * @param resources resources or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1Workload setResources(java.util.List<GoogleCloudAssuredworkloadsV1WorkloadResourceInfo> resources) {
    this.resources = resources;
    return this;
  }

  @Override
  public GoogleCloudAssuredworkloadsV1Workload set(String fieldName, Object value) {
    return (GoogleCloudAssuredworkloadsV1Workload) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssuredworkloadsV1Workload clone() {
    return (GoogleCloudAssuredworkloadsV1Workload) super.clone();
  }

}