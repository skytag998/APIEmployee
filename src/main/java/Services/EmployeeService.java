package Services;

import Domain.Employee;

import java.util.List;

public interface EmployeeService {
    //listar
    public List<Employee> getAllEmployees();
    //buscar solo 1
    public Employee getEmployee(Integer id );
    // registrar
    public Employee insertEmployee(Employee employee );
    //actualizar
    public void updateEmployee (Employee employee);
    //eliminar
    public Boolean deleteEmployee(Integer id);
}
