package com.chenhao.springmall2025.repository;


import com.chenhao.springmall2025.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
