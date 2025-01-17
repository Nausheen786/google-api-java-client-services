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

package com.google.api.services.compute.model;

/**
 * Model definition for NetworkInterfaceSubInterface.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkInterfaceSubInterface extends com.google.api.client.json.GenericJson {

  /**
   * An IPv4 internal IP address to assign to the instance for this subinterface. If specified,
   * ip_allocation_mode should be set to ALLOCATE_IP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAllocationMode;

  /**
   * If specified, this subnetwork must belong to the same network as that of the network interface.
   * If not specified the subnet of network interface will be used. If you specify this property,
   * you can specify the subnetwork as a full or partial URL. For example, the following are all
   * valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region/subnetworks/subnetwork  -
   * regions/region/subnetworks/subnetwork
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * VLAN tag. Should match the VLAN(s) supported by the subnetwork to which this subinterface is
   * connecting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer vlan;

  /**
   * An IPv4 internal IP address to assign to the instance for this subinterface. If specified,
   * ip_allocation_mode should be set to ALLOCATE_IP.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * An IPv4 internal IP address to assign to the instance for this subinterface. If specified,
   * ip_allocation_mode should be set to ALLOCATE_IP.
   * @param ipAddress ipAddress or {@code null} for none
   */
  public NetworkInterfaceSubInterface setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAllocationMode() {
    return ipAllocationMode;
  }

  /**
   * @param ipAllocationMode ipAllocationMode or {@code null} for none
   */
  public NetworkInterfaceSubInterface setIpAllocationMode(java.lang.String ipAllocationMode) {
    this.ipAllocationMode = ipAllocationMode;
    return this;
  }

  /**
   * If specified, this subnetwork must belong to the same network as that of the network interface.
   * If not specified the subnet of network interface will be used. If you specify this property,
   * you can specify the subnetwork as a full or partial URL. For example, the following are all
   * valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region/subnetworks/subnetwork  -
   * regions/region/subnetworks/subnetwork
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * If specified, this subnetwork must belong to the same network as that of the network interface.
   * If not specified the subnet of network interface will be used. If you specify this property,
   * you can specify the subnetwork as a full or partial URL. For example, the following are all
   * valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region/subnetworks/subnetwork  -
   * regions/region/subnetworks/subnetwork
   * @param subnetwork subnetwork or {@code null} for none
   */
  public NetworkInterfaceSubInterface setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  /**
   * VLAN tag. Should match the VLAN(s) supported by the subnetwork to which this subinterface is
   * connecting.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVlan() {
    return vlan;
  }

  /**
   * VLAN tag. Should match the VLAN(s) supported by the subnetwork to which this subinterface is
   * connecting.
   * @param vlan vlan or {@code null} for none
   */
  public NetworkInterfaceSubInterface setVlan(java.lang.Integer vlan) {
    this.vlan = vlan;
    return this;
  }

  @Override
  public NetworkInterfaceSubInterface set(String fieldName, Object value) {
    return (NetworkInterfaceSubInterface) super.set(fieldName, value);
  }

  @Override
  public NetworkInterfaceSubInterface clone() {
    return (NetworkInterfaceSubInterface) super.clone();
  }

}
