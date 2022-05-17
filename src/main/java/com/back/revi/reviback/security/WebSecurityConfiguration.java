package com.back.revi.reviback.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter  {

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**", "/static/**", "/h2-console/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable()
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
			.authorizeRequests()
			.antMatchers("/api/echo/**", HttpMethod.GET.toString()).permitAll()
			.antMatchers("/api/**", HttpMethod.GET.toString()).permitAll()
			.antMatchers("/api/**", HttpMethod.POST.toString()).permitAll()
			.antMatchers("/api/test/**").permitAll()
			.antMatchers("/v3/api-docs/**").permitAll()
			.antMatchers("/swagger-ui/**").permitAll()
			.antMatchers("/swagger-ui.html").permitAll()
			.antMatchers("/swagger-ui-custom.html**").permitAll()
			.anyRequest().authenticated();
	}

}