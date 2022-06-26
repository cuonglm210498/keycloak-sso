package com.example.keycloaksso.service.impl;

import com.example.keycloaksso.entity.User;
import com.example.keycloaksso.repository.UserRepository;
import com.example.keycloaksso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author cuonglm18
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
