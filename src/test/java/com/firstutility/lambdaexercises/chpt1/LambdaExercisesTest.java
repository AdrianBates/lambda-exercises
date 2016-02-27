package com.firstutility.lambdaexercises.chpt1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.firstutility.lambdaexercises.chpt1.LambdaExercises;

public class LambdaExercisesTest {
	
	private LambdaExercises lambdaExercises = new LambdaExercises();

	@Test
	public void testSortByLength() {
		
		final List<String> originalList = Arrays.asList("abc", "ab", "a");
		final List<String> expectedList = Arrays.asList("a", "ab", "abc");
		
		final List<String> actualList = lambdaExercises.sortByLength(originalList);
		
		assertEquals("List not as expected", expectedList, actualList);
	}

	@Test
	public void testSortByLengthDesc() {
		
		final List<String> originalList = Arrays.asList("a", "ab", "abc");
		final List<String> expectedList = Arrays.asList("abc", "ab", "a");
		
		final List<String> actualList = lambdaExercises.sortByLengthDesc(originalList);
		
		assertEquals("List not as expected", expectedList, actualList);
	}

	@Test
	public void testSortByFirstChar() {
		
		final List<String> originalList = Arrays.asList("cba", "ba", "a");
		final List<String> expectedList = Arrays.asList("a", "ba", "cba");
		
		final List<String> actualList = lambdaExercises.sortByFirstChar(originalList);
		
		assertEquals("List not as expected", expectedList, actualList);
	}

	@Test
	public void testSortByContainsE() {
		
		final List<String> originalList = Arrays.asList("cba", "eba", "a");
		final List<String> expectedList = Arrays.asList("eba", "cba", "a");
		
		final List<String> actualList = lambdaExercises.sortByContainsE(originalList);
		
		assertEquals("List not as expected", expectedList, actualList);
	}
	
	@Test
	public void testBetterStringWithTrue() {
		assertEquals("a", lambdaExercises.betterString("a", "b", (s1, s2) -> true));
	}

	@Test
	public void testBetterStringWithFalse() {
		assertEquals("b", lambdaExercises.betterString("a", "b", (s1, s2) -> false));
	}

	@Test
	public void testBetterStringWithComparatorGreaterLength() {
		assertEquals("bc", lambdaExercises.betterString("a", "bc", (s1, s2) -> s1.length() > s2.length()));
	}

	@Test
	public void testBetterStringWithComparatorShortestLength() {
		assertEquals("a", lambdaExercises.betterString("a", "bc", (s1, s2) -> s1.length() < s2.length()));
	}

	@Test
	public void testBetterElementWithTrue() {
		assertEquals("a", lambdaExercises.betterElement("a", "b", (s1, s2) -> true));
	}

	@Test
	public void testBetterElementWithFalse() {
		assertEquals("b", lambdaExercises.betterElement("a", "b", (s1, s2) -> false));
	}

	@Test
	public void testBetterElementWithIntegers() {
		assertEquals(new Integer(1), lambdaExercises.betterElement(new Integer(1), new Integer(2), (i1, i2) -> true));
	}

	@Test
	public void testBetterElementWithIntegersGreater() {
		Integer.valueOf(2).intValue();
		assertEquals(new Integer(2), lambdaExercises.betterElement(new Integer(1), new Integer(2), (i1, i2) -> i1.intValue() > i2.intValue()));
	}

}
