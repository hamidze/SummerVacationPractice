package service;

import domain.Employee;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.EmployeeCrudRepository;
import repository.EmployeeRepository;

import java.util.List;

/**
 * Created by Thpffcj on 2017/9/12.
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeCrudRepository employeeCrudRepository;

    @Transactional
    public void update(Integer id, Integer age) {
        employeeRepository.update(id, age);
    }

    @Transactional
    public void save(List<Employee> employees) {
        employeeCrudRepository.save(employees);
    }
}
