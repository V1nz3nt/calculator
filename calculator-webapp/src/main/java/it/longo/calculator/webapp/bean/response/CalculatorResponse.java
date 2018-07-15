package it.longo.calculator.webapp.bean.response;

public class CalculatorResponse<T> {
	private T result;

	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
}
