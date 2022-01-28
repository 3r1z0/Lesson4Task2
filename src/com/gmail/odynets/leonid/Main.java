package com.gmail.odynets.leonid;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		int number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		int result = 1;

		if (4 < number && number < 16) {
			System.out.print(number + "! = ");
			for (int i = number; i >= 1; i--) {
				result = result * i;
				System.out.print(i + " * ");
			}
			System.out.print("= " + result);
		} else {
			System.out.println("Incorrect number");
		}

	}

}
