package com.assignment3.question2;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>();
		Vector<String> v2 = new Vector<>(5);
		Vector<String> v3 = new Vector<>(5, 2);

		Vector<String> base = new Vector<>();
		base.add("Java");
		base.add("Python");

		Vector<String> v4 = new Vector<>(base);

		v1.add("A");
		v1.add("B");
		v1.add(1, "C");
		v1.addAll(v4);
		v1.addElement("D");

		System.out.println(v1.get(0));
		v1.set(0, "X");
		v1.remove("B");
		v1.removeElement("C");

		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1.contains("X"));
		System.out.println(v1.indexOf("Java"));
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());

		v1.clear();

		System.out.println("Vector program executed successfully");
	}
}
