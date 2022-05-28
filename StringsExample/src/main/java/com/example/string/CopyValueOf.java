package com.example.string;

public class CopyValueOf {
	public static void main(String[] args) {

		String s = "Hello, This is String"; // length 21
		String copyValueOf = String.copyValueOf(new char[] { 'K', 'R', 'I', 'S', 'H', 'N', 'A' });
		System.out.println(copyValueOf);
	}
}// Just copying/converting Character[] to String.
