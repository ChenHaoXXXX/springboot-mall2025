package com.chenhao.springmall2025.controller;


import com.chenhao.springmall2025.model.User;
import com.chenhao.springmall2025.model.UserRegisterRequest;
import com.chenhao.springmall2025.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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

    @GetMapping("/users/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable Integer userId){
        User user = userService.getUserById(userId);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PutMapping("/users/{userId}")
    public ResponseEntity<User> modifyUserAccount(@RequestBody @Valid UserRegisterRequest userRegisterRequest,
                                                  @PathVariable Integer userId) {
        Integer id = userService.modifyUserAccount(userId,userRegisterRequest);
        User user = userService.getUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @DeleteMapping("/users/{userId}")
    public ResponseEntity<String> deleteByUserId(@PathVariable @Valid Integer userId) {
        userService.deleteById(userId);
        return ResponseEntity.status(HttpStatus.OK).body("刪除成功");
    }





}
