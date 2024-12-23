package com.heath.app.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.heath.app.model.UserData;
import com.heath.app.pojo.StringResponce;
import com.heath.app.pojo.UserLogin;

public interface UserDataService {
	List<UserData> getUser();
	public StringResponce chkLogin(UserLogin userLogin);
	UserData getUserById(int id);
	void saveUser(UserData user);
	void deleteUser(int id);
}
