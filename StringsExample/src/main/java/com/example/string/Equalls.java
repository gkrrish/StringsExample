package com.example.string;

public class Equalls {
	public static void main(String[] args) {
		String s = "Hello, This is String"; //length 21
		
		boolean equals = s.equals("Hello");
		System.out.println(equals);
		
		boolean equals2 = s.equals("Hello, This is String");
		System.out.println(equals2);
		
	}
}
