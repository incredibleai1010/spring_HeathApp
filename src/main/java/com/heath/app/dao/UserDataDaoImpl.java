package com.heath.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.heath.app.model.UserData;
import com.heath.app.pojo.StringResponce;
import com.heath.app.pojo.UserLogin;

import jakarta.persistence.EntityManager;
@Repository
public class UserDataDaoImpl implements UserDatadao {
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<UserData> getUser() {
		Session currSession = entityManager.unwrap(Session.class);
		Query<UserData> qry = currSession.createQuery("from UserData",UserData.class);
		List<UserData> lst = qry.getResultList();
		return lst;
	}

	@Override
	public UserData getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(UserData user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StringResponce chkLogin(UserLogin userLogin) {
		StringResponce stringResponce = new StringResponce();
		Session currSession = entityManager.unwrap(Session.class);
		Query<UserData> qry = currSession.createQuery("from UserData where mailId = :mailId and passwrd = :passwrd",UserData.class);
		List<UserData> lst = qry.setParameter("mailId", userLogin.getMailId()).setParameter("passwrd", userLogin.getPasswrd()).getResultList();
		if(lst != null && lst.size() > 0) {
			stringResponce.setResponce("Sucess");
		}else {
			stringResponce.setResponce("fail");
		}
		return stringResponce;
	}

}
