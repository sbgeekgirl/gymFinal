package com.bootcamp.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.gym.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
