package com.example.string;

public class CompareTo {
	public static void main(String[] args) {
		String s = "Hello, This is String"; // length 21

		int compareTo = s.compareTo("hello");//prints -32 comparing h with H
		System.out.println(compareTo);
	}
}
//comparator compare to, compares the first characters, prints differences between them, lower in -minus.
//higher in +ve.