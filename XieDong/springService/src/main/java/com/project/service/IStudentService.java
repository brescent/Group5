package com.project.service;

import com.project.entity.StudentEntity;


import java.util.List;


public interface IStudentService {


    public  void add(StudentEntity stu);

    public List<StudentEntity> findAll();
}
