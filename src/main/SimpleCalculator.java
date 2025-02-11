package main;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		float num1;
		float num2;
		boolean exit= false;
		int operation;
		float result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		num2 = sc.nextInt();
		
		System.out.println("Please select the operation you want to do: ");
		System.out.println("Select 1 for +");
		System.out.println("Select 2 for -");
		System.out.println("Select 3 for *");
		System.out.println("Select 4 for /");
		System.out.println("Select 5 to exit");
			
		operation = sc.nextInt();
					
			switch (operation) {
				case 1: {
					result = num1+num2;
					System.out.println("The result is: " + result);
					break;
				}
				case 2: {
					result = num1-num2;
					System.out.println("The result is: " + result);
					break;
					}
				case 3: {
					result = num1*num2;
					System.out.println("The result is: " + result);
					break;
				}
				case 4: {
					result = num1/num2;
					System.out.println("The result is: " + result);
					break;
					}
				case 5: {
					System.out.println("Bye bye");
					break;
				}
				default:
					System.out.println("Not a valid option");
		}											
	}
}
