package com.finalproject.finalproject.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.finalproject.finalproject.entities.Company;
import com.finalproject.finalproject.entities.Profile;
import com.finalproject.finalproject.entities.Team;
import com.finalproject.finalproject.entities.User;
import com.finalproject.finalproject.exceptions.BadRequestException;
import com.finalproject.finalproject.mappers.CredentialsMapper;
import com.finalproject.finalproject.mappers.UserMapper;
import com.finalproject.finalproject.model.UserRequestDto;
import com.finalproject.finalproject.model.UserResponseDto;
import com.finalproject.finalproject.repositories.CompanyRepository;
import com.finalproject.finalproject.repositories.TeamRepository;
import com.finalproject.finalproject.repositories.UserRepository;
import com.finalproject.finalproject.services.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	private final UserRepository userRepository;
	private final UserMapper userMapper;
	private final CredentialsMapper credentialsMapper;
	private final CompanyRepository companyRepository ;
	private final TeamRepository teamRepository;
	
	@Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
//	User newUserToBeCreated = userMapper.dtoToEntity(userRequestDto);
//	newUserToBeCreated.setCredentials(credentialsMapper.dtoToEntity(userRequestDto.getCredentials()));
////	if (availableUsername(newUserToBeCreated)) {
////		throw new BadRequestException("Username already exists");
////	}
//	Profile profile = new Profile();
//	profile.setFirstName(userRequestDto.getFirstName());
//	profile.setLastName(userRequestDto.getLastName());
//	profile.setPhone(userRequestDto.getPhone());
//	profile.setEmail(userRequestDto.getEmail());
//
//	if (userRequestDto.getCompany() != null) {
//		Optional<Company> optionalCompany = companyRepository.findById(userRequestDto.getCompany().getId());
//		if (optionalCompany.isPresent()) {
//			newUserToBeCreated.setCompany(optionalCompany.get());
//		} else {
//			throw new BadRequestException("Company does not exist");
////			throw new BadRequestException("Company with id: " + userRequestDto.getCompany().getCompanyId() + " does not exist");
//		}
//	}
//	if (userRequestDto.getTeam() != null) {
//		Optional<Team> optionalTeam = teamRepository.findById(userRequestDto.getTeam().getId());
//		if (optionalTeam.isPresent()) {
//			newUserToBeCreated.setTeam(optionalTeam.get());
//		} else {
//			throw new BadRequestException("Team does not exist");
//		}
//	}
//	newUserToBeCreated.setProfile(profile);
//	return userMapper.entityToDto(userRepository.saveAndFlush(newUserToBeCreated));
		return null;
    }

    @Override
    public List<UserResponseDto> getUsersByCompany(Long companyId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserResponseDto getUserByUserId(long userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserResponseDto updateUser(long userId) {
        // TODO Auto-generated method stub
        return null;
    }

}