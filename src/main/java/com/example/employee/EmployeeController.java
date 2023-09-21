package com.example.employee;
import com.example.MyEmployee;
import com.example.employee.MyEmployeeService;
import java.util.List;
import java.util.Optional;

import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

@Controller
public class EmployeeController {
    @Inject
    private MyEmployeeService employeeService;
    @Post("/create")
    @Produces
    public MyEmployee saveEmployee(@Body MyEmployee employee) {
        System.out.println(employee.getDepartment());
        System.out.println(employee);
        return employeeService.saveEmployee(employee);
    }

    @Get("/{id}")
    public Optional<MyEmployee> getEmployeeByID(Long id) {
        return employeeService.getEmployeeByID(id);
    }

    @Get("/allemployees")
    public Iterable<MyEmployee> getAllEmployees() {
        return employeeService.getEmployees();
    }



    @Put("/{id}")
    public MyEmployee updateEmployee(Long id, @Body MyEmployee updatedEmployee) {
        return employeeService.updateEmployee(id, updatedEmployee);
    }

    @Delete("/{id}")
    public void deleteEmployee(Long id) {
        employeeService.deleteEmployee(id);
    }

}






