package com.project.service.impl;

import com.project.dao.IGradeDao;
import com.project.entity.GradeEntity;
import com.project.service.IGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.Name;
import java.util.List;
@Service(value = "IGradeService")
public class GradeServiceImpl implements IGradeService {
    @Autowired
    private IGradeDao gradeDao;

    @Override
    public List<GradeEntity> findAll() {
        return gradeDao.findAll();
    }
}
