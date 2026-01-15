package com.assignment3.question3;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>(10);
		HashMap<Integer, String> map3 = new HashMap<>(10, 0.75f);
		HashMap<Integer, String> map4 = new HashMap<>(map1);

		map1.put(1, "A");
		map1.put(2, "B");
		map1.putIfAbsent(3, "C");

		System.out.println(map1.get(1));
		System.out.println(map1.containsKey(2));
		System.out.println(map1.containsValue("C"));

		map1.remove(2);

		System.out.println(map1.size());
		System.out.println(map1.isEmpty());

		System.out.println(map1.keySet());
		System.out.println(map1.values());
		System.out.println(map1.entrySet());

		map1.replace(1, "X");
		map1.computeIfAbsent(4, k -> "D");

		map1.forEach((k, v) -> System.out.print(""));

		map1.clear();

		System.out.println("HashMap program executed successfully");
	}
}
