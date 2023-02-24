/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author furkanuzun
 */
public class HelloWorld {

	public static void main(String[] args) {

		printHelloWorld(5);

	}

	public static void printHelloWorld(int n) {

		if (n > 0) {

			System.out.println("Hello World");
			printHelloWorld(n - 1);

		} else {
			System.out.print("Done");
		}
	}

}

