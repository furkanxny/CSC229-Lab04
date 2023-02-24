/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author furkanuzun
 */
public class SumOf {

	public static void main(String[] args) {

		sumOfNumbers(1, 21);

		System.out.println(sum);

	}

	static int sum;

	public static int sumOfNumbers(int n1, int n2) {

		if (n1 <= n2 && n1 % 7 == 0) {

			sum = sum + n1;

			

		}

		if(n1 <= n2) {
			
			sumOfNumbers(n1 + 1, n2);
			
			
		}
		
		else {
			
			System.out.println("Done");
			
		}
		
		return sum;
//aa
	}

}