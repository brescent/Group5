package com.project.dao;

import com.project.entity.StudentEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentDao {
    /**
     * 添加新学生
     * @param stu 添加学生
     */
    @Insert("insert into t_student(f_name,f_phone)values(#{name},#{phone})")
    void addStu(StudentEntity stu);

    /**
     * 查询所有学生
     * @return 全部学生集合
     */
    @Select("select * from t_student")
    @ResultMap("stuRM")
    List<StudentEntity> findAll();

    /**
     * 根据id删除学生
     * @param id 删除学生id
     */
    @Delete("delete from t_Student where pk_id = #{id}")
    void delStu(int id);
}
