package repository;

import domain.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Thpffcj on 2017/9/13.
 */
public class EmployeeJpaRepositoryTest {

    private ApplicationContext ctx = null;
    private EmployeeJpaRepository employeeJpaRepository = null;

    @Before
    public void setup() {
        ctx = new ClassPathXmlApplicationContext("beans-new.xml");
        employeeJpaRepository = ctx.getBean(EmployeeJpaRepository.class);
        System.out.println("setup");
    }

    @After
    public void tearDown() {
        ctx = null;
        System.out.println("tearDown");
    }

    @Test
    public void testFind() {
        Employee employee = employeeJpaRepository.findOne(99);
        System.out.println(employee);
        System.out.println(employeeJpaRepository.exists(10));
        System.out.println(employeeJpaRepository.exists(102));
    }
}