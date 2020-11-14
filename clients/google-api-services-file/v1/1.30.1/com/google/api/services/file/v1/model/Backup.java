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

package com.google.api.services.file.v1.model;

/**
 * A Cloud Filestore backup.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Filestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Backup extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Capacity of the source file share when the backup was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long capacityGb;

  /**
   * Output only. The time when the backup was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * A description of the backup with 2048 characters or less. Requests with longer descriptions
   * will be rejected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. Amount of bytes that will be downloaded if the backup is restored. This may be
   * different than storage bytes, since sequential backups of the same disk will share storage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long downloadBytes;

  /**
   * Resource labels to represent user provided metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The resource name of the backup, in the format
   * projects/{project_number}/locations/{location_id}/backups/{backup_id}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Name of the file share in the source Cloud Filestore instance that the backup is created from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceFileShare;

  /**
   * The resource name of the source Cloud Filestore instance, in the format
   * projects/{project_number}/locations/{location_id}/instances/{instance_id}, used to create this
   * backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceInstance;

  /**
   * Output only. The service tier of the source Cloud Filestore instance that this backup is
   * created from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceInstanceTier;

  /**
   * Output only. The backup state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The size of the storage used by the backup. As backups share storage, this number
   * is expected to change with backup creation/deletion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long storageBytes;

  /**
   * Output only. Capacity of the source file share when the backup was created.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCapacityGb() {
    return capacityGb;
  }

  /**
   * Output only. Capacity of the source file share when the backup was created.
   * @param capacityGb capacityGb or {@code null} for none
   */
  public Backup setCapacityGb(java.lang.Long capacityGb) {
    this.capacityGb = capacityGb;
    return this;
  }

  /**
   * Output only. The time when the backup was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the backup was created.
   * @param createTime createTime or {@code null} for none
   */
  public Backup setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * A description of the backup with 2048 characters or less. Requests with longer descriptions
   * will be rejected.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A description of the backup with 2048 characters or less. Requests with longer descriptions
   * will be rejected.
   * @param description description or {@code null} for none
   */
  public Backup setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. Amount of bytes that will be downloaded if the backup is restored. This may be
   * different than storage bytes, since sequential backups of the same disk will share storage.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDownloadBytes() {
    return downloadBytes;
  }

  /**
   * Output only. Amount of bytes that will be downloaded if the backup is restored. This may be
   * different than storage bytes, since sequential backups of the same disk will share storage.
   * @param downloadBytes downloadBytes or {@code null} for none
   */
  public Backup setDownloadBytes(java.lang.Long downloadBytes) {
    this.downloadBytes = downloadBytes;
    return this;
  }

  /**
   * Resource labels to represent user provided metadata.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Resource labels to represent user provided metadata.
   * @param labels labels or {@code null} for none
   */
  public Backup setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The resource name of the backup, in the format
   * projects/{project_number}/locations/{location_id}/backups/{backup_id}.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the backup, in the format
   * projects/{project_number}/locations/{location_id}/backups/{backup_id}.
   * @param name name or {@code null} for none
   */
  public Backup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the file share in the source Cloud Filestore instance that the backup is created from.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceFileShare() {
    return sourceFileShare;
  }

  /**
   * Name of the file share in the source Cloud Filestore instance that the backup is created from.
   * @param sourceFileShare sourceFileShare or {@code null} for none
   */
  public Backup setSourceFileShare(java.lang.String sourceFileShare) {
    this.sourceFileShare = sourceFileShare;
    return this;
  }

  /**
   * The resource name of the source Cloud Filestore instance, in the format
   * projects/{project_number}/locations/{location_id}/instances/{instance_id}, used to create this
   * backup.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceInstance() {
    return sourceInstance;
  }

  /**
   * The resource name of the source Cloud Filestore instance, in the format
   * projects/{project_number}/locations/{location_id}/instances/{instance_id}, used to create this
   * backup.
   * @param sourceInstance sourceInstance or {@code null} for none
   */
  public Backup setSourceInstance(java.lang.String sourceInstance) {
    this.sourceInstance = sourceInstance;
    return this;
  }

  /**
   * Output only. The service tier of the source Cloud Filestore instance that this backup is
   * created from.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceInstanceTier() {
    return sourceInstanceTier;
  }

  /**
   * Output only. The service tier of the source Cloud Filestore instance that this backup is
   * created from.
   * @param sourceInstanceTier sourceInstanceTier or {@code null} for none
   */
  public Backup setSourceInstanceTier(java.lang.String sourceInstanceTier) {
    this.sourceInstanceTier = sourceInstanceTier;
    return this;
  }

  /**
   * Output only. The backup state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The backup state.
   * @param state state or {@code null} for none
   */
  public Backup setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The size of the storage used by the backup. As backups share storage, this number
   * is expected to change with backup creation/deletion.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStorageBytes() {
    return storageBytes;
  }

  /**
   * Output only. The size of the storage used by the backup. As backups share storage, this number
   * is expected to change with backup creation/deletion.
   * @param storageBytes storageBytes or {@code null} for none
   */
  public Backup setStorageBytes(java.lang.Long storageBytes) {
    this.storageBytes = storageBytes;
    return this;
  }

  @Override
  public Backup set(String fieldName, Object value) {
    return (Backup) super.set(fieldName, value);
  }

  @Override
  public Backup clone() {
    return (Backup) super.clone();
  }

}