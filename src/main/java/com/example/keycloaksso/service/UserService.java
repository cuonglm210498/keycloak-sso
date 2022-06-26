package com.example.keycloaksso.service;

import com.example.keycloaksso.entity.User;

/**
 * author cuonglm18
 */
public interface UserService {

    User findById(Long id);

    void save(User user);
}
