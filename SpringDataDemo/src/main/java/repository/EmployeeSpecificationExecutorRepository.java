package repository;

import domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Thpffcj on 2017/9/13.
 */
public interface EmployeeSpecificationExecutorRepository
        extends JpaRepository<Employee, Integer>, JpaSpecificationExecutor<Employee>{
}
