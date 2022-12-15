package com.nilima.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nilima.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
