package it.longo.calculator.core.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import it.longo.calculator.core.StandardCalculator;

@Service
public class StandardCalculatorImpl implements StandardCalculator {

	@Override
	public BigDecimal add(BigDecimal x, BigDecimal y) {
		return x.add(y);
	}

	@Override
	public BigDecimal substract(BigDecimal x, BigDecimal y) {
		return x.subtract(y);
	}

	@Override
	public BigDecimal multiply(BigDecimal x, BigDecimal y) {
		return x.multiply(y);
	}

	@Override
	public BigDecimal divide(BigDecimal x, BigDecimal y) {
		return x.divide(y);
	}
}
