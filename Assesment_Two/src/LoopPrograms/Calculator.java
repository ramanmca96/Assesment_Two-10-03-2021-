package LoopPrograms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter The Two Numbers:");
		double number1 = scan.nextDouble();
		double number2 = scan.nextDouble();
		
		System.out.println("Enter the Operator:");
		char operator =scan.next().charAt(0);
		
		scan.close();
		double output;
		switch (operator) {

		case '+':
			output = number1+number2;
			break;
			
		case '-':
			output = number1-number2;
			break;
		case '*':
			output = number1*number2;
			break;
		case '%':
			output = number1%number2;
			break;
			
		default:
			System.out.println("Your are entered Wronh Operator");
			return;
		}
		
		System.out.println(number1+" "+operator+" "+number2+"=" +output);
	}
	
}

