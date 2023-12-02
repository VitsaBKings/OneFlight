package com.uap.oneflight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uap.oneflight.model.GuestInfo;
import com.uap.oneflight.model.PassportDetails;
import com.uap.oneflight.repository.RegistrationMybatisRepository;

@RestController
public class SignUpController {
    @Autowired
    RegistrationMybatisRepository signupRepo;
    
    @PostMapping("/signup")
	public GuestInfo signup(@RequestBody GuestInfo user) {
		signupRepo.insert(user);
		return user; 
	}
    
    @PostMapping("/registerpassport")
	public PassportDetails registerpassport(@RequestBody PassportDetails details) {
		signupRepo.register(details);
		return details; 
	}
}
