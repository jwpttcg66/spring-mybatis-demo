package com.snowcattle.demo;

import com.snowcattle.demo.entity.Student;
import com.snowcattle.demo.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jiangwenping on 17/3/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:db_applicationContext.xml")
public class OrderServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void test(){
        Student stud = new Student();
        long ts = System.currentTimeMillis();
        stud.setName("stud_" + ts);
        stud.setEmail("stud_" + ts + "@gmail.com");
        Student student = studentService.createStudent(stud);
        System.err.println("CreatedStudent: " + student);
    }
}
