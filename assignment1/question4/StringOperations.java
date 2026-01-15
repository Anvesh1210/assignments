package com.assignment1.question4;

public class StringOperations {
	public static void main(String[] args) {
		String s1 = "  Java Programming  ";
		String s2 = "Java Programming";
		String s3 = "Java";

		// length()
		System.out.println("Length: " + s1.length());

		// isEmpty()
		System.out.println("Is Empty: " + s1.isEmpty());

		// charAt()
		System.out.println("Character at index 2: " + s1.charAt(2));

		// toString()
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("toString(): " + sb.toString());

		// equals()
		System.out.println("Equals: " + s2.equals(s3));

		// compareTo()
		System.out.println("CompareTo: " + s3.compareTo("Java"));

		// contains()
		System.out.println("Contains 'Java': " + s1.contains("Java"));

		// indexOf()
		System.out.println("IndexOf 'a': " + s1.indexOf('a'));

		// lastIndexOf()
		System.out.println("LastIndexOf 'a': " + s1.lastIndexOf('a'));

		// startsWith()
		System.out.println("StartsWith '  Ja': " + s1.startsWith("  Ja"));

		// endsWith()
		System.out.println("EndsWith 'ing  ': " + s1.endsWith("ing  "));

		// matches()
		System.out.println("Matches regex: " + s3.matches("[A-Za-z]+"));

		// substring()
		System.out.println("Substring: " + s2.substring(5));

		// toLowerCase()
		System.out.println("Lowercase: " + s2.toLowerCase());

		// trim()
		System.out.println("Trimmed: '" + s1.trim() + "'");

		// replace()
		System.out.println("Replace: " + s2.replace("Java", "Core Java"));

		// split()
		String[] words = s2.split(" ");
		System.out.println("Split:");
		for (String word : words) {
			System.out.println(word);
		}

		// join()
		String joined = String.join("-", "Java", "is", "Powerful");
		System.out.println("Joined: " + joined);

		// valueOf()
		int num = 100;
		String numStr = String.valueOf(num);
		System.out.println("ValueOf: " + numStr);
	}
}
