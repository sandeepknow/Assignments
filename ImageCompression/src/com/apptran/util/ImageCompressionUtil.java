package com.apptran.util;

import com.apptran.pool.ThreadPoolCreator;

public class ImageCompressionUtil {

	// Function to print Matrix
	static void printMatrix(int M[][], int rowSize, int colSize) {
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++)
				System.out.print(M[i][j] + " ");

			System.out.println();
		}
	}

	// Driver code
	public static void main(String[] args) {

//		int row1 = 4, col1 = 3, row2 = 3, col2 = 4;

		int A[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 } };

		int B[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 } };

		int[][] result = new int[A.length][B[0].length];

		ThreadPoolCreator.multiply(A, B, result);
		
		System.out.println("First Input images");
		printMatrix(A, A.length, A[0].length);
		System.out.println("Second Input images");
		printMatrix(B, B.length, B[0].length);
		System.out.println("Compressed Image");

		printMatrix(result, A.length, B[0].length);
	}
}
