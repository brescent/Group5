package com.project.service.impl;

import com.project.entity.StudentEntity;
import com.project.mapper.IStudentMapper;
import com.project.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service(value="studentService")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentMapper  mapper;
    @Override
    public void add(StudentEntity stu) {
        mapper.add(stu);
    }

    @Override
    public List<StudentEntity> findAll() {
        return mapper.findAll();
    }
}
