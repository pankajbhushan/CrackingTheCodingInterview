package com.crackingthecodinginterview.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3. If the compressed string would not become smaller
 * than the original string, your method should return the original string.
 * You can assume that string has only uppercase and lowercase letters (a-z).
 *
 */
public class StringCompression {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String word  = in.readLine();
		System.out.println(compressString(word));
		in.close();
	}
	
	private static String compressString(String source) {
		char curr =  source.charAt(0);
		int count = 0;
		String compressedString = "";
		
		for(int i=0; i < source.length(); i++) {
			if(curr != source.charAt(i) || (i == source.length()-1)) {
				if((i == source.length()-1)) {
					compressedString = compressedString + curr + ++count;	
				}else {
					compressedString = compressedString + curr + count;
					curr = source.charAt(i);
					count = 1;
				}
			}else {
				count++;
			}
		}
		return compressedString; 
	}
}
