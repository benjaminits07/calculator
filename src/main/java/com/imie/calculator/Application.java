/**
 * 
 */
package com.imie.calculator;

/**
 * @author thomas
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		
		Addition add = new Addition(a);
		
		add.make(2);
		System.out.println(add.getValue());
		
		add.make(3);
		System.out.println(add.getValue());
		
		System.out.println("OK");
		
	}

}
