package com.heath.app.dao;

import java.util.List;

import com.heath.app.model.UserLoginData;
import com.heath.app.pojo.StringResponce;

public interface UserDatadao {
	
	List<UserLoginData> getUser();
	UserLoginData getUserById(int id);
	void saveUser(UserLoginData user);
	void deleteUser(int id);
	public StringResponce chkLogin(com.heath.app.pojo.UserLogin userLogin);
	public StringResponce signUp(UserLoginData user);
	

}
