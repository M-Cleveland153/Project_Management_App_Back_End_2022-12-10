package com.finalproject.finalproject.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.finalproject.finalproject.entities.Company;
import com.finalproject.finalproject.entities.Profile;
import com.finalproject.finalproject.entities.Team;
import com.finalproject.finalproject.entities.User;
import com.finalproject.finalproject.exceptions.BadRequestException;
import com.finalproject.finalproject.exceptions.NotAuthorizedException;
import com.finalproject.finalproject.exceptions.NotFoundException;
import com.finalproject.finalproject.mappers.CredentialsMapper;
import com.finalproject.finalproject.mappers.UserMapper;
import com.finalproject.finalproject.model.CredentialsDto;
import com.finalproject.finalproject.model.NewUserDto;
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
    public UserResponseDto createUser(NewUserDto newUserDto, Long companyId) {
	User newUserToBeCreated = userMapper.dtoToEntity(newUserDto.getUserRequestDto());
	User authorizingUser = userRepository.findByCredentials(credentialsMapper.dtoToEntity(newUserDto.getCredentialsDto()));
	
	//check if authorizingUser has admin access
	if(!authorizingUser.isAdmin()) {
		throw new NotAuthorizedException("Your are not authorized to create a new user");
	}
	
	//Checking if username is available
	if (userRepository.findByCredentialsUsername(newUserToBeCreated.getCredentials().getUsername()) != null){
		throw new BadRequestException("Username already exists");
	}

	// Profile profile = new Profile();
	// profile.setFirstName(userRequestDto.getProfile().getFirstName());
	// profile.setLastName(userRequestDto.getProfile().getLastName());
	// profile.setPhone(userRequestDto.getProfile().getPhone());
	// profile.setEmail(userRequestDto.getProfile().getEmail());

	//Checking if company exists
// 	if (newUserToBeCreated.getCompany() != null) {
// 		Optional<Company> optionalCompany = companyRepository.findById(newUserToBeCreated.getCompany().getId());
// 		if (optionalCompany.isPresent()) {
// 			newUserToBeCreated.setCompany(optionalCompany.get());
// 		} else {
// 			throw new NotFoundException("Company does not exist");
// //			throw new BadRequestException("Company with id: " + userRequestDto.getCompany().getCompanyId() + " does not exist");
// 		}
// 	}
	
	//Check if team already exists
	// if (newUserToBeCreated.getTeam() != null) {
	// 	Optional<Team> optionalTeam = teamRepository.findById(newUserToBeCreated.getTeam().getId());
	// 	if (optionalTeam.isPresent()) {
	// 		newUserToBeCreated.setTeam(optionalTeam.get());
	// 	} else {
	// 		throw new NotFoundException("Team does not exist");
	// 	}
	// }
	// newUserToBeCreated.setProfile(newUserToBeCreated.getProfile());

	Company companyForNewUser = companyRepository.findById(companyId).get();

	System.out.println(companyForNewUser.getId());

	if (companyForNewUser.getUsers() == null) companyForNewUser.setUsers(new ArrayList<User>());

	companyForNewUser.getUsers().add(newUserToBeCreated);
	newUserToBeCreated.setCompany(companyForNewUser);

	// companyRepository.saveAndFlush(companyForNewUser.get());
	return userMapper.entityToDto(userRepository.saveAndFlush(newUserToBeCreated));
    }

	/// START HERE
    @Override
    public List<UserResponseDto> getUsersByCompany(Long companyId) {
    	List<User> users = userRepository.findAll();
		List<User> usersToGet= new ArrayList<>();
		for (User user : users) {
			if (user.getCompany().getId().equals(companyId)) {
				usersToGet.add(user);
			}
		}
		return userMapper.entitiesToDtos(usersToGet);
    }

    @Override
    public UserResponseDto getUserByUserId(Long userId) {
    	User userToFind = userRepository.findById(userId).get();
    	if (userToFind == null) {
    		throw new NotFoundException("User does not exist");
    	}
		return userMapper.entityToDto(userToFind);
        
    }

//    @Override
//    public UserResponseDto updateUser(Long userId) {
//        // TODO Auto-generated method stub
//        return null;
//    
//	}

}