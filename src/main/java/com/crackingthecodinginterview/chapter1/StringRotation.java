package com.crackingthecodinginterview.chapter1;

import java.util.Scanner;

/**
 * Assume that you have a method isSubstring which checks if one word is a substring of another.
 * Given two string, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to 
 * isSubstring(e.g., "waterbottle" is a rotation of "erbottlewat")
 */
public class StringRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		checkStringRotation(s1, s2);
		in.close();
	}
	
	private static void checkStringRotation(String s1, String s2) {
		String s2s2 = s2 + s2;
		boolean isSubstring = isSubstring(s1,s2s2);
		if(isSubstring) {
			System.out.println(s2 + " is a rotation of " + s1);
		}else {
			System.out.println(s2 + " is not a rotation of " + s1);
		}
		
	}

	private static boolean isSubstring(String s1, String s2) {
		if(s2.indexOf(s1) > 0) {
			return true;
		}else {
			return false;
		}
	}

}
