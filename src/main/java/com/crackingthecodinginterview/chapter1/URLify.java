package com.crackingthecodinginterview.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * URLify
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string has
 * sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string.
 **/
public class URLify {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		urlify(word);
		System.out.println("URLified word " + word);
		br.close();
	}
	
	private static void urlify(String word) {
		System.out.println(word.replaceAll(" ", "%20"));
	}
}
