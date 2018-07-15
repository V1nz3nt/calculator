package it.longo.calculator.core.impl;

import org.springframework.stereotype.Service;

import it.longo.calculator.core.ScientificCalculator;

@Service
public class ScientificCalculatorImpl implements ScientificCalculator {

	@Override
	public Double square(Double a) {
		return Math.pow(a, 2);
	}

	@Override
	public Double exp(Double a) {
		return Math.exp(a);
	}

	@Override
	public Boolean isPrime(Integer n) {
	    if ( isDivisible(n, 2) ) {
	    	return false;
	    }
	    for(int i=3; i*i <= n; i+=2) {
	        if( isDivisible(n, i) ) {
	            return false;
	        }
	    }
	    return true;
	}
	
	private boolean isDivisible(Integer n, Integer d) {
		return (n%d == 0);
	}

}
