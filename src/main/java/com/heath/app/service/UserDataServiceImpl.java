package com.heath.app.service;

import java.time.LocalDateTime;
import java.util.List;

import com.heath.app.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heath.app.dao.UserDatadao;
import com.heath.app.model.UserLoginData;
import com.heath.app.pojo.StringResponce;

@Service
public class UserDataServiceImpl implements UserDataService {
	@Autowired
	private UserDatadao userDataDao;
	@Autowired
	private UserRepository userRepo;
	
	@Transactional
	@Override
	public List<UserLoginData> getUser() {
		
		return userDataDao.getUser();
	}
	@Transactional
	@Override
	public UserLoginData getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void saveUser(UserLoginData user) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public StringResponce chkLogin(com.heath.app.pojo.UserLogin userLogin) {
		
		return userDataDao.chkLogin(userLogin);
	}
	@Override
	public StringResponce signUp(UserLoginData user) {
		//user.setUsernme(user.getEmail());
		user.setCreatedAt(LocalDateTime.now());
		user.setUpdatedAt(LocalDateTime.now());
		user.setDate_joined(LocalDateTime.now());
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		user.setCreatedBy(user.getEmail());
		user.setUpdatedBy(user.getEmail());
		return userDataDao.signUp(user);
	}

//	@Override
//	public UserLoginData loadUserByUsername(String username) throws UsernameNotFoundException {
//		UserLoginData user = userRepo.findByUsername(username)
//				.orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
//
//		return new org.springframework.security.core.userdetails.User(
//				user.getUsername(),
//				user.getPassword(),
//				List.of(new SimpleGrantedAuthority(user.getRole()))
//		);
//	}
}
