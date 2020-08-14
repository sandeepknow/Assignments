package com.grading;

import java.util.Arrays;

public class GradingUtil {
	public static void main(String[] a) {

		int[] studentMarks = { 38, 63, 33, 77 };
		System.out.println("Original grades of Students" + studentMarks.toString());
		int[] adjustedMarks = new int[studentMarks.length];

		for (int i = 0; i < studentMarks.length; i++) {
			int diff = nextMultipleOfFive(studentMarks[i]);
			if ((studentMarks[i] >= 36) && (diff < 3)) {
				adjustedMarks[i] = studentMarks[i] + diff;
			} else
				adjustedMarks[i] = studentMarks[i];
		}
		System.out.println("Adjusted grades of Students" + studentMarks.toString());
		Arrays.stream(adjustedMarks).forEach(System.out::println);
	}

	static int nextMultipleOfFive(int marks) {
		int result = 0;
		if (marks % 5 == 0) {
			return -1;
		}
		marks++;
		for (int i = 1; i < 5; i++) {
			if (marks % 5 == 0) {
				return result + i;
			}
			marks++;
		}
		return result;
	}
}
