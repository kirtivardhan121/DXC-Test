package com.dxc.td.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.dxc.td.service.ArthOperation;

public class ArthOperationTest {

	ArthOperation arth;
	
	@BeforeEach
	public  void setUp() {
		arth = new ArthOperation();
	}
	@AfterEach
	public  void tearDown() {
		arth = null;
	}
	
	@DisplayName("Testing sum method with both  param as 0")
	@Test
	public void testSum_givenZeros() {
		
		
		Assertions.assertEquals(0, arth.sum(0, 0));
	}
	
	@DisplayName("Testing sum method with both  param as Positive")
	@Test
	public void testSum_givenPositives() {
	
		
		Assertions.assertEquals(5, arth.sum(3, 2));
	}
	
	@DisplayName("Testing sum method with both  param as Negative")
	@Test
	public void testSum_givenNegatives() {
		
		
		Assertions.assertEquals(-5, arth.sum(-3, -2));
	}
	
	@DisplayName("Testing sum method with one param as positive and one negative")
	@Test
	public void testSum_givenNegativeAndPositives() {
		
		Assertions.assertEquals(1, arth.sum(-2, 3));
	}
	
	@Disabled
	@Test
	public void testProduct_givenZeros() {
		
		
		Assertions.assertEquals(0, arth.product(0, 0));
	}
	
	@Disabled
	@Test
	public void testProduct_givenPositives() {
		
		Assertions.assertEquals(4, arth.product(2, 2));
	}
	
	@Test
	public void testProduct_givenNegatives() {
		
		Assertions.assertEquals(4, arth.product(-2, -2));
	}
	
	@Test
	public void testProduct_givenPositivesAndNegatives() {
		
		Assertions.assertEquals(-4, arth.product(-2, 2));
	}
}
