package repository;

import domain.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Thpffcj on 2017/9/13.
 */
public interface EmployeeCrudRepository extends CrudRepository<Employee, Integer> {


}
