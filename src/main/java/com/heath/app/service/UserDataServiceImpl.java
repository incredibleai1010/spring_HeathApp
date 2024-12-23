package com.heath.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heath.app.dao.UserDatadao;
import com.heath.app.model.UserData;
import com.heath.app.pojo.StringResponce;
import com.heath.app.pojo.UserLogin;
@Service
public class UserDataServiceImpl implements UserDataService {
	@Autowired
	private UserDatadao userDataDao;

	@Transactional
	@Override
	public List<UserData> getUser() {
		
		return userDataDao.getUser();
	}
	@Transactional
	@Override
	public UserData getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void saveUser(UserData user) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public StringResponce chkLogin(UserLogin userLogin) {
		return userDataDao.chkLogin(userLogin);
	}

}
