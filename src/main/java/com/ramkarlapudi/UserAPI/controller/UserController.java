package com.ramkarlapudi.UserAPI.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramkarlapudi.UserAPI.entity.UserProfileEntity;
import com.ramkarlapudi.UserAPI.exception.UploadProfileException;
import com.ramkarlapudi.UserAPI.exception.UserExceptions;
import com.ramkarlapudi.UserAPI.service.UserServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/userservice")
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@GetMapping("/getusers" )
	public ArrayList<UserProfileEntity> getusers() {
	
		return userServiceImpl.getAllUsers();
		
	}
	@GetMapping("/getuser/{id}" )
	public Optional<UserProfileEntity> getUserById(@PathVariable("id") int id ){
		return userServiceImpl.getUserById(id); 
		
	}
	
	@GetMapping("/getusersbyname/{name}")
	public UserProfileEntity getUserbyName(@PathVariable("name")  String name) {
		System.out.println("calling getUserbyName "+ name);
		UserProfileEntity userList =	userServiceImpl.getUserBYname(name);
		if(userList == null) {
			 throw new UserExceptions("User Not Found with name: "+ name );
		}
		return userList;
		
	}
	@PostMapping("/uploadProfile")
	public UserProfileEntity uploadEntity(@RequestBody UserProfileEntity userProfileEntity ) {
		System.out.println("calling uploadProfile "+ userProfileEntity.toString());
		UserProfileEntity user =	userServiceImpl.uploadUser(userProfileEntity);
		if(user == null) {
			throw new UserExceptions("User Not Found for the UserID: "+userProfileEntity.getUserid());
		}
		return user;
	}
	
	

}
