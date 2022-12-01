package com.finalproject.finalproject.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.finalproject.entities.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

	Optional<Team> findById(Long id);

}
