package com.crackingthecodinginterview.chapter1;

import java.util.Scanner;

/**
 * Given an image represented by NxN matrix, where each pixel in the image is 4 bytes, write
 * a method to rotate the image by 90 degrees.
 * 
 */
public class RotateMatrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int col = in.nextInt();
		int[][] sourceImageMatrix = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col;j++) {
				sourceImageMatrix[i][j] = in.nextInt();
			}
		}
		
		System.out.println("Source Matrix:");

		for(int i=0; i<row; i++) {
			for(int j=0; j<col;j++) {
				System.out.print(sourceImageMatrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		rotateMatrix(sourceImageMatrix, row, col);
		in.close();
	}
	
	private static void rotateMatrix(int[][] sourceMatrix, int row, int col) {
		int[][] targetMatrix = new int[col][row];

		for(int i=0; i<row; i++) {
			for(int j=0; j<col;j++) {
				targetMatrix[i][j] = sourceMatrix[j][i];
			}
		}
		
		System.out.println("Target Matrix:");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col;j++) {
				System.out.print(targetMatrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
