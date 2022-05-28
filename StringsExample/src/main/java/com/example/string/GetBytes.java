package com.example.string;

public class GetBytes {
	public static void main(String[] args) {
		String s = "Hello, This is String"; //length 21
		
		byte[] bytes = s.getBytes();
		System.out.println(bytes[1]);
	}
}//prints ascii character
