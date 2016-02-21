package com.firstutility.lambdaexercises;

import java.util.List;

public class LambdaExercises {

	public List<String> sortByLength(List<String> originalList) {
		originalList.sort((s1, s2) -> s1.length() - s2.length());
		return originalList;
	}

	public List<String> sortByLengthDesc(List<String> originalList) {
		originalList.sort((s1, s2) -> s2.length() - s1.length());
		return originalList;
	}

}
