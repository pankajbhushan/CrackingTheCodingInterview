package com.crackingthecodinginterview.chapter1;

import java.util.Scanner;

<<<<<<< HEAD
/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire
 * row and column are set to 0. 
 */
public class ZeroMatrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int col = in.nextInt();
		
		int[][] matrix = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		System.out.println("Source Matrix:");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(matrix[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		zeroMatrix(matrix, row, col);
		in.close();
	}

	private static void zeroMatrix(int[][] matrix, int row, int col) {
		//row and col arrays to mark nullable
		int[] rowMatrix = new int[row];
		int[] colMatrix = new int[col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(matrix[i][j] == 0) {
					rowMatrix[i] = Integer.MAX_VALUE;
					colMatrix[j] = Integer.MAX_VALUE;
=======
public class ZeroMatrix {

	public static void main(String[] args) {
		
		//Read input from standard in
		Scanner in = new Scanner(System.in);
		
		//Read the input
		int row, col;
		row = in.nextInt();
		col = in.nextInt();
		
		int[][] matrix = new int[row][col];
		int[][] zeroMatrix = new int[row][col];
		boolean[] nullRows = new boolean[row];
		boolean[] nullCols = new boolean[col];
		
		//Populate the matrix
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				matrix[i][j] = in.nextInt();
				if(matrix[i][j] == 0) {
					nullRows[i] = true;
					nullCols[j] = true;
>>>>>>> e55d3e7a8a81b4d4467e5a8525d3f8063433d884
				}
			}
		}
		
<<<<<<< HEAD
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(rowMatrix[i] == Integer.MAX_VALUE || colMatrix[j] == Integer.MAX_VALUE) {
					matrix[i][j] = 0;
=======
		//Zero Matrix
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(!(nullRows[i] || nullCols[j])) {
					zeroMatrix[i][j] = matrix[i][j];
>>>>>>> e55d3e7a8a81b4d4467e5a8525d3f8063433d884
				}
			}
		}
		
<<<<<<< HEAD
		System.out.println("Zero Matrix:");
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(matrix[i][j] +"\t");
=======
		//Populate the matrix
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(zeroMatrix[i][j] + " ");
>>>>>>> e55d3e7a8a81b4d4467e5a8525d3f8063433d884
			}
			System.out.println();
		}
		
<<<<<<< HEAD
	}
=======
		in.close();
	}
	
>>>>>>> e55d3e7a8a81b4d4467e5a8525d3f8063433d884
}
