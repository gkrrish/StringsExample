package com.example.string;

import java.util.StringJoiner;

public class Concat {
	public static void main(String[] args) {
		String s = "Hello, This is String"; //length 21
		
		String concat = s.concat("Mr, John");
		System.out.println(s);
		System.out.println(concat);
		
		StringBuffer bf=new StringBuffer("Hello");
		bf.append("Krishna");
		System.out.println(bf);
		
		StringBuilder sb=new StringBuilder("Hi");
		sb.append("Krisihna");
		System.out.println(sb);
		
		StringJoiner joiner=new StringJoiner(" ");
		joiner.add("Mr.Dude");
		joiner.add("Greetings...");
		System.out.println(joiner);
	}
}
