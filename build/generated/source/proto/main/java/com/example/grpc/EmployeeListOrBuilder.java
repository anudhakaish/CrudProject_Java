// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee.proto

package com.example.grpc;

public interface EmployeeListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.proto.EmployeeList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.example.proto.Employee employee = 1;</code>
   */
  java.util.List<com.example.grpc.Employee> 
      getEmployeeList();
  /**
   * <code>repeated .com.example.proto.Employee employee = 1;</code>
   */
  com.example.grpc.Employee getEmployee(int index);
  /**
   * <code>repeated .com.example.proto.Employee employee = 1;</code>
   */
  int getEmployeeCount();
  /**
   * <code>repeated .com.example.proto.Employee employee = 1;</code>
   */
  java.util.List<? extends com.example.grpc.EmployeeOrBuilder> 
      getEmployeeOrBuilderList();
  /**
   * <code>repeated .com.example.proto.Employee employee = 1;</code>
   */
  com.example.grpc.EmployeeOrBuilder getEmployeeOrBuilder(
      int index);
}