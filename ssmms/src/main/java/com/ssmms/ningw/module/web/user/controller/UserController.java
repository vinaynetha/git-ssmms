package com.ssmms.ningw.module.web.user.controller;  
  
import java.util.List;  
  


import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

import com.ssmms.ningw.module.web.user.entity.UserEntity;
import com.ssmms.ningw.module.web.user.service.UserService;
  

@RestController    
@RequestMapping("/user")    
public class UserController {    
    @Autowired  
    private UserService userService;  
      
    @RequestMapping("/getUserInfo")  
    public List<UserEntity> getUserInfo() {  
        List<UserEntity> user = userService.getUserInfo();  
        System.out.println(user.toString());  
        return user;  
    }  
      
}    