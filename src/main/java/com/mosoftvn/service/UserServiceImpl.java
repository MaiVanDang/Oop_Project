package com.mosoftvn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mosoftvn.models.User;
import com.mosoftvn.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public User findByUserName(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(username);
	}

}
