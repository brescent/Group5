package com.project.service;


import com.project.entity.StudentEntity;

import java.util.List;

/**
 * 学生业务接口
 */

public interface IStudentService {
    /**
     * 添加新学生
     * @param stu 添加学生
     */
    void addStu(StudentEntity stu);

    /**
     * 查询所有学生
     * @return 全部学生集合
     */
    List<StudentEntity> findAll();

    /**
     * 根据id删除学生
     * @param id 删除学生id
     */
    void delStu(int id);
}
