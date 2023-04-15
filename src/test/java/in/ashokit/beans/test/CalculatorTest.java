package in.ashokit.beans.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import in.ashokit.beans.Calculator;

public class CalculatorTest {
	
	private static Calculator calc = null;
	
	@BeforeClass
	public static void init() {
		calc = new Calculator();
	}
	@AfterClass
	public static void destry() {
		calc =null;
	}
	
	
	@Test
	public void testAdd() {
		Integer actualResult = calc.add(10, 20);
		Integer ExpectedResult = 30;
		
		assertEquals(ExpectedResult, actualResult);
		
	}
	@Test
	public void testMultiply() {
		Integer actualResult = calc.multiply(5, 5);
		Integer ExpectedResult = 25;
		
		assertEquals(ExpectedResult, actualResult);
		
	}

}
