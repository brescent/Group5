package com.project.mapper;

import com.project.entity.StudentEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 学生映射接口
 */
public interface IStudentMapper {

    /**
     * 添加学生
     * @param student 学生对象
     */
    @Insert("insert into t_student(f_name,f_phone) values(#{name},#{phone})")
    public void addStudent(StudentEntity student);

    /**
     * 按id删除学生
     * @param id 学生id
     */
    @Delete("delete from t_student where pk_id=#{id}")
    public void delStudent(int id);

    /**
     * 按id修改学生电话
     * @param id 学生id
     * @param newPhone 新的电话号码
     */
    @Update("update t_student set f_phone=#{arg1} where pk_id=#{arg0}")
    public void updateStu(int id,String newPhone);

    /**
     * 查询所有学生
     * @return 学生集合
     */
    @Select("select * from t_student")
    @ResultMap("studentMap")
    public List<StudentEntity> findAll();
}
