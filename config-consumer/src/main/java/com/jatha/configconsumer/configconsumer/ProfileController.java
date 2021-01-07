package com.jatha.configconsumer.configconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jatha.configconsumer.configconsumer.model.MemberProfileConfiguration;

@RestController
public class ProfileController {
	
	@Autowired
	MemberProfileConfiguration memberProfileConfiguration; 
	
	@RequestMapping("/profile")
	public MemberProfileConfiguration getConfig() {
//		System.out.print(memberProfileConfiguration.getDatasourseUrl());
//		System.out.print(memberProfileConfiguration.getDatasourseUserName());
		return memberProfileConfiguration;
	}

}
