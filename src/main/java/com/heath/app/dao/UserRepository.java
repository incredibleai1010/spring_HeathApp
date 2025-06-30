package com.heath.app.dao;

import com.heath.app.model.UserLoginData;
import com.heath.app.pojo.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserLoginData, Long> {
    Optional<UserLoginData> findByUsername(String username);
    boolean existsByUsername(String username);
}
