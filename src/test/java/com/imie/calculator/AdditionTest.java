/**
 * 
 */
package com.imie.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * @author thomas
 *
 */
public class AdditionTest {

	private Addition add;
	
	@Before
	public void setUp() throws Exception {
		this.add = new Addition(1);
	}

	@After
	public void tearDown() throws Exception {
		this.add = null;
	}

	@Test
	public void testMake() {
		this.add.make(2);
		
		org.junit.Assert.assertNotNull(this.add);
		org.junit.Assert.assertEquals(3,this.add.value);
	}

	@Test
	public void testGetValue() {
		org.junit.Assert.assertNotNull(this.add);
		org.junit.Assert.assertEquals(1,this.add.getValue());
	}

}
