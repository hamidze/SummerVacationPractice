package dao;

import domain.Student;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Thpffcj on 2017/9/11.
 */
public class StudentDAOImplTest {

    @Test
    public void testQuery() {

        StudentDAO studentDAO = new StudentDAOImpl();
        List<Student> students = studentDAO.query();

        for (Student student : students) {
            System.out.println("id:" + student.getId()
                    + " , name:" + student.getName()
                    + ", age:" + student.getAge());
        }

    }

    @Test
    public void testSave() {

        StudentDAO studentDAO = new StudentDAOImpl();
        Student student = new Student();
        student.setName("test");
        student.setAge(30);

        studentDAO.save(student);
    }

}