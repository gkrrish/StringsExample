package com.example.string;

public class GetChars {
	public static void main(String[] args) {
		String s = "Hello, This is String"; // length 21
		char[] dest = new char[10];

		s.getChars(0, 7, dest, 3);
		System.out.println(dest);
	}
}// copies the startingIndex, endIndex from string and copies into char[],
	// saves values into char[] on index 3 onwards
