package com.imie.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivideTest {
	
	private Divide div;

	@Before
	public void setUp() throws Exception {
		this.div = new Divide(10);
	}

	@After
	public void tearDown() throws Exception {
		this.div = null;
	}

	@Test
	public void testMake() {
		this.div.make(2);
		
		org.junit.Assert.assertNotNull(this.div);
		org.junit.Assert.assertEquals(5,this.div.getValue());
		
		this.div.make(0);
		Assert.assertEquals(Integer.MIN_VALUE, this.div.value);
	}
	
	@Test
	public void testGetValue() {
		org.junit.Assert.assertNotNull(this.div);
		org.junit.Assert.assertEquals(10,this.div.getValue());
	}

}
