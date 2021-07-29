package com.crackingthecodinginterview.chapter1;

import java.util.Scanner;

<<<<<<< HEAD
/**
 * Assume that you have a method isSubstring which checks if one word is a substring of another.
 * Given two string, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to 
 * isSubstring(e.g., "waterbottle" is a rotation of "erbottlewat")
 */
=======
>>>>>>> e55d3e7a8a81b4d4467e5a8525d3f8063433d884
public class StringRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
<<<<<<< HEAD
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

=======
		
		//Read Inputs
		String str1 = in.next();
		String str2 = in.next();
		
		String source = str2+str2;
		if(str1.length() == str2.length() && isSubstring(source, str1)) {
			System.out.println( str2 + " is rotation of " + str1);
		}else {
			System.out.println( str2 + " is not a rotation of " + str1);
		}
		
		in.close();
	}
	
	private static boolean isSubstring(String s1, String s2) {
		boolean isSubstring = false;
		String source = null ,subset  = null;
		if(s1.length() >= s2.length()) {
			source=s1;
			subset=s2;
		}else {
			source=s2;
			subset=s1;
		}
		
		//Check if subset is a substring of source string
		for(int i=0; i<source.length();i++) {
			if(source.charAt(i) == subset.charAt(0) && source.substring(i).length() >= subset.length()) {
				String result = source.substring(i,i+subset.length());
				if(result.equalsIgnoreCase(subset)) {
					isSubstring = true;
					break;
				}
			}
		}
		return isSubstring;
	}
>>>>>>> e55d3e7a8a81b4d4467e5a8525d3f8063433d884
}
