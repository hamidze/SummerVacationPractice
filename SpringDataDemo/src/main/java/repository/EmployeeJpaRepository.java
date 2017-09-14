package repository;

import domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Thpffcj on 2017/9/13.
 */
public interface EmployeeJpaRepository extends JpaRepository<Employee, Integer> {
}
