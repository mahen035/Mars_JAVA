package com.training.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springrest.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
