package com.example.string;

public class CodePointBefore {
	public static void main(String[] args) {
		String s = "Hello, This is String";

		System.out.println(s.codePointBefore(8));
	}
}//Prints ASCII charcter at charAt before one char
