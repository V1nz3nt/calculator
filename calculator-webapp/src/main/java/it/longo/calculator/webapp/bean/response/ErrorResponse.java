package it.longo.calculator.webapp.bean.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ErrorResponse {
	private Map<String, String> errors = new HashMap<String, String>();
	
	@JsonIgnore
	public void add(String errorKey, String errorDescription) {
		this.errors.put(errorKey, errorDescription);
	}

	public Map<String, String> getErrors() {
		return errors;
	}
}
