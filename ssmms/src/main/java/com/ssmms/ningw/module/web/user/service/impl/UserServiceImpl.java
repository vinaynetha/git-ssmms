package com.ssmms.ningw.module.web.user.service.impl;  
  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssmms.ningw.module.web.user.dao.UserDao;
import com.ssmms.ningw.module.web.user.entity.UserEntity;
import com.ssmms.ningw.module.web.user.service.UserService;
  

@Service("UserService")
public class UserServiceImpl implements UserService{  
  
    @Autowired  
    private UserDao userDao;  
  
    public List<UserEntity> getUserInfo(){  
        return userDao.findUserInfo();  
    }  
 
}  