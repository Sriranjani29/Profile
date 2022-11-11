package com.travel.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.travel.entity.User;

@Service

public interface UserService {
	public User insertUser(User user)throws Exception;
	public List<User> getAllUsers()throws Exception;
	
}
