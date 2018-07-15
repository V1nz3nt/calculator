package it.longo.calculator.webapp.bean.request;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class StandardCalculatorRequest {
	@NotNull 
	private BigDecimal x;
	
	@NotNull 
	private BigDecimal y;
	
	public BigDecimal getX() {
		return x;
	}
	public void setX(BigDecimal x) {
		this.x = x;
	}
	
	public BigDecimal getY() {
		return y;
	}
	public void setY(BigDecimal y) {
		this.y = y;
	}
	
}
