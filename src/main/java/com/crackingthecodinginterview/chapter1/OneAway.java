package com.crackingthecodinginterview.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * There are three types of edits that can be performed on strings: insert a character, remove a character or replace a character.
 * Given two strings, write a function to check if they are one edit(or zero edits) away
 * 
 */
public class OneAway {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String word1 = br.readLine();
			String word2 = br.readLine();
			if(isOneAway(word1, word2)) {
				System.out.println(word1 + ", " + word2 + " -> true");
			}else {
				System.out.println(word1 + ", " + word2 + " -> false");
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static boolean isOneAway(String word1, String word2) {
		boolean foundDifference = false;
		//Check length
		if(Math.abs(word1.length() - word2.length()) > 1) {
			return false;
		}
		
		//Get the shorter and longer strings
		String s1 = word1.length() < word2.length() ? word1:word2;
		String s2 = word1.length() < word2.length() ? word2:word1;
		
		int index1, index2;
		index1 = index2 = 0;
		while(index1 < s1.length() && index2 < s2.length()) {
			if(s1.charAt(index1) != s2.charAt(index2)) {
				//Ensure that this is the first difference found
				if(foundDifference) return false;
				foundDifference = true;
				
				//On replace, move shorter pointer forward
				if(s1.length() == s2.length()) {
					index1++;
				}
			}else {
				index1++; //If matching, move pointer for shorter string
			}
			index2++; //Always move pointer for longer string 
		}
		return true;
	}

}
