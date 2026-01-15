package com.assignment3.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {

		// 1. Default constructor
		ArrayList<String> list1 = new ArrayList<>();
		System.out.println("Default Constructor: " + list1);

		// 2. Constructor with initial capacity
		ArrayList<String> list2 = new ArrayList<>(5);
		System.out.println("Constructor with capacity");

		// 3. Constructor with collection
		ArrayList<String> temp = new ArrayList<>();
		temp.add("Java");
		temp.add("Python");
		ArrayList<String> list3 = new ArrayList<>(temp);
		System.out.println("Constructor with Collection: " + list3);

		// ================= METHODS =================

		// 1. add()
		list1.add("Apple");
		list1.add("Banana");

		// 2. add(index, element)
		list1.add(1, "Mango");

		// 3. addAll()
		list1.addAll(list3);

		// 4. get()
		System.out.println("Element at index 0: " + list1.get(0));

		// 5. set()
		list1.set(0, "Orange");

		// 6. size()
		System.out.println("Size: " + list1.size());

		// 7. contains()
		System.out.println("Contains Banana: " + list1.contains("Banana"));

		// 8. indexOf()
		System.out.println("Index of Mango: " + list1.indexOf("Mango"));

		// 9. lastIndexOf()
		list1.add("Java");
		System.out.println("Last index of Java: " + list1.lastIndexOf("Java"));

		// 10. remove(object)
		list1.remove("Banana");

		// 11. remove(index)
		list1.remove(0);

		// 12. isEmpty()
		System.out.println("Is Empty: " + list1.isEmpty());

		// 13. iterator()
		System.out.println("Using Iterator:");
		Iterator<String> it = list1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 14. toArray()
		Object[] arr = list1.toArray();
		System.out.println("Array form: " + Arrays.toString(arr));

		// 15. retainAll()
		list1.retainAll(list3);
		System.out.println("After retainAll(): " + list1);

		// 16. removeAll()
		list1.removeAll(list3);
		System.out.println("After removeAll(): " + list1);

		// 17. clear()
		list3.clear();
		System.out.println("After clear(): " + list3);
	}
}
