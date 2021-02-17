/*
 * package com.nivtek.quoteinfo;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * 
 * import com.nivtek.quoteinfo.entity.Role;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class SecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Autowired UserDetailsService userDetailsService;
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.authorizeRequests(). antMatchers("/getallusers").permitAll().
 * antMatchers("/api/v1/quote").hasRole( Role.USER.toString()).
 * antMatchers("/api/v1/quotes").hasRole("ADMIN"). anyRequest().authenticated().
 * and().httpBasic(); }
 * 
 * @Autowired void configureGlobal(AuthenticationManagerBuilder auth) throws
 * Exception{ auth.userDetailsService(userDetailsService).passwordEncoder(new
 * BCryptPasswordEncoder()); }
 * 
 * }
 */