package com.heath.app.dao;

import com.heath.app.model.GymRegistration;

import java.util.List;

public interface GymDatadao {
    List<GymRegistration> getGymList();
}
