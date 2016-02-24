package cse360assign3;

import static org.junit.Assert.*; 

import org.junit.Test;

public class CalculatorTest {

private int total;
	
	public void testCalculator () {
		total = 0;  // not needed - included for clarity
		Calculator calc = new Calculator();
		assertNotNull(calc);
		
		
		
	}
	
	public int testgetTotal () {
	
		Calculator calc = new Calculator();
		calc.add(10);
		calc.subtract(10);
		assertEquals("0",calc.toString());
		return 0;
	}
	
	public void testadd (int value) {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.add(10);
		assertEquals("20",calc.toString());
		
	}
	
	public void testsubtract (int value) {
		Calculator calc = new Calculator();
		calc.subtract(10);
		calc.subtract(10);
		assertEquals("0",calc.toString());
		
	}
	
	public void testmultiply (int value) {
		Calculator calc = new Calculator();
		calc.multiply(10);
		calc.multiply(10);
		assertEquals("100",calc.toString());
		
	}
	
	public void testdivide (int value) {
		Calculator calc = new Calculator();
		calc.divide(10);
		calc.divide(10);
		assertEquals("1",calc.toString());
		
	}
	
	public String testgetHistory () {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.add(10);
		assertEquals("0 + 10 + 10",calc.toString());
		return "";
	}

}
