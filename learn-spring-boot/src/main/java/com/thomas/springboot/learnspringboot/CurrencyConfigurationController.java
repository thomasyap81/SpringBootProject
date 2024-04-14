package com.thomas.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrentServiceConfiguration configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrentServiceConfiguration retrieveConfigurationInfo(){
		return configuration;
				
	}

}
