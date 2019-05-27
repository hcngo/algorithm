package com.hcngo.example.string;

import java.util.*;
import java.util.stream.*;

class IsUnique {
	/*
	Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
	cannot use additional data structures?
	*/

	static void areCharactersUniqueRunner() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string to find out if all characters are unique:");
		String s = in.nextLine();
		System.out.println("Are all characters unique (with map impl) ? --> " + areCharactersUniqueWithMapImpl(s));
		System.out.println("Are all characters unique (with mergesort impl) ? --> " + areCharactersUniqueWithMergesortImpl(s));
	}

	static boolean areCharactersUniqueWithMapImpl(String s) {
		Map<Character, Integer> charMap = new HashMap<>();
		for(Character c : s.toCharArray()) {
			if (!charMap.containsKey(c)) {
				charMap.put(c, 1);
			} else {
				return false;
			}
			
		}
		return true;
	}

	static boolean areCharactersUniqueWithMergesortImpl(String s) {	
		List<Character> characters = s.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
		Collections.sort(characters);

		for(int i = 0; i < characters.size() - 1; i++) {
			if (characters.get(i).equals(characters.get(i + 1))) {
				return false;
			}
		}
		return true;
	}
}