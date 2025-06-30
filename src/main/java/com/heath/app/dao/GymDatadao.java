package com.heath.app.dao;

import com.heath.app.model.GymRegistration;
import com.heath.app.model.UserLoginData;
import com.heath.app.pojo.StringResponce;

import java.util.List;

public interface GymDatadao {
    List<GymRegistration> getGymList();
    GymRegistration getGymById(int id);
    StringResponce saveGym(GymRegistration user);
    void deleteGym(int id);
}
