package com.finalproject.finalproject.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.finalproject.entities.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

	List<Team> findAllByCompanyId(Long id);
//
//	Team findById(Long id);
	
	Optional<Team> findById(Long id);


}
