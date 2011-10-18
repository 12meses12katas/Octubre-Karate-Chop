package org.kata.karatechop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class KarateChopTest {
	
	private int [] emptyArray = {};
	
	private int [] intArray1 = {1};
	
	private int [] intArray3 = {1, 3, 5};
	
	private int [] intArray4 = {1, 3, 5, 7};
	
	private int [] intArray6 = {1, 3, 5, 7, 9, 11, 13};

	@Test
	public void karateChopTest() {
		assertEquals(-1, KarateChopRecursivo.chop(3, emptyArray));
		assertEquals(-1, KarateChopRecursivo.chop(3, intArray1));
		assertEquals(0, KarateChopRecursivo.chop(1, intArray1));
		
		assertEquals(0, KarateChopRecursivo.chop(1, intArray3));
		assertEquals(1, KarateChopRecursivo.chop(3, intArray3));
		assertEquals(2, KarateChopRecursivo.chop(5, intArray3));
		assertEquals(-1, KarateChopRecursivo.chop(0, intArray3));
		assertEquals(-1, KarateChopRecursivo.chop(2, intArray3));
		assertEquals(-1, KarateChopRecursivo.chop(4, intArray3));
		assertEquals(-1, KarateChopRecursivo.chop(6, intArray3));
		
		assertEquals(0, KarateChopRecursivo.chop(1, intArray4));
		assertEquals(1, KarateChopRecursivo.chop(3, intArray4));
		assertEquals(2, KarateChopRecursivo.chop(5, intArray4));
		assertEquals(3, KarateChopRecursivo.chop(7, intArray4));
		assertEquals(-1, KarateChopRecursivo.chop(0, intArray4));
		assertEquals(-1, KarateChopRecursivo.chop(2, intArray4));
		assertEquals(-1, KarateChopRecursivo.chop(4, intArray4));
		assertEquals(-1, KarateChopRecursivo.chop(6, intArray4));
		assertEquals(-1, KarateChopRecursivo.chop(8, intArray4));
		
		assertEquals(0, KarateChopRecursivo.chop(1, intArray6));
		assertEquals(1, KarateChopRecursivo.chop(3, intArray6));
		assertEquals(2, KarateChopRecursivo.chop(5, intArray6));
		assertEquals(3, KarateChopRecursivo.chop(7, intArray6));
		assertEquals(4, KarateChopRecursivo.chop(9, intArray6));
		assertEquals(5, KarateChopRecursivo.chop(11, intArray6));
		assertEquals(6, KarateChopRecursivo.chop(13, intArray6));
		assertEquals(-1, KarateChopRecursivo.chop(0, intArray6));
		assertEquals(-1, KarateChopRecursivo.chop(2, intArray6));
		assertEquals(-1, KarateChopRecursivo.chop(4, intArray6));
		assertEquals(-1, KarateChopRecursivo.chop(6, intArray6));
		assertEquals(-1, KarateChopRecursivo.chop(8, intArray6));
		assertEquals(-1, KarateChopRecursivo.chop(10, intArray6));
		assertEquals(-1, KarateChopRecursivo.chop(12, intArray6));
		assertEquals(-1, KarateChopRecursivo.chop(14, intArray6));
	}
	
	@Test
	public void karateChopIterativoTest() {
		assertEquals(-1, KarateChopIterativo.chop(3, emptyArray));
		assertEquals(-1, KarateChopIterativo.chop(3, intArray1));
		assertEquals(0, KarateChopIterativo.chop(1, intArray1));
		
		assertEquals(0, KarateChopIterativo.chop(1, intArray3));
		assertEquals(1, KarateChopIterativo.chop(3, intArray3));
		assertEquals(2, KarateChopIterativo.chop(5, intArray3));
		assertEquals(-1, KarateChopIterativo.chop(0, intArray3));
		assertEquals(-1, KarateChopIterativo.chop(2, intArray3));
		assertEquals(-1, KarateChopIterativo.chop(4, intArray3));
		assertEquals(-1, KarateChopIterativo.chop(6, intArray3));
		
		assertEquals(0, KarateChopIterativo.chop(1, intArray4));
		assertEquals(1, KarateChopIterativo.chop(3, intArray4));
		assertEquals(2, KarateChopIterativo.chop(5, intArray4));
		assertEquals(3, KarateChopIterativo.chop(7, intArray4));
		assertEquals(-1, KarateChopIterativo.chop(0, intArray4));
		assertEquals(-1, KarateChopIterativo.chop(2, intArray4));
		assertEquals(-1, KarateChopIterativo.chop(4, intArray4));
		assertEquals(-1, KarateChopIterativo.chop(6, intArray4));
		assertEquals(-1, KarateChopIterativo.chop(8, intArray4));
		
		assertEquals(0, KarateChopIterativo.chop(1, intArray6));
		assertEquals(1, KarateChopIterativo.chop(3, intArray6));
		assertEquals(2, KarateChopIterativo.chop(5, intArray6));
		assertEquals(3, KarateChopIterativo.chop(7, intArray6));
		assertEquals(4, KarateChopIterativo.chop(9, intArray6));
		assertEquals(5, KarateChopIterativo.chop(11, intArray6));
		assertEquals(6, KarateChopIterativo.chop(13, intArray6));
		assertEquals(-1, KarateChopIterativo.chop(0, intArray6));
		assertEquals(-1, KarateChopIterativo.chop(2, intArray6));
		assertEquals(-1, KarateChopIterativo.chop(4, intArray6));
		assertEquals(-1, KarateChopIterativo.chop(6, intArray6));
		assertEquals(-1, KarateChopIterativo.chop(8, intArray6));
		assertEquals(-1, KarateChopIterativo.chop(10, intArray6));
		assertEquals(-1, KarateChopIterativo.chop(12, intArray6));
		assertEquals(-1, KarateChopIterativo.chop(14, intArray6));
	}
}
