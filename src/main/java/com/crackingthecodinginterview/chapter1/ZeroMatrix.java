package com.crackingthecodinginterview.chapter1;

import java.util.Scanner;

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
				}
			}
		}
		
		//Zero Matrix
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(!(nullRows[i] || nullCols[j])) {
					zeroMatrix[i][j] = matrix[i][j];
				}
			}
		}
		
		//Populate the matrix
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(zeroMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		in.close();
	}
	
}
