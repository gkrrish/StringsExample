package com.example.string;

public class CodePointCount {

	public static void main(String[] args) {
		String s = "Hello, This is String";
		System.out.println(s.codePointCount(7, 21));
		
		String str = "aacdefaa";
		System.out.println(str.offsetByCodePoints(2, 6));
	}
}//prints difference between given indexes by counting characters
//https://www.javaprogramto.com/2019/05/java-string-offsetbycodepoints.html
