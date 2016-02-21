package com.firstutility.lambdaexercises;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LambdaExercisesTest {
	
	private LambdaExercises LambdaExercises = new LambdaExercises();

	@Test
	public void testSortByLength() {
		
		final List<String> originalList = Arrays.asList("abc", "ab", "a");
		final List<String> expectedList = Arrays.asList("a", "ab", "abc");
		
		List<String> actualList = LambdaExercises.sortByLength(originalList);
		
		assertEquals("List not as expected", expectedList, actualList);
	}

}
