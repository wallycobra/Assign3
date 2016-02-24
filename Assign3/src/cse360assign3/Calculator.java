/**
 * Calculator 
 * Author: Walter Buga 
 * PIN: 204
 * https://github.com/wallycobra/Assign3.git
 */
package cse360assign3;

public class Calculator {

	private int total;
	/**
	 *  Calculator constructor
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * Returns total 
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * Adds the value
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
	}
	/**
	 * Subtract the value
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		
	}
	/**
	 * Multiply the value
	 * @param value
	 */
	public void multiply (int value) {
		total = total*value;
	}
	/**
	 * Divide the value
	 * @param value
	 */
	public void divide (int value) {
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total = total/value;
		}
		
	}
	/**
	 * Print the history of calculations
	 * @return
	 */
	public String getHistory () {
		return "";
	}
}