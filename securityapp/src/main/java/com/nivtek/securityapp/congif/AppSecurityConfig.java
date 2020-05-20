package com.nivtek.securityapp.congif;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity

//@EnableOAuth2Sso    for google login
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public AuthenticationProvider authProvider() {

		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

		provider.setUserDetailsService(userDetailsService);

		// we do not user bcrpt which is public
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());

		// use this object to have bcrpt password
//		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider;

	}

	
	
	//for customized login and logout page
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		   .csrf().disable()
		   .authorizeRequests().antMatchers("/login").permitAll()
		   .anyRequest().authenticated()
		   .and()
		   .formLogin()
           .loginPage("/login").permitAll()
           .and()
           .logout().invalidateHttpSession(true)
           .clearAuthentication(true)
           .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
           .logoutSuccessUrl("/logout-sucess").permitAll();
	}

	//for google login  only this syntax. and config file on application properties. and add OAuth2Sso dependency.
	//and add one method in controller which is public Principle user(Principle principle) return principle;
	
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http
//		   .csrf().disable()
//		   .authorizeRequests().antMatchers("/login").permitAll()
//		   .anyRequest().authenticated()
//		   .and()
//	
	
	
	
//This way is hardcode username and password.

	/*
	 * @Bean
	 * 
	 * @Override protected UserDetailsService userDetailsService() {
	 * 
	 * List<UserDetails> users = new ArrayList<>();
	 * users.add(User.withDefaultPasswordEncoder().username("peter").password(
	 * "123456").roles("USER").build());
	 * 
	 * return new InMemoryUserDetailsManager(users);
	 * 
	 * }
	 */
}
