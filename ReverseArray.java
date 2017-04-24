package assignment3;

import java.util.Arrays;

public class ReverseArray {

	/*
	 * public static void main(String[] args) 
	 * {
	 *  int[] numbers = {1, 2, 3, 4, 5,
	 * 6, 7}; reverse(numbers); }
	 */
	public static int[] reverse(int[] input) {
		System.out.println("original array : " + Arrays.toString(input));

		if (input == null || input.length <= 1) {
		
		}

		for (int i = 0; i < input.length / 2; i++) {
			int temp = input[i]; 
			input[i] = input[input.length - 1 - i];
			input[input.length - 1 - i] = temp;
		}

		System.out.println("reversed array : " + Arrays.toString(input));
		return input;
	}

}