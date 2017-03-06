package com.snowcattle.demo.service;

import com.snowcattle.demo.entity.Student;
import com.snowcattle.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jiangwenping on 17/3/6.
 */
@Service
@Transactional
public class StudentService
{
    @Autowired
    private StudentMapper studentMapper;

    public Student createStudent(Student student) {
        studentMapper.insertStudent(student);
        return student;
    }

}
