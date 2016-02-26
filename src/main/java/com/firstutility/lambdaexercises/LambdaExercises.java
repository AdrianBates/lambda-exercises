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

	public List<String> sortByFirstChar(List<String> originalList) {
		originalList.sort((s1, s2) -> s1.charAt(0) - s2.charAt(0));
		return originalList;
	}

	public List<String> sortByContainsE(List<String> originalList) {
		originalList.sort((s1, s2) -> {
			if (s1.contains("e") && !s2.contains("e")) {
				return -1;
			} else if (s2.contains("e") && !s1.contains("e")) {
				return 1;
			}
			return 0;
		});
		return originalList;
	}

	public String betterString(String s1, String s2, BetterString betterString) {
		if (betterString.isBetter(s1, s2)) {
			return s1;
		} else {
			return s2;
		}
	}

	public <T> T betterElement(T t1, T t2, TwoElementPredicate<T> predicate) {
		if (predicate.isBetter(t1, t2)) {
			return t1;
		}
		return t2;
	}

}
