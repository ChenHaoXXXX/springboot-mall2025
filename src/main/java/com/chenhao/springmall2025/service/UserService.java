package com.chenhao.springmall2025.service;

import com.chenhao.springmall2025.model.User;
import com.chenhao.springmall2025.model.UserRegisterRequest;

public interface UserService {
     Integer register(UserRegisterRequest userRegisterRequest);
     User getUserById(Integer id);
     Integer modifyUserAccount(Integer userId,UserRegisterRequest userRegisterRequest);
     void deleteById(Integer id);
}
