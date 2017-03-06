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
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class StudentServiceTest
{
    @Autowired
    private StudentService studentService;


    @Test
    public void testCreateStudent() {
        Student stud = new Student();
        long ts = System.currentTimeMillis();
        stud.setName("stud_"+ts);
        stud.setEmail("stud_"+ts+"@gmail.com");
        Student student = studentService.createStudent(stud);
        System.err.println("CreatedStudent: " + student);
    }

}

