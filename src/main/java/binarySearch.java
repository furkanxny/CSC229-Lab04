/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author furkanuzun
 */

public class binarySearch {

	public static void main(String[] args) {
		
		
		int[] b = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		
		binarySearch(7 , b);
		

	}

	public static int binarySearch(int a, int[] array) {

		int start = 0;

		int end = array.length - 1;

		int middle = (start + end) / 2;

		if (start <= end) {

			if (a < array[middle]) {

				end = middle - 1;
			}

			if (a > array[middle]) {

				start = middle + 1;
			}

			if (a == array[middle]) {

				return middle;
			}

		}

		return 0;
	}

}
