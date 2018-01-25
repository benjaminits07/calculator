package com.imie.calculator;

public class Divide {

	protected int value = 0;
	
	public Divide(int a) {
		this.value = a;
	}
	
	public void make(int b) {
		if (b == 0) {
			this.value = Integer.MIN_VALUE;
		}else {
			this.value /= b;			
		}
	}
	
	public int getValue() {
		return this.value;
	}
}
