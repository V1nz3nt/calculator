package it.longo.calculator.core;

import java.math.BigDecimal;

/**
 * StandardCalculator defines basic math operation core api
 * @author vincenzo.longo
 */
public interface StandardCalculator {
	BigDecimal add(BigDecimal x, BigDecimal y);
	BigDecimal substract(BigDecimal x, BigDecimal y);
	BigDecimal multiply(BigDecimal x, BigDecimal y);
	BigDecimal divide(BigDecimal x, BigDecimal y);
}
