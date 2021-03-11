package LoopPrograms;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		System.out.println("Enter The number:");
		Scanner scan =new Scanner(System.in);
		int number = scan.nextInt();
		
		if (number%2==0) {
			System.out.println("User Enter number is Even");			
		}
		else
		{
			System.out.println("User Enter number is Odd");
		}	// TODO Auto-generated method stub

	}

}
