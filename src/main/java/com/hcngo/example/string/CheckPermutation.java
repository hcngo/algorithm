package com.hcngo.example.string;

import java.util.*;
import com.hcngo.example.HelperUtil;

class CheckPermutation {
	/*
	1.2 Check Permutation: Given two strings, write a method to decide if one is a permutation of the
	other.
	*/

	static void checkPermutationRun() {
		Scanner in = new Scanner(System.in);
		System.out.println("Check permutation of two strings.");
		System.out.println("Enter first string: ");
		String s1 = in.nextLine();
		System.out.println("Enter second string: ");
		String s2 = in.nextLine();
		System.out.println("Are two strings permutation of each other? ---> " + checkPermutation(s1, s2));
	}

	static boolean checkPermutation(String s1, String s2) {

		Map<Character, Integer> charMap1 = HelperUtil.mapifyString(s1);
		Map<Character, Integer> charMap2 = HelperUtil.mapifyString(s2);

		for(Character c : charMap1.keySet()) {
			if (charMap2.get(c) != charMap1.get(c)) {
				return false;
			}
		}

		for(Character c : charMap2.keySet()) {
			if (charMap1.get(c) != charMap2.get(c)) {
				return false;
			}
		}

		return true;
	}
}