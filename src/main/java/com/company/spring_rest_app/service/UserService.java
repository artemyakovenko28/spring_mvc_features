package com.company.spring_rest_app.service;

import com.company.spring_rest_app.model.User;

public interface UserService {
    User getUserById(Long id);

    User saveUser(User user);
}
