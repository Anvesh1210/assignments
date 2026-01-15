package com.assignment3.question4;

import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht1 = new Hashtable<>();
		Hashtable<Integer, String> ht2 = new Hashtable<>(10);
		Hashtable<Integer, String> ht3 = new Hashtable<>(10, 0.75f);
		Hashtable<Integer, String> ht4 = new Hashtable<>(ht1);

		ht1.put(1, "A");
		ht1.put(2, "B");

		System.out.println(ht1.get(1));
		System.out.println(ht1.containsKey(2));
		System.out.println(ht1.containsValue("A"));

		ht1.remove(2);

		System.out.println(ht1.size());
		System.out.println(ht1.isEmpty());

		System.out.println(ht1.keys());
		System.out.println(ht1.elements());
		System.out.println(ht1.entrySet());
		System.out.println(ht1.keySet());
		System.out.println(ht1.values());

		ht1.replace(1, "X");
		ht1.hashCode();
		ht1.clear();

		System.out.println("Hashtable program executed successfully");
	}
}
