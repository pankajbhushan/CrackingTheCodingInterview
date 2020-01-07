package com.crackingthecodinginterview.chapter1;

import java.util.Scanner;

/**
 *
 * Check Permutation:
 * Given two strings, write a method to decide if one is permutation of other
 * 
 * 
 **/
public class CheckPermutation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word1 = in.next();
		String word2 = in.next();
		
		checkPermutationCaseSensitive(word1, word2);
		checkPermutationCaseInsensitive(word1, word2);
		in.close();

	}
	
	private static void checkPermutationCaseSensitive(String word1, String word2) {
		if(word1.length() == word2.length()) {
			int charSum1 = 0;
			int charSum2 = 0;
			for (int i=0; i<word1.length(); i++) {
				charSum1 += word1.charAt(i);
				charSum2 += word2.charAt(i);
			}
			if(charSum1 == charSum2)
				System.out.println("True");
			else
				System.out.println("False");
		}else 
			System.out.println("False");
	}
	
	private static void checkPermutationCaseInsensitive(String word1, String word2) {
		if(word1.length() == word2.length()) {
			int charSum1 = 0;
			int charSum2 = 0;
			for (int i=0; i<word1.length(); i++) {
				charSum1 += Character.toUpperCase(word1.charAt(i));
				charSum2 += Character.toUpperCase(word2.charAt(i));
			}
			if(charSum1 == charSum2)
				System.out.println("True");
			else
				System.out.println("False");
		}else
			System.out.println("False");
	}

}
