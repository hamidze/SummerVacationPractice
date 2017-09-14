package repository;

import domain.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Thpffcj on 2017/9/13.
 */
public interface EmployeePagingAndSortingRepository extends PagingAndSortingRepository<Employee, Integer> {
}
