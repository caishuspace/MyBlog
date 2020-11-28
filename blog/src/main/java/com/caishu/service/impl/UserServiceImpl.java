package com.caishu.service.impl;

import com.caishu.dao.UserDao;
import com.caishu.pojo.User;
import com.caishu.service.UserService;
import com.caishu.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    //注解为可用的service层
public class UserServiceImpl implements UserService {

    @Autowired  //让 spring 完成 bean 自动装配的工作，这样我不需要实例化UserDao就能调用他的方法
    UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.queryByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
