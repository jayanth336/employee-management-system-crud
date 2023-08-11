package employee.management.system.service.employeeService;

import employee.management.system.service.employeeEntity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(long id);
}
