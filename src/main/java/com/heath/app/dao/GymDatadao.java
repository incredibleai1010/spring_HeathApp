package com.heath.app.dao;

import com.heath.app.model.GymRegistration;
import com.heath.app.model.UserLoginData;

import java.util.List;

public interface GymDatadao {
    List<GymRegistration> getGymList();
    GymRegistration getGymById(int id);
    void saveGym(GymRegistration user);
    void deleteGym(int id);
}
