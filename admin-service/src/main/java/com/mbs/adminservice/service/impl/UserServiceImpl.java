package com.mbs.adminservice.service.impl;


import com.mbs.adminservice.model.User;
import com.mbs.adminservice.repository.UserRepository;
import com.mbs.adminservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long user_id) {
        return null;
    }

    @Override
    public User addUser(User newUser) {
        return null;
    }

    @Override
    public User updateUser(User updatedUser, Long user_id) {
        return null;
    }

    @Override
    public void deleteUserById(Long user_id) {

    }
}
