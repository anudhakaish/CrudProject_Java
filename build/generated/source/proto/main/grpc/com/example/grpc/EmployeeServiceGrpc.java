package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: employee.proto")
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.proto.EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Employee,
      com.example.grpc.Employee> getCreateEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createEmployee",
      requestType = com.example.grpc.Employee.class,
      responseType = com.example.grpc.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Employee,
      com.example.grpc.Employee> getCreateEmployeeMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Employee, com.example.grpc.Employee> getCreateEmployeeMethod;
    if ((getCreateEmployeeMethod = EmployeeServiceGrpc.getCreateEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getCreateEmployeeMethod = EmployeeServiceGrpc.getCreateEmployeeMethod) == null) {
          EmployeeServiceGrpc.getCreateEmployeeMethod = getCreateEmployeeMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Employee, com.example.grpc.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Employee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("createEmployee"))
              .build();
        }
      }
    }
    return getCreateEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.EmployeeId,
      com.example.grpc.Employee> getGetEmployeeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployeeById",
      requestType = com.example.grpc.EmployeeId.class,
      responseType = com.example.grpc.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.EmployeeId,
      com.example.grpc.Employee> getGetEmployeeByIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.EmployeeId, com.example.grpc.Employee> getGetEmployeeByIdMethod;
    if ((getGetEmployeeByIdMethod = EmployeeServiceGrpc.getGetEmployeeByIdMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeeByIdMethod = EmployeeServiceGrpc.getGetEmployeeByIdMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeeByIdMethod = getGetEmployeeByIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.EmployeeId, com.example.grpc.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployeeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EmployeeId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployeeById"))
              .build();
        }
      }
    }
    return getGetEmployeeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.EmployeeList> getGetEmployeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployees",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.EmployeeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.EmployeeList> getGetEmployeesMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.EmployeeList> getGetEmployeesMethod;
    if ((getGetEmployeesMethod = EmployeeServiceGrpc.getGetEmployeesMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeesMethod = EmployeeServiceGrpc.getGetEmployeesMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeesMethod = getGetEmployeesMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.EmployeeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EmployeeList.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployees"))
              .build();
        }
      }
    }
    return getGetEmployeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.updateEmployeeRequest,
      com.example.grpc.Employee> getUpdateEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateEmployee",
      requestType = com.example.grpc.updateEmployeeRequest.class,
      responseType = com.example.grpc.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.updateEmployeeRequest,
      com.example.grpc.Employee> getUpdateEmployeeMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.updateEmployeeRequest, com.example.grpc.Employee> getUpdateEmployeeMethod;
    if ((getUpdateEmployeeMethod = EmployeeServiceGrpc.getUpdateEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getUpdateEmployeeMethod = EmployeeServiceGrpc.getUpdateEmployeeMethod) == null) {
          EmployeeServiceGrpc.getUpdateEmployeeMethod = getUpdateEmployeeMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.updateEmployeeRequest, com.example.grpc.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.updateEmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("updateEmployee"))
              .build();
        }
      }
    }
    return getUpdateEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.EmployeeId,
      com.example.grpc.Empty> getDeleteEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteEmployee",
      requestType = com.example.grpc.EmployeeId.class,
      responseType = com.example.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.EmployeeId,
      com.example.grpc.Empty> getDeleteEmployeeMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.EmployeeId, com.example.grpc.Empty> getDeleteEmployeeMethod;
    if ((getDeleteEmployeeMethod = EmployeeServiceGrpc.getDeleteEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getDeleteEmployeeMethod = EmployeeServiceGrpc.getDeleteEmployeeMethod) == null) {
          EmployeeServiceGrpc.getDeleteEmployeeMethod = getDeleteEmployeeMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.EmployeeId, com.example.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EmployeeId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("deleteEmployee"))
              .build();
        }
      }
    }
    return getDeleteEmployeeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub>() {
        @java.lang.Override
        public EmployeeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceStub(channel, callOptions);
        }
      };
    return EmployeeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub>() {
        @java.lang.Override
        public EmployeeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceBlockingStub(channel, callOptions);
        }
      };
    return EmployeeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub>() {
        @java.lang.Override
        public EmployeeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceFutureStub(channel, callOptions);
        }
      };
    return EmployeeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EmployeeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Create new employee
     * </pre>
     */
    public void createEmployee(com.example.grpc.Employee request,
        io.grpc.stub.StreamObserver<com.example.grpc.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEmployeeMethod(), responseObserver);
    }

    /**
     * <pre>
     *Retrieve employee by id
     * </pre>
     */
    public void getEmployeeById(com.example.grpc.EmployeeId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get all employee
     * </pre>
     */
    public void getEmployees(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.EmployeeList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeesMethod(), responseObserver);
    }

    /**
     * <pre>
     *Update employee by id
     * </pre>
     */
    public void updateEmployee(com.example.grpc.updateEmployeeRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmployeeMethod(), responseObserver);
    }

    /**
     * <pre>
     *Delete employee by id
     * </pre>
     */
    public void deleteEmployee(com.example.grpc.EmployeeId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEmployeeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateEmployeeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.Employee,
                com.example.grpc.Employee>(
                  this, METHODID_CREATE_EMPLOYEE)))
          .addMethod(
            getGetEmployeeByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.EmployeeId,
                com.example.grpc.Employee>(
                  this, METHODID_GET_EMPLOYEE_BY_ID)))
          .addMethod(
            getGetEmployeesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.example.grpc.Empty,
                com.example.grpc.EmployeeList>(
                  this, METHODID_GET_EMPLOYEES)))
          .addMethod(
            getUpdateEmployeeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.updateEmployeeRequest,
                com.example.grpc.Employee>(
                  this, METHODID_UPDATE_EMPLOYEE)))
          .addMethod(
            getDeleteEmployeeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.EmployeeId,
                com.example.grpc.Empty>(
                  this, METHODID_DELETE_EMPLOYEE)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeServiceStub extends io.grpc.stub.AbstractAsyncStub<EmployeeServiceStub> {
    private EmployeeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Create new employee
     * </pre>
     */
    public void createEmployee(com.example.grpc.Employee request,
        io.grpc.stub.StreamObserver<com.example.grpc.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Retrieve employee by id
     * </pre>
     */
    public void getEmployeeById(com.example.grpc.EmployeeId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get all employee
     * </pre>
     */
    public void getEmployees(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.EmployeeList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetEmployeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Update employee by id
     * </pre>
     */
    public void updateEmployee(com.example.grpc.updateEmployeeRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Delete employee by id
     * </pre>
     */
    public void deleteEmployee(com.example.grpc.EmployeeId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEmployeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Create new employee
     * </pre>
     */
    public com.example.grpc.Employee createEmployee(com.example.grpc.Employee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEmployeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Retrieve employee by id
     * </pre>
     */
    public com.example.grpc.Employee getEmployeeById(com.example.grpc.EmployeeId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get all employee
     * </pre>
     */
    public java.util.Iterator<com.example.grpc.EmployeeList> getEmployees(
        com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetEmployeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Update employee by id
     * </pre>
     */
    public com.example.grpc.Employee updateEmployee(com.example.grpc.updateEmployeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmployeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Delete employee by id
     * </pre>
     */
    public com.example.grpc.Empty deleteEmployee(com.example.grpc.EmployeeId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEmployeeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Create new employee
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Employee> createEmployee(
        com.example.grpc.Employee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEmployeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Retrieve employee by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Employee> getEmployeeById(
        com.example.grpc.EmployeeId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Update employee by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Employee> updateEmployee(
        com.example.grpc.updateEmployeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmployeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Delete employee by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Empty> deleteEmployee(
        com.example.grpc.EmployeeId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_EMPLOYEE = 0;
  private static final int METHODID_GET_EMPLOYEE_BY_ID = 1;
  private static final int METHODID_GET_EMPLOYEES = 2;
  private static final int METHODID_UPDATE_EMPLOYEE = 3;
  private static final int METHODID_DELETE_EMPLOYEE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_EMPLOYEE:
          serviceImpl.createEmployee((com.example.grpc.Employee) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Employee>) responseObserver);
          break;
        case METHODID_GET_EMPLOYEE_BY_ID:
          serviceImpl.getEmployeeById((com.example.grpc.EmployeeId) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Employee>) responseObserver);
          break;
        case METHODID_GET_EMPLOYEES:
          serviceImpl.getEmployees((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.EmployeeList>) responseObserver);
          break;
        case METHODID_UPDATE_EMPLOYEE:
          serviceImpl.updateEmployee((com.example.grpc.updateEmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Employee>) responseObserver);
          break;
        case METHODID_DELETE_EMPLOYEE:
          serviceImpl.deleteEmployee((com.example.grpc.EmployeeId) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.EmployeeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getCreateEmployeeMethod())
              .addMethod(getGetEmployeeByIdMethod())
              .addMethod(getGetEmployeesMethod())
              .addMethod(getUpdateEmployeeMethod())
              .addMethod(getDeleteEmployeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
