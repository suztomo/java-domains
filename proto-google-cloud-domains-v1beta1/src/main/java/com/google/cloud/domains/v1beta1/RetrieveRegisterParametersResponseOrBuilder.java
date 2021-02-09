/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/domains/v1beta1/domains.proto

package com.google.cloud.domains.v1beta1;

public interface RetrieveRegisterParametersResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1beta1.RetrieveRegisterParametersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Parameters to use when calling the `RegisterDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.RegisterParameters register_parameters = 1;</code>
   *
   * @return Whether the registerParameters field is set.
   */
  boolean hasRegisterParameters();
  /**
   *
   *
   * <pre>
   * Parameters to use when calling the `RegisterDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.RegisterParameters register_parameters = 1;</code>
   *
   * @return The registerParameters.
   */
  com.google.cloud.domains.v1beta1.RegisterParameters getRegisterParameters();
  /**
   *
   *
   * <pre>
   * Parameters to use when calling the `RegisterDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.RegisterParameters register_parameters = 1;</code>
   */
  com.google.cloud.domains.v1beta1.RegisterParametersOrBuilder getRegisterParametersOrBuilder();
}
