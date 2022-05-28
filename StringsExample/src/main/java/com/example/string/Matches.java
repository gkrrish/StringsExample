package com.example.string;

public class Matches {
	public static void main(String[] args) {
		String s = "HelloThisisString"; //length 21
		String regex = "[a-zA-Z]";
		
		boolean matches = s.matches(regex);
		System.out.println(matches);
		
		
		
		
	}

}//https://www.programiz.com/java-programming/library/string/matches
//https://www.tutorialspoint.com/javaregex/javaregex_character_class_range.htm
