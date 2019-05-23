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
}