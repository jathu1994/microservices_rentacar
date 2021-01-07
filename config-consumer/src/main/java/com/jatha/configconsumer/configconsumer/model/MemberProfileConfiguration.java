package com.jatha.configconsumer.configconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MemberProfileConfiguration {
	
	@Autowired
	Environment environment;
	
	public String getDatasourseUrl() {
		return environment.getProperty("spring.datasource.url");
		
	}
	
	public String getDatasourseUserName() {
		return environment.getProperty("spring.datasource.username"); 
		
	}
	
	

}
