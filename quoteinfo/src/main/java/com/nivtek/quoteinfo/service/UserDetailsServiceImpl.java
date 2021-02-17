/*
 * package com.nivtek.quoteinfo.service;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.User.UserBuilder; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import com.nivtek.quoteinfo.dao.UserRepository; import
 * com.nivtek.quoteinfo.entity.User;
 * 
 * @Service public class UserDetailsServiceImpl implements UserDetailsService {
 * 
 * @Autowired UserRepository userRepository;
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException {
 * 
 * User user = userRepository.findByUsername(username);
 * 
 * UserBuilder builder = null; if (user != null) { builder =
 * org.springframework.security.core.userdetails.User.withUsername(username);
 * builder.password(user.getPassword()); builder.roles(new String[]
 * {user.getRole().toString()}); } else { throw new
 * UsernameNotFoundException("User not found."); }
 * 
 * return builder.build(); }
 * 
 * }
 */