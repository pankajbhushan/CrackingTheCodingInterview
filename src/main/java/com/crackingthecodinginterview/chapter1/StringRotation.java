package com.crackingthecodinginterview.chapter1;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
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
}
