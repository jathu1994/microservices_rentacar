package com.jatha.rentcloud.rentui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpEntity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.jatha.rentcloud.commons.model.Customer;
import com.jatha.rentcloud.rentui.configuration.AccessToken;

@Controller
@EnableOAuth2Sso
public class UIController extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	RestTemplate restTemplate;
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/")
		.permitAll()
		.anyRequest()
		.authenticated();
	}

	@RequestMapping("/")
	public String loadUI() {
		return "home";
	}
	
	@RequestMapping("/secure")
	public String loadSecuredUI() {
		return "secure";
	}
	
	@RequestMapping("/profiles")
	public String loadProfiles(Model model) {
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Authorization", AccessToken.getAccessToken());
		
		HttpEntity<Customer> customerHttpEntity = new HttpEntity<Customer>(httpHeaders);
		
		try {
		ResponseEntity<Customer[]> responseEntity = restTemplate.exchange("http://localhost:9191/services/profiles",HttpMethod.GET,customerHttpEntity,Customer[].class);
		model.addAttribute("customers",responseEntity.getBody());
		}catch(HttpStatusCodeException e){
			ResponseEntity responseEntity = ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders()).body(e.getResponseBodyAsString());
			model.addAttribute("error",responseEntity);
			
		}
		
		return "secure";
	}

}
