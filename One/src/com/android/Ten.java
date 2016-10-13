package com.android;

public class Ten {

	public static void main(String[] args) {

		// System.out.println("testout 10");
		int size = 5;

		double[] weights = new double[size];
		int i = 0;
		while (i < size) {

			weights[i] = i + 2;
			System.out.println("i = " + i + weights[i]);
			i++;

		}

		int tallest = 6;

		double[] height = new double[tallest];

		int j = 0;

		while (j < tallest) {

			height[j] = j + 3;

			System.out.println("j = " + j + height[j]);
			
			j++;

		}

	}

}
