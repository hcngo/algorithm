package com.hcngo.example.string;

import java.util.*;

class OneAway {
	static void isOneOrZeroEditAwayRunner() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings to find out if they are one edit away.");
		System.out.println("First string : ");
		String s1 = scanner.nextLine();
		System.out.println("Second string : ");
		String s2 = scanner.nextLine();
		System.out.println("Result: " + isOneOrZeroEditAway(s1, s2));
	}
	static boolean isOneOrZeroEditAway(String s1, String s2) {
		char[] charsOfLongerString = s1.length() > s2.length() ? s1.toCharArray() : s2.toCharArray();
		char[] charsOfShorterString = s1.length() <= s2.length() ? s1.toCharArray() : s2.toCharArray();

		if (charsOfLongerString.length - charsOfShorterString.length >= 2) {
			return false;
		}

		boolean isTwoEditAwayAlready = false;
		boolean isOneEditAwayAlready = false;
		int i = 0;
		int j = 0;
		while (!isTwoEditAwayAlready && i < charsOfShorterString.length && j < charsOfLongerString.length) {
			if (charsOfShorterString[i] != charsOfLongerString[j]) {
				if (!isOneEditAwayAlready) {
					isOneEditAwayAlready = true;
					if (charsOfLongerString.length - charsOfShorterString.length == 0) {
						i += 1;
					}

					j += 1;
				} else {
					isTwoEditAwayAlready = true;
				}
			} else {
				i += 1;
				j += 1;
			}
		}

		return !isTwoEditAwayAlready;

	}
}