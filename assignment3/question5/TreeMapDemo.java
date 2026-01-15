package com.assignment3.question5;

import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;

public class TreeMapDemo {
	public static void main(String[] args) {

		TreeMap<Integer, String> tm1 = new TreeMap<>();
		TreeMap<Integer, String> tm2 = new TreeMap<>(Comparator.reverseOrder());
		TreeMap<Integer, String> tm3 = new TreeMap<>(tm1);
		TreeMap<Integer, String> tm4 = new TreeMap<>(Map.of(1, "A", 2, "B"));

		tm1.put(1, "A");
		tm1.put(2, "B");
		tm1.put(3, "C");

		System.out.println(tm1.get(1));
		System.out.println(tm1.firstKey());
		System.out.println(tm1.lastKey());
		System.out.println(tm1.higherKey(1));
		System.out.println(tm1.lowerKey(3));
		System.out.println(tm1.ceilingKey(2));
		System.out.println(tm1.floorKey(2));

		System.out.println(tm1.pollFirstEntry());
		System.out.println(tm1.pollLastEntry());

		System.out.println(tm1.keySet());
		System.out.println(tm1.values());
		System.out.println(tm1.entrySet());

		System.out.println(tm1.size());

		tm1.clear();

		System.out.println("TreeMap program executed successfully");
	}
}
