package com.ssmms.ningw.module.web.user.dao;  
  
import java.util.List;  
  

import org.apache.ibatis.annotations.Mapper;  

import com.ssmms.ningw.module.web.user.entity.UserEntity;
  

@Mapper  
public interface UserDao {  
  
    public List<UserEntity> findUserInfo();  
   
}