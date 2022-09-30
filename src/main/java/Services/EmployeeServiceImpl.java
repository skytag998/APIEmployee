package Services;

import Dao.IEmployeeDao;
import Domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private IEmployeeDao empDao;
    @Override
    @Transactional (readOnly = true)
    public List<Employee> getAllEmployees() {
        return (List<Employee>) empDao.findAll();
    }
    @Override
    @Transactional (readOnly = true)
    public Employee getEmployee(Integer id) {
        return empDao.findById(id).orElse(null);
    }
    @Override
    @Transactional
    public Employee insertEmployee(Employee employee) {
        return empDao.save(employee);
    }
    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        empDao.save(employee);
    }
    @Override
    @Transactional
    public Boolean deleteEmployee(Integer id) {
        empDao.deleteById(id);
        return true;
    }
}