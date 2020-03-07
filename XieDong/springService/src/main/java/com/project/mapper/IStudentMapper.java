package com.project.mapper;

import com.project.entity.StudentEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IStudentMapper {


    @Insert("insert into t_student values(null,#{name},#{tel})")
    public  void add(StudentEntity stu);

//    @Results(id = "studentMap", value = { @Result(column = "pk_id", property = "id", javaType = Integer.class),
//            @Result(column = "f_name", property = "name", javaType = String.class),
//            @Result(column = "f_tel", property = "tel", javaType = String.class) })

    @Select("select * from t_student")
    @ResultMap("studentMap")
   public List<StudentEntity> findAll();
}
