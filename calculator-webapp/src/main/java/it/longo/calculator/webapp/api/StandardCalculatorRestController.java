package it.longo.calculator.webapp.api;

import java.math.BigDecimal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.longo.calculator.core.StandardCalculator;
import it.longo.calculator.webapp.api.exception.handler.CalculatorExceptionHandler;
import it.longo.calculator.webapp.bean.request.StandardCalculatorRequest;
import it.longo.calculator.webapp.bean.response.CalculatorResponse;

/**
 * StandardCalculator REST API. Validation is through Bean Validation J2EE.
 * @author vincenzo.longo
 * @see CalculatorExceptionHandler
 */
@RestController
@RequestMapping("/standard")
public class StandardCalculatorRestController {
	private StandardCalculator standardCalculator;
	
	@Autowired
	public StandardCalculatorRestController(StandardCalculator standardCalculator) {
		this.standardCalculator = standardCalculator;
	}
	
	@GetMapping("/add")
	public CalculatorResponse<BigDecimal> add(@Valid StandardCalculatorRequest req) {
		final CalculatorResponse<BigDecimal> calculatorResponse = new CalculatorResponse<BigDecimal>();
		final BigDecimal X = req.getX();//new BigDecimal(req.getX());
		final BigDecimal Y = req.getY();//new BigDecimal(req.getY());
		calculatorResponse.setResult( this.standardCalculator.add(X, Y) );
		return calculatorResponse;
	}
	
	@GetMapping("/substract")
	public CalculatorResponse<BigDecimal> substract(@Valid StandardCalculatorRequest req) {
		final CalculatorResponse<BigDecimal> calculatorResponse = new CalculatorResponse<BigDecimal>();
		final BigDecimal X = req.getX();//new BigDecimal(req.getX());
		final BigDecimal Y = req.getY();//new BigDecimal(req.getY());
		calculatorResponse.setResult( this.standardCalculator.substract(X, Y) );
		return calculatorResponse;
	}
	
	@GetMapping("/multiply")
	public CalculatorResponse<BigDecimal> multiply(@Valid StandardCalculatorRequest req) {
		final CalculatorResponse<BigDecimal> calculatorResponse = new CalculatorResponse<BigDecimal>();
		final BigDecimal X = req.getX();//new BigDecimal(req.getX());
		final BigDecimal Y = req.getY();//new BigDecimal(req.getY());
		calculatorResponse.setResult( this.standardCalculator.multiply(X, Y) );
		return calculatorResponse;
	}

	@GetMapping("/divide")
	public CalculatorResponse<BigDecimal> divide(@Valid StandardCalculatorRequest req) {
		final CalculatorResponse<BigDecimal> calculatorResponse = new CalculatorResponse<BigDecimal>();
		final BigDecimal X = req.getX();//new BigDecimal(req.getX());
		final BigDecimal Y = req.getY();//new BigDecimal(req.getY());
		calculatorResponse.setResult( this.standardCalculator.divide(X, Y) );
		return calculatorResponse;
	}
}
