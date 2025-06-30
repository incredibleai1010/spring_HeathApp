package com.heath.app.service;

import com.heath.app.dao.GymDatadao;

import com.heath.app.model.GymRegistration;
import com.heath.app.pojo.StringResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class GymDataServiceImpl implements GymDataService{
    @Autowired
    private GymDatadao gymDataDao;
    @Transactional
    @Override
    public List<GymRegistration> getGymList() {

        return gymDataDao.getGymList();
    }

    @Override
    public GymRegistration getGymById(int id) {
        return gymDataDao.getGymById(id);
    }

    @Override
    public StringResponce saveGym(GymRegistration gym) {
        gym.setCreatedAt(LocalDateTime.now());
        gym.setUpdatedAt(LocalDateTime.now());

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
//        gym.setCreatedBy("test@gmail.com");
//        gym.setUpdatedBy("test@gmail.com");
        return gymDataDao.saveGym(gym);
    }

    @Override
    public void deleteGym(int id) {
        gymDataDao.deleteGym(id);
    }

}
