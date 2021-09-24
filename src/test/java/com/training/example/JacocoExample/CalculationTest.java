package com.training.example.JacocoExample;
import org.junit.Test;

import static org.junit.Assert.*;



public class CalculationTest {

	@Test
	public void testFindMax(){
		assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
		
	}
}