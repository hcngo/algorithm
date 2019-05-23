package com.hcngo.example;

import java.util.*;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class CubeMatching {
	public static void main(String[] args) {
		int limit = 1000;
		Map<Integer, List<Pair<Integer, Integer>>> table = new HashMap<>();
		for(int i = 1; i <= limit; i++) {
			for(int j = 1; j <= limit; j++) {
				int sum = i * i * i + j * j * j;
				if (!table.containsKey(sum)) {
					table.put(sum, new ArrayList<Pair<Integer, Integer>>());
				}
				List<Pair<Integer, Integer>> bag = table.get(sum);
				bag.add(ImmutablePair.of(i, j));
			}
		}

		table.forEach((k, v) -> {
			System.out.println("Sum: " + k + " - Values: " + v.toString());
		});
	}
}