package it.longo.calculator.core.impl;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import it.longo.calculator.core.StandardCalculator;

@RunWith(SpringRunner.class)
public class StandardCalculatorImplTest {
	private StandardCalculator standardCalculator;
	
	@Before
	public void startUp() {
		this.standardCalculator = new StandardCalculatorImpl();
	}
	
	@Test
	public void testAddWithPositiveNumbers() {
		final BigDecimal X = new BigDecimal(1);
		final BigDecimal Y = new BigDecimal(1);
		assertThat(this.standardCalculator.add(X, Y)).isEqualTo(new BigDecimal(2));
	}
	
	@Test
	public void testAddWithNegativeNumbers() {
		final BigDecimal X = new BigDecimal(-1);
		final BigDecimal Y = new BigDecimal(-1);
		assertThat(this.standardCalculator.add(X, Y)).isEqualTo(new BigDecimal(-2));
	}
	
	@Test
	public void testSubstructWithPositiveNumbers() {
		final BigDecimal X = new BigDecimal(1);
		final BigDecimal Y = new BigDecimal(2);
		assertThat(this.standardCalculator.substract(X, Y)).isEqualTo(new BigDecimal(-1));
	}
	
	@Test
	public void testSubstructWithNegativeNumbers() {
		final BigDecimal X = new BigDecimal(-2);
		final BigDecimal Y = new BigDecimal(-2);
		assertThat(this.standardCalculator.substract(X, Y)).isEqualTo(new BigDecimal(0));
	}
	
	@Test
	public void testMultiplyWithPositiveNumbers() {
		final BigDecimal X = new BigDecimal(2);
		final BigDecimal Y = new BigDecimal(2);
		assertThat(this.standardCalculator.multiply(X, Y)).isEqualTo(new BigDecimal(4));
	}
	
	@Test
	public void testMultiplyWithNegativeNumbers() {
		final BigDecimal X = new BigDecimal(-2);
		final BigDecimal Y = new BigDecimal(-2);
		assertThat(this.standardCalculator.multiply(X, Y)).isEqualTo(new BigDecimal(4));
	}
	
	@Test
	public void testDivideWithPositiveNumbers() {
		final BigDecimal X = new BigDecimal(1);
		final BigDecimal Y = new BigDecimal(2);
		assertThat(this.standardCalculator.divide(X, Y)).isEqualTo(new BigDecimal(0.5f));
	}
	
	@Test
	public void testDivideWithNegativeNumbers() {
		final BigDecimal X = new BigDecimal(-1);
		final BigDecimal Y = new BigDecimal(-2);
		assertThat(this.standardCalculator.divide(X, Y)).isEqualTo(new BigDecimal(0.5f));
	}
}
