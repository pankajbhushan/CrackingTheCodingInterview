package com.crackingthecodinginterview.chapter1;

import java.util.Scanner;

/**
 * 
 * IsUnique: Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures.
 * 
 * */
public class IsUnique {

	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a word to check if it has unique characters:");
		String word = in.next();
		System.out.println(isUnique(word));
	}

	private static boolean isUnique(String word) {
		int[] chars = new int[128];
		for(int i=0; i< word.length();i++) {
			int ch = word.charAt(i);
			if(chars[ch] != 0)
				return false;
			chars[ch] = 1;
		}
		return true;
	}

	@Override
	protected void finalize() throws Throwable {
		in.close();
	}

}
