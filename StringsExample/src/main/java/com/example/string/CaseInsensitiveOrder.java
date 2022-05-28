package com.example.string;

import java.util.Arrays;

public class CaseInsensitiveOrder {
	public static void main(String[] args) {
		String[] s1 = {"Hello", "This", "Is", "String","AAA"};
		
		Arrays.sort(s1,String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(s1));
		
		//This method will sort based on the CASE from string[]
		
	}
}//sort array : https://www.techiedelight.com/sort-string-java/
