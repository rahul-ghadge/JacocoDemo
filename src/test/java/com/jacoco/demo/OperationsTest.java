package com.jacoco.demo;

import org.junit.Test;

import com.jacoco.demo.Operations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OperationsTest {

	@Test
	public void testAdd() {

		Operations operations = new Operations();
		Integer actual = operations.add(2, 6);
		Integer expected = 8;
		assertEquals(expected, actual);

	}

	
	@Test
	public void testconcatStrings_Success() {

		Operations operations = new Operations();
		String str = operations.concatStrings("Hello", "World");

		assertEquals("Hello World", str);
	}
	
	
	@Test
	public void testconcatStrings_Fail() {

		Operations operations = new Operations();
		String str = operations.concatStrings(null, "");

		assertEquals("Strings should not be empty or null", str);
	}

	
	@Test
	public void testIsPalindrom_True() {

		Operations operations = new Operations();
		boolean isPalindrom = operations.isPalindrom("level");
		assertTrue(isPalindrom);

	}
	
	
	@Test
	public void testIsPalindrom_False() {

		Operations operations = new Operations();
		boolean isPalindrom = operations.isPalindrom("random string");
		assertFalse(isPalindrom);

	}

}
