package com.crackingthecodinginterview.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, write a function to check if it a permutation of a palindrome 
 **/
public class PalindromePermutation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		if(checkPalindrome(word))
			System.out.println("Given word has permutation which is palindrome");
		else
			System.out.println("Given word does not have palindrome permutation");
//			checkPalindromePermutation(word); //Extra
		br.close();
	}
	
	private static boolean checkPalindrome(String word) {
		boolean isPalindrome = false;
		Map<Character,Integer> charCount = new HashMap<>();
		for(Character ch : word.toLowerCase().replace(" ", "").toCharArray()) {
			if(null == charCount.get(ch)) {
				charCount.put(ch,1);
			}else {
				Integer count = charCount.get(ch);
				charCount.put(ch, ++count);
			}
		}
		//Checking if palindrome using number of even and odd count of each char
		int oneOdd = 0;
		for(Map.Entry<Character,Integer> ch: charCount.entrySet()) {
			if(ch.getValue()%2 == 0)
				continue;
			else
				oneOdd++;
		}
		
		if(oneOdd <= 1 )
			isPalindrome = true;
		
		return isPalindrome;
	}
	
	private static void checkPalindromePermutation(String word) {
		if(word.length()%2 == 0) {
			
		}
	}

}
