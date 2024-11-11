package com.mosoftvn.service;

import com.mosoftvn.models.User;

public interface UserService {
	User findByUserName(String username);
}
