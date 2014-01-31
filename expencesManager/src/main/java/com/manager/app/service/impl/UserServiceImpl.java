package com.manager.app.service.impl;

import com.manager.app.domain.User;
import com.manager.app.repository.UserRepository;
import com.manager.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.findOne(id);
    }
}
