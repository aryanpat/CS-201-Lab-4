package lab4;

import java.util.Scanner;

public class Calcu {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first number: ");
		double first = input.nextDouble();
		System.out.println("Enter your second number: ");
		double second = input.nextDouble();
		System.out.println("Enter your operator: ");
		String expression = input.next();
		
		double sum = 0;
		
		switch(expression) {
		case "+":
			sum = first + second;
			System.out.println(sum);
			break;
			
		case "-":
			sum = first - second;
			System.out.println(sum);
			break;
			
		case "*":
			sum = first * second;
			System.out.println(sum);
			break;
			
		case "/":
			sum = first / second;
			System.out.println(sum);
			break;
			
			default:
				System.out.println(expression + " is an invalid operator. Please input a valid operator");
		}
		
		input.close();

	}

}
