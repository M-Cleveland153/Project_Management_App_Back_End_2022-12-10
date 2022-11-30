package com.finalproject.finalproject.services;

import org.springframework.stereotype.Service;

@Service
public interface ValidateService {

	boolean existUsername(String username);

}
