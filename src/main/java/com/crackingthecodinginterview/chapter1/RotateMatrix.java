package com.crackingthecodinginterview.chapter1;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		//Read input from standard input stream
		//NxN matrix
		int row = 0 , col = 0;
		row = col = in.nextInt();
		
		//Create 2 matrices
		int[][] image = new int[row][col];
		int[][] rotatedImage = new int[row][col];
		
		//Populate image matrix
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				image[i][j] = in.nextInt();
			}
		}
		
		//Perform matrix rotation by 90 degree clockwise
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				rotatedImage[j][col-i-1] = image[i][j];
			}
		}
		
		col = row;
		//Print rotatedImage matrix
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(rotatedImage[i][j] + "  ");
			}
			System.out.println();
		}
				
		
		in.close();
	}
	
}
