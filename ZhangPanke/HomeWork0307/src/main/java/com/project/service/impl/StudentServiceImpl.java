package com.project.service.impl;

import com.project.entity.StudentEntity;
import com.project.mapper.IStudentMapper;
import com.project.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentMapper mapper;

    @Override
    public void addStudent(StudentEntity student) {
        mapper.addStudent(student);

    }

    @Override
    public void delStudent(int id) {

        mapper.delStudent(id);
    }

    @Override
    public void updateStu(int id, String newPhone) {
        mapper.updateStu(id,newPhone);

    }

    @Override
    public List<StudentEntity> findAll() {
        return mapper.findAll();
    }
}
