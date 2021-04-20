package Employee;

import java.util.List;

public interface EmployeeDao {
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int empId);
    Employee getEmployeeById(int empId);
    List<Employee> getEmployees();
}
