package com.heath.app.dao;

import java.util.Base64;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

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
	public StringResponce chkLogin(UserLogin userLogin)  {
		StringResponce stringResponce = new StringResponce();
		Session currSession = entityManager.unwrap(Session.class);
		try {
			String decryptedPassword = decrypt(userLogin.getPasswrd());
			Query<UserData> qry = currSession.createQuery("from UserData where mailId = :mailId and passwrd = :passwrd",UserData.class);
			List<UserData> lst = qry.setParameter("mailId", userLogin.getMailId()).setParameter("passwrd", decryptedPassword).getResultList();
			if(lst != null && lst.size() > 0) {
				stringResponce.setResponce("Sucess");
			}else {
				stringResponce.setResponce("fail");
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stringResponce;
	}
	@Override
	public StringResponce signUp(UserData user)  {
		StringResponce stringResponce = new StringResponce();
		Session currSession = entityManager.unwrap(Session.class);
		try {
			String decryptedPassword = decrypt(user.getPasswrd());
			currSession.save(user);
			stringResponce.setResponce("Sucess");
			return stringResponce;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stringResponce;
	}
	
	private String decrypt(String encryptedPassword) throws Exception {
        byte[] keyBytes = "1234567890123456".getBytes(); // Use the same 16-character key
        byte[] ivBytes = "1234567890123456".getBytes();  // Use the same 16-character IV
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(ivBytes);

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);

        byte[] decodedBytes = Base64.getDecoder().decode(encryptedPassword);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);

        return new String(decryptedBytes);
    }

}
