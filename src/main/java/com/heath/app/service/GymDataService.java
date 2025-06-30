package com.heath.app.service;

import com.heath.app.model.GymRegistration;
import com.heath.app.pojo.StringResponce;

import java.util.List;

public interface GymDataService {
    List<GymRegistration> getGymList();
    GymRegistration getGymById(int id);
    StringResponce saveGym(GymRegistration user);
    void deleteGym(int id);
}
