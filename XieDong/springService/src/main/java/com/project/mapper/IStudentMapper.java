package com.project.mapper;

import com.project.entity.StudentEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IStudentMapper {


    @Insert("insert into t_student values(null,#{name},#{tel})")
    public  void add(StudentEntity stu);

    @Select("select * from t_student")
    @ResultType(StudentEntity.class)
    public List<StudentEntity> findAll();
}
