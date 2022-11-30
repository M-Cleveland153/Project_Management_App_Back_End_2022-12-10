package com.finalproject.finalproject.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.finalproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByCredentialsUsername(String username);
	 Optional<User> findById(Long id);
}
