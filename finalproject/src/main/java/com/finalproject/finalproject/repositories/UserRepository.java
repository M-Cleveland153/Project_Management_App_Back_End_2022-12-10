package com.finalproject.finalproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.finalproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
