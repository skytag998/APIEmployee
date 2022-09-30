package Controller;

import Dao.IEmployeeDao;
import Domain.Employee;
import Services.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
public class EmployeeController {
    @Autowired
    private EmployeeService employeex ;
    //consulta todos los empleados
    @GetMapping("/employees")
    List <Employee> getAllEmployees(){
        return employeex.getAllEmployees();
    }
    //Consulta Employee
    @GetMapping("/employee/{id}")
    Employee getEmployee(@PathVariable Integer id){
        return employeex.getEmployee(id);
    }
    //Agregar Employee
    @PostMapping("/employees/add")
    String insertEmployee (@RequestBody Employee employee){
        return String.valueOf(employeex.insertEmployee(employee));
    }
    @PutMapping("/employees/update")
    public void updateEmployee (@RequestBody Employee employee){
        employeex.updateEmployee(employee);
    }
    @DeleteMapping("/employee/dele/{id}")
    Boolean deleteEmployee (@PathVariable Integer id){
        return employeex.deleteEmployee(id);
    }
}
