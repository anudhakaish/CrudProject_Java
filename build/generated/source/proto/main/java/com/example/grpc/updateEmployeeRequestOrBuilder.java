// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee.proto

package com.example.grpc;

public interface updateEmployeeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.proto.updateEmployeeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string firstname = 2;</code>
   * @return The firstname.
   */
  java.lang.String getFirstname();
  /**
   * <code>string firstname = 2;</code>
   * @return The bytes for firstname.
   */
  com.google.protobuf.ByteString
      getFirstnameBytes();

  /**
   * <code>string lastname = 3;</code>
   * @return The lastname.
   */
  java.lang.String getLastname();
  /**
   * <code>string lastname = 3;</code>
   * @return The bytes for lastname.
   */
  com.google.protobuf.ByteString
      getLastnameBytes();

  /**
   * <code>string department = 4;</code>
   * @return The department.
   */
  java.lang.String getDepartment();
  /**
   * <code>string department = 4;</code>
   * @return The bytes for department.
   */
  com.google.protobuf.ByteString
      getDepartmentBytes();

  /**
   * <code>string role = 5;</code>
   * @return The role.
   */
  java.lang.String getRole();
  /**
   * <code>string role = 5;</code>
   * @return The bytes for role.
   */
  com.google.protobuf.ByteString
      getRoleBytes();
}
