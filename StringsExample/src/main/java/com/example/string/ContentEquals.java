package com.example.string;

public class ContentEquals {
	public static void main(String[] args) {
		String s = "Hello, This is String"; //length 21
		
		boolean contentEquals = s.contentEquals(new StringBuffer("Hello, This is String"));
		System.out.println(contentEquals);
	}

}//if String and StringBuffer both content will be same with case, then it will print true
