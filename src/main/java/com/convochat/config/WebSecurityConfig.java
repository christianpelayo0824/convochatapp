package com.convochat.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{


	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
				.withUser("user")
				.password("{noop}user")
				.authorities("ROLE_USER")
			.and()
				.withUser("admin")
				.password("{noop}admin")
				.authorities("ROLE_ADMIN")
			.and()
				.withUser("useradmin")
				.password("{noop}useradmin")
				.authorities("ROLE_ADMIN", "ROLE_USER");	
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("/*").permitAll()
			.and().formLogin().and().httpBasic();
	}


	
}
