package com.mosoftvn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mosoftvn.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserName(String username);
}
