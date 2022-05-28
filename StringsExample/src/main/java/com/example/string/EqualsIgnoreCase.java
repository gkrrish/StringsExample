package com.example.string;

public class EqualsIgnoreCase {
	public static void main(String[] args) {
		String s = "Hello, This is String"; // length 21

		boolean equalsIgnoreCase = s.equalsIgnoreCase("HELLO, THIS IS STRING");
		System.out.println(equalsIgnoreCase);

		boolean equalsIgnoreCase2 = s.equalsIgnoreCase("HELLO,THIS IS STRING"); // removes space here
		System.out.println(equalsIgnoreCase2);
	}
}
