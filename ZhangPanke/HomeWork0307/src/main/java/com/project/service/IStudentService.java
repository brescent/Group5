package com.project.service;

import com.project.entity.StudentEntity;

import java.util.List;

/**
 * 学生业务层接口
 */
public interface IStudentService {

    /**
     * 添加学生
     * @param student 学生对象
     */
    public void addStudent(StudentEntity student);

    /**
     * 按id删除学生
     * @param id 学生id
     */
    public void delStudent(int id);

    /**
     * 按id修改学生电话
     * @param id 学生id
     * @param newPhone 新的电话号码
     */
    public void updateStu(int id,String newPhone);

    /**
     * 查询所有学生
     * @return 学生集合
     */
    public List<StudentEntity> findAll();
}
