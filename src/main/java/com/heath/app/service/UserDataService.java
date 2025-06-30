package com.heath.app.service;

import java.util.List;

import com.heath.app.model.UserLoginData;
import com.heath.app.pojo.StringResponce;
import com.heath.app.pojo.UserLogin;

public interface UserDataService {
	List<UserLoginData> getUser();
	public StringResponce chkLogin(UserLogin userLogin);
	public StringResponce signUp(UserLoginData user);
	UserLoginData getUserById(int id);
	void saveUser(UserLoginData user);
	void deleteUser(int id);
}
