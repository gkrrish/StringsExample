package com.example.string;

public class OffsetByCodePoints {
	public static void main(String[] args) {

		String str = "aacdefaa";
		System.out.println(str.offsetByCodePoints(2, 6));// 2,7 ::Gives IOBException
	}
	/**
	 * -------------------------------------------------------------------------------
	 * By Taking index values it will adds (sum) * here, 2+6=8 and last index values *
	 * of string also 8, then it will print the value, if sum is greater than last   *
	 * index values then gives IOBException											 *
	 * -------------------------------------------------------------------------------
	 */

}// https://www.javaprogramto.com/2019/05/java-string-offsetbycodepoints.html
