package employee.management.system.service.employeeService;

import employee.management.system.service.employeeEntity.Employee;
import employee.management.system.service.employeeRepository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Employee employee = null;
        try {
            Optional<Employee> optional = employeeRepository.findById(id);
            if(optional.isPresent()) {
                employee = optional.get();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        employeeRepository.deleteById(id);
    }
}
