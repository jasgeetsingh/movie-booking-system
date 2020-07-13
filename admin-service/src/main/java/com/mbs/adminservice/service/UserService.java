package com.mbs.adminservice.service;


import com.mbs.adminservice.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long user_id);

    User addUser(User newUser);

    User updateUser(User updatedUser, Long user_id);

    void deleteUserById(Long user_id);
}
