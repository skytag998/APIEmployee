package Dao;
import Domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeDao  extends CrudRepository <Employee, Integer>{
}
