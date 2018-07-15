package it.longo.calculator.core.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import it.longo.calculator.core.ScientificCalculator;

@RunWith(SpringRunner.class)
public class ScientificCalculatorImplTest {
	private ScientificCalculator scientificCalculator;
	
	@Before
	public void startUp() {
		this.scientificCalculator = new ScientificCalculatorImpl();
	}
	
	@Test 
	public void testSquareWithNegativeInput() {
		assertThat(this.scientificCalculator.square(-2d)).isEqualTo(4);
	}
	
	@Test 
	public void testExp() {
		assertThat(this.scientificCalculator.exp(2d)).isNotNull();
	}
	
	@Test
	public void testIsPrimeNumberReturnsTrue() {
		assertThat(this.scientificCalculator.isPrime(101)).isEqualTo(true);
	}
	
	@Test
	public void testIsPrimeNumberReturnsFalse() {
		assertThat(this.scientificCalculator.isPrime(50)).isEqualTo(false);
	}
}
