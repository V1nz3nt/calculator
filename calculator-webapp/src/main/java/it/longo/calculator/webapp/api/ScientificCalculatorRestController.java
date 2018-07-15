package it.longo.calculator.webapp.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.longo.calculator.core.ScientificCalculator;
import it.longo.calculator.webapp.api.exception.handler.CalculatorExceptionHandler;
import it.longo.calculator.webapp.bean.request.ScientificCalculatorRequest;
import it.longo.calculator.webapp.bean.response.CalculatorResponse;

/**
 * ScientificCalculator REST API. Validation is through Bean Validation J2EE.
 * @author vincenzo.longo
 * @see CalculatorExceptionHandler
 */
@RestController
@RequestMapping("/scientific")
public class ScientificCalculatorRestController {
	private ScientificCalculator scientificCalculator;
	
	@Autowired
	public ScientificCalculatorRestController(ScientificCalculator scientificCalculator) {
		this.scientificCalculator = scientificCalculator;
	}
	
	@GetMapping("/square")
	public CalculatorResponse<Double> square(@Valid ScientificCalculatorRequest req) {
		final CalculatorResponse<Double> calculatorResponse = new CalculatorResponse<Double>();
		calculatorResponse.setResult( this.scientificCalculator.square(req.getNumber().doubleValue()) );
		return calculatorResponse;
	}
	
	@GetMapping("/exp")
	public CalculatorResponse<Double> exp(@Valid ScientificCalculatorRequest req) {
		final CalculatorResponse<Double> calculatorResponse = new CalculatorResponse<Double>();
		calculatorResponse.setResult( this.scientificCalculator.exp(req.getNumber().doubleValue()) );
		return calculatorResponse;
	}
	
	@GetMapping("/isPrime")
	public CalculatorResponse<Boolean> isPrime(@Valid ScientificCalculatorRequest req) {
		final CalculatorResponse<Boolean> calculatorResponse = new CalculatorResponse<Boolean>();
		calculatorResponse.setResult( this.scientificCalculator.isPrime(req.getNumber().intValue()) );
		return calculatorResponse;
	}
}
