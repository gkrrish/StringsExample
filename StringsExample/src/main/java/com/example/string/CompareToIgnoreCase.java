package com.example.string;

public class CompareToIgnoreCase {
	public static void main(String[] args) {
		String s = "Hello, This is String"; // length 21
		System.out.println(s.compareToIgnoreCase("hello"));//prints 16, H with h or H ignoring case
	}

}
