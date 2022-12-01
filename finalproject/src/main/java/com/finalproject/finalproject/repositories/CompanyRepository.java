package com.finalproject.finalproject.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.finalproject.entities.Company;
import com.finalproject.finalproject.entities.User;

public interface CompanyRepository extends JpaRepository<Company, Long> {

	Optional<Company> findById(Long companyId);

	List<Company> findByUsers(User user);

}
