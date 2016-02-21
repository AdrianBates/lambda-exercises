package com.firstutility.lambdaexercises;

import java.util.List;

public class LambdaExercises {

	public List<String> sortByLength(List<String> originalList) {
		originalList.sort((s1, s2) -> s1.length() - s2.length());

		return originalList;
	}

}
