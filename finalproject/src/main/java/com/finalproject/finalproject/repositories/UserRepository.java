package com.finalproject.finalproject.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.finalproject.entities.Credentials;
import com.finalproject.finalproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByCredentialsUsername(String username);
	User findByCredentials(Credentials dtoToEntity);
	List<User> findAllById(Long id);
	Optional<User> findById(Long id);
}
