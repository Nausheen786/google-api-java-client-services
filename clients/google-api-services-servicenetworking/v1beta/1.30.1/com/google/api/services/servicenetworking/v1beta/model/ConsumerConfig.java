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

package com.google.api.services.servicenetworking.v1beta.model;

/**
 * Configuration information for a private service access connection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Networking API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConsumerConfig extends com.google.api.client.json.GenericJson {

  /**
   * Export custom routes flag value for peering from consumer to producer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean consumerExportCustomRoutes;

  /**
   * Export subnet routes with public ip flag value for peering from consumer to producer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean consumerExportSubnetRoutesWithPublicIp;

  /**
   * Import custom routes flag value for peering from consumer to producer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean consumerImportCustomRoutes;

  /**
   * Import subnet routes with public ip flag value for peering from consumer to producer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean consumerImportSubnetRoutesWithPublicIp;

  /**
   * Export custom routes flag value for peering from producer to consumer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean producerExportCustomRoutes;

  /**
   * Export subnet routes with public ip flag value for peering from producer to consumer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean producerExportSubnetRoutesWithPublicIp;

  /**
   * Import custom routes flag value for peering from producer to consumer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean producerImportCustomRoutes;

  /**
   * Import subnet routes with public ip flag value for peering from producer to consumer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean producerImportSubnetRoutesWithPublicIp;

  /**
   * Output only. The VPC host network that is used to host managed service instances. In the
   * format, projects/{project}/global/networks/{network} where {project} is the project number e.g.
   * '12345' and {network} is the network name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String producerNetwork;

  /**
   * Output only. The name of the allocated IP address ranges for this private service access
   * connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> reservedRanges;

  /**
   * Export custom routes flag value for peering from consumer to producer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getConsumerExportCustomRoutes() {
    return consumerExportCustomRoutes;
  }

  /**
   * Export custom routes flag value for peering from consumer to producer.
   * @param consumerExportCustomRoutes consumerExportCustomRoutes or {@code null} for none
   */
  public ConsumerConfig setConsumerExportCustomRoutes(java.lang.Boolean consumerExportCustomRoutes) {
    this.consumerExportCustomRoutes = consumerExportCustomRoutes;
    return this;
  }

  /**
   * Export subnet routes with public ip flag value for peering from consumer to producer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getConsumerExportSubnetRoutesWithPublicIp() {
    return consumerExportSubnetRoutesWithPublicIp;
  }

  /**
   * Export subnet routes with public ip flag value for peering from consumer to producer.
   * @param consumerExportSubnetRoutesWithPublicIp consumerExportSubnetRoutesWithPublicIp or {@code null} for none
   */
  public ConsumerConfig setConsumerExportSubnetRoutesWithPublicIp(java.lang.Boolean consumerExportSubnetRoutesWithPublicIp) {
    this.consumerExportSubnetRoutesWithPublicIp = consumerExportSubnetRoutesWithPublicIp;
    return this;
  }

  /**
   * Import custom routes flag value for peering from consumer to producer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getConsumerImportCustomRoutes() {
    return consumerImportCustomRoutes;
  }

  /**
   * Import custom routes flag value for peering from consumer to producer.
   * @param consumerImportCustomRoutes consumerImportCustomRoutes or {@code null} for none
   */
  public ConsumerConfig setConsumerImportCustomRoutes(java.lang.Boolean consumerImportCustomRoutes) {
    this.consumerImportCustomRoutes = consumerImportCustomRoutes;
    return this;
  }

  /**
   * Import subnet routes with public ip flag value for peering from consumer to producer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getConsumerImportSubnetRoutesWithPublicIp() {
    return consumerImportSubnetRoutesWithPublicIp;
  }

  /**
   * Import subnet routes with public ip flag value for peering from consumer to producer.
   * @param consumerImportSubnetRoutesWithPublicIp consumerImportSubnetRoutesWithPublicIp or {@code null} for none
   */
  public ConsumerConfig setConsumerImportSubnetRoutesWithPublicIp(java.lang.Boolean consumerImportSubnetRoutesWithPublicIp) {
    this.consumerImportSubnetRoutesWithPublicIp = consumerImportSubnetRoutesWithPublicIp;
    return this;
  }

  /**
   * Export custom routes flag value for peering from producer to consumer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProducerExportCustomRoutes() {
    return producerExportCustomRoutes;
  }

  /**
   * Export custom routes flag value for peering from producer to consumer.
   * @param producerExportCustomRoutes producerExportCustomRoutes or {@code null} for none
   */
  public ConsumerConfig setProducerExportCustomRoutes(java.lang.Boolean producerExportCustomRoutes) {
    this.producerExportCustomRoutes = producerExportCustomRoutes;
    return this;
  }

  /**
   * Export subnet routes with public ip flag value for peering from producer to consumer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProducerExportSubnetRoutesWithPublicIp() {
    return producerExportSubnetRoutesWithPublicIp;
  }

  /**
   * Export subnet routes with public ip flag value for peering from producer to consumer.
   * @param producerExportSubnetRoutesWithPublicIp producerExportSubnetRoutesWithPublicIp or {@code null} for none
   */
  public ConsumerConfig setProducerExportSubnetRoutesWithPublicIp(java.lang.Boolean producerExportSubnetRoutesWithPublicIp) {
    this.producerExportSubnetRoutesWithPublicIp = producerExportSubnetRoutesWithPublicIp;
    return this;
  }

  /**
   * Import custom routes flag value for peering from producer to consumer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProducerImportCustomRoutes() {
    return producerImportCustomRoutes;
  }

  /**
   * Import custom routes flag value for peering from producer to consumer.
   * @param producerImportCustomRoutes producerImportCustomRoutes or {@code null} for none
   */
  public ConsumerConfig setProducerImportCustomRoutes(java.lang.Boolean producerImportCustomRoutes) {
    this.producerImportCustomRoutes = producerImportCustomRoutes;
    return this;
  }

  /**
   * Import subnet routes with public ip flag value for peering from producer to consumer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProducerImportSubnetRoutesWithPublicIp() {
    return producerImportSubnetRoutesWithPublicIp;
  }

  /**
   * Import subnet routes with public ip flag value for peering from producer to consumer.
   * @param producerImportSubnetRoutesWithPublicIp producerImportSubnetRoutesWithPublicIp or {@code null} for none
   */
  public ConsumerConfig setProducerImportSubnetRoutesWithPublicIp(java.lang.Boolean producerImportSubnetRoutesWithPublicIp) {
    this.producerImportSubnetRoutesWithPublicIp = producerImportSubnetRoutesWithPublicIp;
    return this;
  }

  /**
   * Output only. The VPC host network that is used to host managed service instances. In the
   * format, projects/{project}/global/networks/{network} where {project} is the project number e.g.
   * '12345' and {network} is the network name.
   * @return value or {@code null} for none
   */
  public java.lang.String getProducerNetwork() {
    return producerNetwork;
  }

  /**
   * Output only. The VPC host network that is used to host managed service instances. In the
   * format, projects/{project}/global/networks/{network} where {project} is the project number e.g.
   * '12345' and {network} is the network name.
   * @param producerNetwork producerNetwork or {@code null} for none
   */
  public ConsumerConfig setProducerNetwork(java.lang.String producerNetwork) {
    this.producerNetwork = producerNetwork;
    return this;
  }

  /**
   * Output only. The name of the allocated IP address ranges for this private service access
   * connection.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReservedRanges() {
    return reservedRanges;
  }

  /**
   * Output only. The name of the allocated IP address ranges for this private service access
   * connection.
   * @param reservedRanges reservedRanges or {@code null} for none
   */
  public ConsumerConfig setReservedRanges(java.util.List<java.lang.String> reservedRanges) {
    this.reservedRanges = reservedRanges;
    return this;
  }

  @Override
  public ConsumerConfig set(String fieldName, Object value) {
    return (ConsumerConfig) super.set(fieldName, value);
  }

  @Override
  public ConsumerConfig clone() {
    return (ConsumerConfig) super.clone();
  }

}