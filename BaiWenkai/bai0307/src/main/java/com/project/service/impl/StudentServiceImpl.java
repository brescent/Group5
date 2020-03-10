package com.project.service.impl;

import com.project.dao.IStudentDao;
import com.project.entity.StudentEntity;
import com.project.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "ss")
public class StudentServiceImpl implements IStudentService {

    @Resource
    private IStudentDao dao;

    @Override
    public void addStu(StudentEntity stu) {
        dao.addStu(stu);
    }

    @Override
    public List<StudentEntity> findAll() {
        return dao.findAll();
    }

    @Override
    public void delStu(int id) {
        dao.delStu(id);
    }
}
