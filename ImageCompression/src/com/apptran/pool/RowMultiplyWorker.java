package com.apptran.pool;

public class RowMultiplyWorker implements Runnable {

	private final int[][] result;
	private int[][] image1;
	private int[][] image2;
	private final int row;

	public RowMultiplyWorker(int[][] result, int[][] image1, int[][] image2, int row) {
		this.result = result;
		this.image1 = image1;
		this.image2 = image2;
		this.row = row;
	}

	@Override
	public void run() {

		for (int i = 0; i < image2[0].length; i++) {
			result[row][i] = 0;
			for (int j = 0; j < image1[row].length; j++) {
				result[row][i] += image1[row][j] * image2[j][i];

			}

		}

	}

}