package com.chenhao.springmall2025.service;

import com.chenhao.springmall2025.model.User;
import com.chenhao.springmall2025.model.UserRegisterRequest;

public interface UserService {
     Integer register(UserRegisterRequest userRegisterRequest);
     User getUserById(Integer id);
}
