package com.ssmms.ningw.module.web.user.entity;  
  
import java.io.Serializable;    
  
public class UserEntity implements Serializable {    

	private static final long serialVersionUID = 1L;
	
	private Integer id;    
    private String username;
	public Integer getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
    
   
}    