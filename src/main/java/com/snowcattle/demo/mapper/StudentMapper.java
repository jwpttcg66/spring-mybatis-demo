package com.snowcattle.demo.mapper;

/**
 * Created by jiangwenping on 17/3/6.
 */

import com.snowcattle.demo.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

/**
 * @author Siva
 *
 */
public interface StudentMapper
{


    @Insert("insert into STUDENTS(name,email) values(#{name},#{email})")
    @Options(useGeneratedKeys=true, keyProperty="studId")
    void insertStudent(Student student);

}
