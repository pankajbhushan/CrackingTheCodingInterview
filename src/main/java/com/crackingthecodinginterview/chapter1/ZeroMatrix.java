package com.crackingthecodinginterview.chapter1;

import java.util.Scanner;

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
				}
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(rowMatrix[i] == Integer.MAX_VALUE || colMatrix[j] == Integer.MAX_VALUE) {
					matrix[i][j] = 0;
				}
			}
		}
		
		System.out.println("Zero Matrix:");
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(matrix[i][j] +"\t");
			}
			System.out.println();
		}
		
	}
}
