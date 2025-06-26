package com.heath.app.controller;

import com.heath.app.model.GymRegistration;
import com.heath.app.model.UserLoginData;
import com.heath.app.service.GymDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/public/getGymById/{id}")
    public GymRegistration getGymById(@PathVariable int id) {
        return gymDataService.getGymById(id);
    }
    @PostMapping("/public/saveGym")
    public void saveUser(@RequestBody GymRegistration gymData) {
        gymDataService.saveGym(gymData);
    }
    @DeleteMapping("/public/deleteGym")
    public void deleteUser(@RequestBody int id) {
        gymDataService.deleteGym(id);
    }
}
