package com.example.employee;
import com.example.MyEmployee;
import com.example.MyEmployeeRepository;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Singleton
@Transactional
public class MyEmployeeService {

    private final MyEmployeeRepository employeeRepository;

    public MyEmployeeService(MyEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public MyEmployee saveEmployee(MyEmployee employee) {
        return employeeRepository.save(employee);
    }
    public Optional<MyEmployee> getEmployeeByID(Long id) { //Get employees by id
        return employeeRepository.findById(id);
    }
    public @NonNull List<MyEmployee> getEmployees() { //Get all employees
        return employeeRepository.findAll();
    }

    public  MyEmployee updateEmployee(Long id, MyEmployee updatedEmployee) {
        Optional<MyEmployee> existingEmployee = employeeRepository.findById(id);
        if (existingEmployee.isPresent()) {
            MyEmployee employee = existingEmployee.get();
            employee.setFirstname(updatedEmployee.getFirstname());
            employee.setLastname(updatedEmployee.getLastname());
            employee.setDepartment(updatedEmployee.getDepartment());
            employee.setRole(updatedEmployee.getRole());
            return employeeRepository.save(employee);
        } else {
            throw new RuntimeException ("Employee not found with EID: " + id);
        }
    }
    public void deleteEmployee(Long id) { //Delete employee by eid
        employeeRepository.deleteById(id);
    }



}
