package com.nivtek.quoteinfo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.nivtek.quoteinfo.entity.Role;
import com.nivtek.quoteinfo.entity.User;

@Component
public class BootstrapUser implements ApplicationListener<ApplicationReadyEvent> {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		System.out.println("==== Verifying if User Exists or not ====");
		createUserWithRole("peter", "123456", "123@gmail.com", Role.USER);
		
	}

	private void createUserWithRole(String username, String password, String email, Role authority) {
			User user = new User(username, new BCryptPasswordEncoder().encode(password), username, username, email, authority, true);
			userRepository.save(user);
		
	}

}
