package com.chenhao.springmall2025.controller;


import com.chenhao.springmall2025.model.User;
import com.chenhao.springmall2025.model.UserRegisterRequest;
import com.chenhao.springmall2025.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users/register")
    public ResponseEntity<User> register(@RequestBody @Valid UserRegisterRequest userRegisterRequest) {
        Integer id = userService.register(userRegisterRequest);
        User user = userService.getUserById(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }



}
