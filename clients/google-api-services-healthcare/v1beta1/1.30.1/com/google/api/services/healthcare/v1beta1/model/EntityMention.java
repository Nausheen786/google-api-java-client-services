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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * An entity mention in the document.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EntityMention extends com.google.api.client.json.GenericJson {

  /**
   * The certainty assessment of the entity mention. Its value is one of: LIKELY, SOMEWHAT_LIKELY,
   * UNCERTAIN, SOMEWHAT_UNLIKELY, UNLIKELY, CONDITIONAL
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Feature certaintyAssessment;

  /**
   * The model's confidence in this entity mention annotation. A number between 0 and 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double confidence;

  /**
   * linked_entities are candidate ontological concepts that this entity mention may refer to. They
   * are sorted by decreasing confidence.it
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LinkedEntity> linkedEntities;

  /**
   * mention_id uniquely identifies each entity mention in a single response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mentionId;

  /**
   * The subject this entity mention relates to. Its value is one of: PATIENT, FAMILY_MEMBER, OTHER
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Feature subject;

  /**
   * How this entity mention relates to the subject temporally. Its value is one of: CURRENT,
   * CLINICAL_HISTORY, FAMILY_HISTORY, UPCOMING, ALLERGY
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Feature temporalAssessment;

  /**
   * text is the location of the entity mention in the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextSpan text;

  /**
   * The semantic type of the entity: UNKNOWN_ENTITY_TYPE, ALONE, ANATOMICAL_STRUCTURE,
   * ASSISTED_LIVING, BF_RESULT, BM_RESULT, BM_UNIT, BM_VALUE, BODY_FUNCTION, BODY_MEASUREMENT,
   * COMPLIANT, DOESNOT_FOLLOWUP, FAMILY, FOLLOWSUP, LABORATORY_DATA, LAB_RESULT, LAB_UNIT,
   * LAB_VALUE, MEDICAL_DEVICE, MEDICINE, MED_DOSE, MED_DURATION, MED_FORM, MED_FREQUENCY,
   * MED_ROUTE, MED_STATUS, MED_STRENGTH, MED_TOTALDOSE, MED_UNIT, NON_COMPLIANT,
   * OTHER_LIVINGSTATUS, PROBLEM, PROCEDURE, PROCEDURE_RESULT, PROC_METHOD,
   * REASON_FOR_NONCOMPLIANCE, SEVERITY, SUBSTANCE_ABUSE, UNCLEAR_FOLLOWUP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The certainty assessment of the entity mention. Its value is one of: LIKELY, SOMEWHAT_LIKELY,
   * UNCERTAIN, SOMEWHAT_UNLIKELY, UNLIKELY, CONDITIONAL
   * @return value or {@code null} for none
   */
  public Feature getCertaintyAssessment() {
    return certaintyAssessment;
  }

  /**
   * The certainty assessment of the entity mention. Its value is one of: LIKELY, SOMEWHAT_LIKELY,
   * UNCERTAIN, SOMEWHAT_UNLIKELY, UNLIKELY, CONDITIONAL
   * @param certaintyAssessment certaintyAssessment or {@code null} for none
   */
  public EntityMention setCertaintyAssessment(Feature certaintyAssessment) {
    this.certaintyAssessment = certaintyAssessment;
    return this;
  }

  /**
   * The model's confidence in this entity mention annotation. A number between 0 and 1.
   * @return value or {@code null} for none
   */
  public java.lang.Double getConfidence() {
    return confidence;
  }

  /**
   * The model's confidence in this entity mention annotation. A number between 0 and 1.
   * @param confidence confidence or {@code null} for none
   */
  public EntityMention setConfidence(java.lang.Double confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * linked_entities are candidate ontological concepts that this entity mention may refer to. They
   * are sorted by decreasing confidence.it
   * @return value or {@code null} for none
   */
  public java.util.List<LinkedEntity> getLinkedEntities() {
    return linkedEntities;
  }

  /**
   * linked_entities are candidate ontological concepts that this entity mention may refer to. They
   * are sorted by decreasing confidence.it
   * @param linkedEntities linkedEntities or {@code null} for none
   */
  public EntityMention setLinkedEntities(java.util.List<LinkedEntity> linkedEntities) {
    this.linkedEntities = linkedEntities;
    return this;
  }

  /**
   * mention_id uniquely identifies each entity mention in a single response.
   * @return value or {@code null} for none
   */
  public java.lang.String getMentionId() {
    return mentionId;
  }

  /**
   * mention_id uniquely identifies each entity mention in a single response.
   * @param mentionId mentionId or {@code null} for none
   */
  public EntityMention setMentionId(java.lang.String mentionId) {
    this.mentionId = mentionId;
    return this;
  }

  /**
   * The subject this entity mention relates to. Its value is one of: PATIENT, FAMILY_MEMBER, OTHER
   * @return value or {@code null} for none
   */
  public Feature getSubject() {
    return subject;
  }

  /**
   * The subject this entity mention relates to. Its value is one of: PATIENT, FAMILY_MEMBER, OTHER
   * @param subject subject or {@code null} for none
   */
  public EntityMention setSubject(Feature subject) {
    this.subject = subject;
    return this;
  }

  /**
   * How this entity mention relates to the subject temporally. Its value is one of: CURRENT,
   * CLINICAL_HISTORY, FAMILY_HISTORY, UPCOMING, ALLERGY
   * @return value or {@code null} for none
   */
  public Feature getTemporalAssessment() {
    return temporalAssessment;
  }

  /**
   * How this entity mention relates to the subject temporally. Its value is one of: CURRENT,
   * CLINICAL_HISTORY, FAMILY_HISTORY, UPCOMING, ALLERGY
   * @param temporalAssessment temporalAssessment or {@code null} for none
   */
  public EntityMention setTemporalAssessment(Feature temporalAssessment) {
    this.temporalAssessment = temporalAssessment;
    return this;
  }

  /**
   * text is the location of the entity mention in the document.
   * @return value or {@code null} for none
   */
  public TextSpan getText() {
    return text;
  }

  /**
   * text is the location of the entity mention in the document.
   * @param text text or {@code null} for none
   */
  public EntityMention setText(TextSpan text) {
    this.text = text;
    return this;
  }

  /**
   * The semantic type of the entity: UNKNOWN_ENTITY_TYPE, ALONE, ANATOMICAL_STRUCTURE,
   * ASSISTED_LIVING, BF_RESULT, BM_RESULT, BM_UNIT, BM_VALUE, BODY_FUNCTION, BODY_MEASUREMENT,
   * COMPLIANT, DOESNOT_FOLLOWUP, FAMILY, FOLLOWSUP, LABORATORY_DATA, LAB_RESULT, LAB_UNIT,
   * LAB_VALUE, MEDICAL_DEVICE, MEDICINE, MED_DOSE, MED_DURATION, MED_FORM, MED_FREQUENCY,
   * MED_ROUTE, MED_STATUS, MED_STRENGTH, MED_TOTALDOSE, MED_UNIT, NON_COMPLIANT,
   * OTHER_LIVINGSTATUS, PROBLEM, PROCEDURE, PROCEDURE_RESULT, PROC_METHOD,
   * REASON_FOR_NONCOMPLIANCE, SEVERITY, SUBSTANCE_ABUSE, UNCLEAR_FOLLOWUP.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The semantic type of the entity: UNKNOWN_ENTITY_TYPE, ALONE, ANATOMICAL_STRUCTURE,
   * ASSISTED_LIVING, BF_RESULT, BM_RESULT, BM_UNIT, BM_VALUE, BODY_FUNCTION, BODY_MEASUREMENT,
   * COMPLIANT, DOESNOT_FOLLOWUP, FAMILY, FOLLOWSUP, LABORATORY_DATA, LAB_RESULT, LAB_UNIT,
   * LAB_VALUE, MEDICAL_DEVICE, MEDICINE, MED_DOSE, MED_DURATION, MED_FORM, MED_FREQUENCY,
   * MED_ROUTE, MED_STATUS, MED_STRENGTH, MED_TOTALDOSE, MED_UNIT, NON_COMPLIANT,
   * OTHER_LIVINGSTATUS, PROBLEM, PROCEDURE, PROCEDURE_RESULT, PROC_METHOD,
   * REASON_FOR_NONCOMPLIANCE, SEVERITY, SUBSTANCE_ABUSE, UNCLEAR_FOLLOWUP.
   * @param type type or {@code null} for none
   */
  public EntityMention setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public EntityMention set(String fieldName, Object value) {
    return (EntityMention) super.set(fieldName, value);
  }

  @Override
  public EntityMention clone() {
    return (EntityMention) super.clone();
  }

}