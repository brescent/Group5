package com.project.service.impl;

import com.project.dao.IGradeDao;
import com.project.dao.IUserDao;
import com.project.entity.GradeEntity;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.naming.Name;
import java.util.List;

/**
 * 用户业务实现类
 */
@Repository(value = "userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Autowired
    private IGradeDao gradeDao;
    @Override
    public UserEntity login(String userName, String password) {

        UserEntity user = userDao.findByUserNameAndPassword(userName,password);
        if(user != null){
            List<GradeEntity> gradeList = gradeDao.findGradeByUserId(user.getId());
            user.setGeades(gradeList);
        }

        return user;
    }
}
