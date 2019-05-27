package com.hcngo.example;

import java.util.*;

public class HelperUtil {
	public static List<Integer> getIntegers(Scanner in, int number) {
        int i = 0;

        List<Integer> li = new ArrayList();
        while (i < number && in.hasNextInt()) {
        	li.add(in.nextInt());
        	i += 1;
        }
        return li;
	}

	public static Map<Character, Integer> mapifyString(String s) {
		Map<Character, Integer> charMap = new HashMap<>();
		for(Character c : s.toCharArray()) {
			if (!charMap.containsKey(c)) {
				charMap.put(c, 0);
			}
			charMap.put(c, charMap.get(c) + 1);
		}
		return charMap;
	}
}