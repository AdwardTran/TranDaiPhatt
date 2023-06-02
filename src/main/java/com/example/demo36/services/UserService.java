package com.example.demo36.services;

import com.example.demo36.entity.User;
import com.example.demo36.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }
}
