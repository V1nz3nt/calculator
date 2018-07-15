package it.longo.calculator.webapp.bean.request;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class ScientificCalculatorRequest {
	@NotNull
	private BigDecimal number;

	public BigDecimal getNumber() {
		return number;
	}
	public void setNumber(BigDecimal number) {
		this.number = number;
	}
}
