package com.stacksimplify.restservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

	//Autowire the User repository
	
	@Autowired
	private UserRepository userRepository;
	//get all users
	public List<User> getAllUsers(){
		
		return userRepository.findAll();
	}
	
	//Create user
	public User createUser(User user) {
		
		return userRepository.save(user);

	}
	
	//get by id
	
	public Optional<User> getUserById(Long id)
	{
		Optional<User> user =userRepository.findById(id);
		return user;
	}
	
	//updateUserById
		public User updateUserById(Long id, User user) {
			user.setId(id);
			return userRepository.save(user);
			
		}
		
		
		//deleteUserById
		public void deleteUserById(Long id) {
			if(userRepository.findById(id).isPresent()) {
				userRepository.deleteById(id);
				
			}
		}
		
		
		//getUserByUsername
		
		public User getUserByUsername(String username) {
			return userRepository.findByUsername(username);
		}
		
		
}
