package com.heath.app.dao;

import java.util.List;

import com.heath.app.model.UserData;
import com.heath.app.pojo.StringResponce;
import com.heath.app.pojo.UserLogin;

public interface UserDatadao {
	
	List<UserData> getUser();
	UserData getUserById(int id);
	void saveUser(UserData user);
	void deleteUser(int id);
	public StringResponce chkLogin(UserLogin userLogin);
	public StringResponce signUp(UserData user);
	

}
