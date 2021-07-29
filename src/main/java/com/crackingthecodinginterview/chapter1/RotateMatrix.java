package com.crackingthecodinginterview.chapter1;

import java.util.Scanner;

<<<<<<< HEAD
/**
 * Given an image represented by NxN matrix, where each pixel in the image is 4 bytes, write
 * a method to rotate the image by 90 degrees.
 * 
 */
=======
>>>>>>> e55d3e7a8a81b4d4467e5a8525d3f8063433d884
public class RotateMatrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
<<<<<<< HEAD
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

=======
	
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
	
>>>>>>> e55d3e7a8a81b4d4467e5a8525d3f8063433d884
}
