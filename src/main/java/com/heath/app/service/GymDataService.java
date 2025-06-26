package com.heath.app.service;

import com.heath.app.model.GymRegistration;

import java.util.List;

public interface GymDataService {
    List<GymRegistration> getGymList();
    GymRegistration getGymById(int id);
    void saveGym(GymRegistration user);
    void deleteGym(int id);
}
