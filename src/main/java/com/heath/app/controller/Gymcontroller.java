package com.heath.app.controller;

import com.heath.app.model.GymRegistration;
import com.heath.app.service.GymDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gym")
@CrossOrigin(origins = "http://localhost:4200")
public class Gymcontroller {

    @Autowired
    private GymDataService gymDataService;
    @GetMapping("/admin/getGymList")
    public List<GymRegistration> getGymList() {
        return gymDataService.getGymList();
    }

}
