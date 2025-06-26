package com.heath.app.service;

import com.heath.app.dao.GymDatadao;

import com.heath.app.model.GymRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public void saveGym(GymRegistration user) {
        gymDataDao.saveGym(user);
    }

    @Override
    public void deleteGym(int id) {
        gymDataDao.deleteGym(id);
    }

}
