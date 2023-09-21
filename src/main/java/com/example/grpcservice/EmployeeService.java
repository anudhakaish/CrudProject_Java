package com.example.grpcservice;
import com.example.grpc.*;
import com.example.MyEmployee;
import com.example.employee.MyEmployeeService;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import io.micronaut.grpc.annotation.GrpcService;
import jakarta.inject.Inject;
import java.util.List;
import java.util.Optional;



@GrpcService
public class EmployeeService extends EmployeeServiceGrpc.EmployeeServiceImplBase  {
    @Inject
    MyEmployeeService employeeService;

    @Override
    public void createEmployee(Employee request, StreamObserver<Employee> responseObserver) {

        try {
            // Create a MyEmployee instance from the gRPC request
            MyEmployee myEmployee = new MyEmployee();
            myEmployee.setFirstname(request.getFirstname());
            myEmployee.setLastname(request.getLastname());
            myEmployee.setDepartment(request.getDepartment());
            myEmployee.setRole(request.getRole());

            // Call the saveEmployee method to save the employee
            MyEmployee savedEmployee = employeeService.saveEmployee(myEmployee);

            // Create  response with the saved employee data
            Employee response = Employee.newBuilder()
                    .setId(savedEmployee.getId())
                    .setFirstname(savedEmployee.getFirstname())
                    .setLastname(savedEmployee.getLastname())
                    .setDepartment(savedEmployee.getDepartment())
                    .setRole(savedEmployee.getRole())
                    .build();

            // Send the response to the client
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            //  Error response to the client
            responseObserver.onError(Status.INTERNAL.withDescription("Failed to create employee").asException());
        }
    }

    @Override
    public void getEmployeeById(EmployeeId request, StreamObserver<Employee> responseObserver) {
        try {
            // Extract the employee ID from the request
            Long employeeId = request.getId();

            // Call  MyEmployeeService's method to retrieve the employee by ID
            Optional<MyEmployee> employeeOptional = employeeService.getEmployeeByID(employeeId);

            if (employeeOptional.isPresent()) {
                // Convert the MyEmployee instance to an Employee gRPC message
                MyEmployee myEmployee = employeeOptional.get();
                Employee response = Employee.newBuilder()
                        .setId(myEmployee.getId())
                        .setFirstname(myEmployee.getFirstname())
                        .setLastname(myEmployee.getLastname())
                        .setDepartment(myEmployee.getDepartment())
                        .setRole(myEmployee.getRole())
                        .build();

                // Send the response to the client
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            } else {
                // If the employee was not found, send a NOT_FOUND status to the client
                responseObserver.onError(Status.NOT_FOUND.withDescription("Employee not found").asException());
            }
        } catch (Exception e) {
            //  Error response to the client
            responseObserver.onError(Status.INTERNAL.withDescription("Failed to get employee by ID").asException());
        }

    }

    @Override
    public void getEmployees(Empty request, StreamObserver<EmployeeList> responseObserver) {
        try {//Fetch all employees list from table
            List<MyEmployee> employees=employeeService.getEmployees();
            //Create an Employee.Builder to build a  response
            EmployeeList.Builder employeeListBuilder=EmployeeList.newBuilder();
            //Iterate the employee list and adding them to response
            for(MyEmployee employee:employees){
                Employee employeeMessage=Employee.newBuilder()
                        .setId(employee.getId())
                        .setFirstname(employee.getFirstname())
                        .setLastname(employee.getLastname())
                        .setDepartment(employee.getDepartment())
                        .setRole(employee.getRole())
                        .build();
                employeeListBuilder.addEmployee(employeeMessage);

            }
            //Employee List response and sent to client
            EmployeeList employeeListResponse=employeeListBuilder.build();
            responseObserver.onNext(employeeListResponse);
            responseObserver.onCompleted();


        } catch (Exception e){
            //Error handling and error message to client
            responseObserver.onError(Status.INTERNAL.withDescription("Failed to fetch employees").asException());
        }

    }

    @Override
    public void updateEmployee(updateEmployeeRequest request, StreamObserver<Employee> responseObserver) {
        try{
            //Extract Employee ID from request
            Long employeeId= request.getId();
            //Call employeeService method to retrieve Employee by ID
            Optional<MyEmployee> existingEmployeeOptional = employeeService.getEmployeeByID(employeeId);
            System.out.println(existingEmployeeOptional);
            if(existingEmployeeOptional.isPresent()){
                MyEmployee existingEmployee = existingEmployeeOptional.get();
                //Updating employee value with the requested message
                existingEmployee.setId(request.getId());
                existingEmployee.setFirstname(request.getFirstname());
                existingEmployee.setLastname(request.getLastname());
                existingEmployee.setDepartment(request.getDepartment());
                existingEmployee.setRole(request.getRole());
                //Saving the updated values in MyEmployee
                MyEmployee updatedEmployee = employeeService.saveEmployee(existingEmployee);
                //Creating response with updated employee data
                Employee response= Employee.newBuilder()
                        .setId(updatedEmployee.getId())
                        .setFirstname(updatedEmployee.getFirstname())
                        .setLastname(updatedEmployee.getLastname())
                        .setDepartment(updatedEmployee.getDepartment())
                        .setRole(updatedEmployee.getRole()).build();

                responseObserver.onNext(response);
                responseObserver.onCompleted();



            }else{

                responseObserver.onError(Status.NOT_FOUND.withDescription("Employee not found").asException());

            }

        }catch (Exception e){
            responseObserver.onError(Status.INTERNAL.withDescription("Failed to update employee").asException());

        }



    }

    @Override
    public void deleteEmployee(EmployeeId request, StreamObserver<Empty> responseObserver) {
        try{
            //Get employee id from request
            Long employeeId=request.getId();
            //Check if the id is available
            Optional<MyEmployee> existingEmployeeOptional = employeeService.getEmployeeByID(employeeId);
            if(existingEmployeeOptional.isPresent()){
                employeeService.deleteEmployee(employeeId);
                responseObserver.onNext(Empty.newBuilder().build());
                responseObserver.onCompleted();

            }else{
                responseObserver.onError(Status.NOT_FOUND.withDescription("Employee not found").asException());

            }
        }catch (Exception e){
            responseObserver.onError(Status.INTERNAL.withDescription("Failed to delete employee").asException());
        }


    }
}
