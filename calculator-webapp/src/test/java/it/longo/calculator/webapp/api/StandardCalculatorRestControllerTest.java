package it.longo.calculator.webapp.api;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import it.longo.calculator.webapp.application.CalculatorApplication;
import it.longo.calculator.webapp.bean.request.StandardCalculatorRequest;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CalculatorApplication.class)
public class StandardCalculatorRestControllerTest {
	@Autowired
	private StandardCalculatorRestController standardCalculatorRestController;
	
	@Test
	@DirtiesContext
	public void testAddOk() {
		final StandardCalculatorRequest req = new StandardCalculatorRequest();
		req.setX(new BigDecimal(1));
		req.setY(new BigDecimal("1."));
		assertThat(this.standardCalculatorRestController.add(req).getResult().intValue()).isEqualTo(2);
	}
	
	@Test(expected = NumberFormatException.class)
	@DirtiesContext
	public void testAddKo() {
		final StandardCalculatorRequest req = new StandardCalculatorRequest();
		req.setX(new BigDecimal(1));
		req.setY(new BigDecimal("1.."));
		this.standardCalculatorRestController.add(req);
	}
}
