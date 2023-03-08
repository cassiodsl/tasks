package com.tasks.two;

import org.springframework.stereotype.Service;

/**
 * Logic built to answer the second test, Question 2
 * 
 * @author cassiolemos
 *
 */
@Service
public class ArrayFinder {

	public int findStartIndexOf(int[] mainArray, int[] subArray) {

		// simple checks to avoid complexity inside the loops and better return codes
		if (mainArray == null || mainArray.length < 1) {
			// different codes to have customized return and different treatments
			return -1;
		}

		if (subArray == null || subArray.length < 1) {
			return -2;
		}

		/*
		 * The idea I created here is to find the subarray wherever it is placed I found
		 * that I could match the entire subarray inside the main array so my logic is
		 * to calculate points and if the total points is equal the size of the subarray
		 * then it means the subarray is fully matched. It also stops if the mainArray
		 * is very long but the subarray was found already.
		 */

		// total points, starts with 0
		int x = 0;
		// variable to keep the first index since I will test all other positions
		int firstIndex = -1;

		// [4,9,3,7,8], [3,7]
		for (int i = 0; i < mainArray.length; i++) {
			if (x < subArray.length && mainArray[i] == subArray[x]) {
				if (firstIndex < 0) {
					firstIndex = i;
				}
				// increment points if the sequence are consistent and validations match
				x++;
			}
		}

		// points should be equals subarray length
		if (x == subArray.length) {
			return firstIndex;
		}

		// return -3 in case nothing occurs - failed to find subarray
		return -3;

	}

}
