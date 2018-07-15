package it.longo.calculator.webapp.api.exception.handler;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import it.longo.calculator.webapp.bean.response.ErrorResponse;

@ControllerAdvice("it.longo.calculator.webapp.api")
@RequestMapping(produces = "application/json")
public class CalculatorExceptionHandler{
	
	@ExceptionHandler(value = { BindException.class })
	protected ResponseEntity<ErrorResponse> handleConstraintViolationException(BindException ex) {
		final ErrorResponse errorResponse = new ErrorResponse();
		final List<FieldError> fieldErrorList = ex.getBindingResult().getFieldErrors();
		fieldErrorList.forEach(
				e -> {
					errorResponse.add(e.getField(), processDefaultMessage(e.getDefaultMessage()));
				} 
		);
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = { Exception.class })
	protected ResponseEntity<ErrorResponse> handleOtherException(Exception ex) {
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	private String processDefaultMessage(String defaultMessage) {
		if ( defaultMessage.contains("NumberFormatException") )
			return "must be a valid number";
		return defaultMessage;
	}
}


