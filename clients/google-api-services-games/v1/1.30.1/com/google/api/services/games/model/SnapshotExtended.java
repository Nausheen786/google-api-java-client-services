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

package com.google.api.services.games.model;

/**
 * A snapshot represents a saved game state referred to using the developer-provided snapshot_id
 * (think of it as a file's path). The set of attributes and binary data for a specific state is
 * called a revision. Each revision is itself immutable, and referred to by a snapshot_revision_id.
 * At any time, a snapshot has a "head" revision, and updates are made against that revision. If a
 * snapshot update is received that isn't against the current head revision, then instead of
 * changing the head revision it will result in a conflicting revision that must be specifically
 * resolved.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SnapshotExtended extends com.google.api.client.json.GenericJson {

  /**
   * A list of conflicting revisions. Only set if explicitly requested (e.g. using a field mask or a
   * request flag), or if the RPC guarantees that this field is set. The conflicting revisions are
   * sorted chronologically by their server creation time (oldest first). If there are too many
   * conflicting revisions to return all of them in a single request this will only contain the
   * first batch. In such case, the presented conflicting revisions must be resolved first in order
   * to fetch the next batch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SnapshotRevision> conflictingRevisions;

  /**
   * An indicator whether the snapshot has any conflicting revisions or not. Always set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasConflictingRevisions;

  /**
   * The current head revision (the canonical revision as understood by the server).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SnapshotRevision headRevision;

  /**
   * An identifier of the snapshot,developer-specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A list of conflicting revisions. Only set if explicitly requested (e.g. using a field mask or a
   * request flag), or if the RPC guarantees that this field is set. The conflicting revisions are
   * sorted chronologically by their server creation time (oldest first). If there are too many
   * conflicting revisions to return all of them in a single request this will only contain the
   * first batch. In such case, the presented conflicting revisions must be resolved first in order
   * to fetch the next batch.
   * @return value or {@code null} for none
   */
  public java.util.List<SnapshotRevision> getConflictingRevisions() {
    return conflictingRevisions;
  }

  /**
   * A list of conflicting revisions. Only set if explicitly requested (e.g. using a field mask or a
   * request flag), or if the RPC guarantees that this field is set. The conflicting revisions are
   * sorted chronologically by their server creation time (oldest first). If there are too many
   * conflicting revisions to return all of them in a single request this will only contain the
   * first batch. In such case, the presented conflicting revisions must be resolved first in order
   * to fetch the next batch.
   * @param conflictingRevisions conflictingRevisions or {@code null} for none
   */
  public SnapshotExtended setConflictingRevisions(java.util.List<SnapshotRevision> conflictingRevisions) {
    this.conflictingRevisions = conflictingRevisions;
    return this;
  }

  /**
   * An indicator whether the snapshot has any conflicting revisions or not. Always set.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasConflictingRevisions() {
    return hasConflictingRevisions;
  }

  /**
   * An indicator whether the snapshot has any conflicting revisions or not. Always set.
   * @param hasConflictingRevisions hasConflictingRevisions or {@code null} for none
   */
  public SnapshotExtended setHasConflictingRevisions(java.lang.Boolean hasConflictingRevisions) {
    this.hasConflictingRevisions = hasConflictingRevisions;
    return this;
  }

  /**
   * The current head revision (the canonical revision as understood by the server).
   * @return value or {@code null} for none
   */
  public SnapshotRevision getHeadRevision() {
    return headRevision;
  }

  /**
   * The current head revision (the canonical revision as understood by the server).
   * @param headRevision headRevision or {@code null} for none
   */
  public SnapshotExtended setHeadRevision(SnapshotRevision headRevision) {
    this.headRevision = headRevision;
    return this;
  }

  /**
   * An identifier of the snapshot,developer-specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * An identifier of the snapshot,developer-specified.
   * @param name name or {@code null} for none
   */
  public SnapshotExtended setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public SnapshotExtended set(String fieldName, Object value) {
    return (SnapshotExtended) super.set(fieldName, value);
  }

  @Override
  public SnapshotExtended clone() {
    return (SnapshotExtended) super.clone();
  }

}