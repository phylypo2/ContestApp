package com.example.contestapp.service;

import com.example.contestapp.model.User;

public interface UserService {

    User findByLogin(String login);

    void saveUser(User user);
}
