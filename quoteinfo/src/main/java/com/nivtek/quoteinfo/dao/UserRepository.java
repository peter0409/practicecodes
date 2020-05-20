package com.nivtek.quoteinfo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nivtek.quoteinfo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	  User findByUsername(String username);
	  User save(User user);

}
