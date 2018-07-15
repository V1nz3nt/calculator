package it.longo.calculator.webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class BeanConfiguration {
	
	@Bean
	public ObjectMapper objectMapper() {
	  final ObjectMapper jsonObjectMapper = new ObjectMapper();
	  jsonObjectMapper.enable(SerializationFeature.INDENT_OUTPUT);
	  jsonObjectMapper.findAndRegisterModules();
	  return jsonObjectMapper;
	}
	
	@Bean
	public LocalValidatorFactoryBean localValidatorFactoryBean() {
		return new LocalValidatorFactoryBean();
	}
}
