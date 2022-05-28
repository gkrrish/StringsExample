package com.example.string;

public class EndsWith {
	public static void main(String[] args) {
		String s = "Hello, This is String"; //length 21
		
		boolean endsWith = s.endsWith("krishna");
		System.out.println(endsWith);
		
		boolean endsWith2 = s.endsWith("G");
		System.out.println(endsWith2);
		
		boolean endsWith3 = s.endsWith("String");
		System.out.println(endsWith3);
		
		
	}

}
