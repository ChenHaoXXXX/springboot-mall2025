package com.chenhao.springmall2025.service;

import com.chenhao.springmall2025.model.User;
import com.chenhao.springmall2025.model.UserRegisterRequest;
import com.chenhao.springmall2025.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        User user = new User();
        user.setEmail(userRegisterRequest.getEmail());
        user.setPassword(userRegisterRequest.getPassword());
        user.setCreatedDate(new Date());
        user.setLastModifiedDate(new Date());
        return userRepository.save(user).getUserId();
    }

    @Override
    public User getUserById(Integer id) {
        User user = userRepository.findById(id).orElse(null);
        return user;
    }
}
