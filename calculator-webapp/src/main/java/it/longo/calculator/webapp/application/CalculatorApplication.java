package it.longo.calculator.webapp.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration.class, 
		  org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration.class,
		  org.springframework.boot.actuate.autoconfigure.metrics.MetricsAutoConfiguration.class})
@ComponentScan(basePackages  = { "it.longo.calculator" })
public class CalculatorApplication extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
	      SpringApplication.run(CalculatorApplication.class, args);
	}
}