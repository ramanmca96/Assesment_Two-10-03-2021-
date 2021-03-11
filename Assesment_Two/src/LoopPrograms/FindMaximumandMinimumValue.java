package LoopPrograms;

import java.util.Scanner;

public class FindMaximumandMinimumValue {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		
		int size = scan.nextInt();
		int array[]=new int[size];
		
		System.out.println("Enter The Elements");
		for (int i = 0; i <size; i++) {
			
			array[i]=scan.nextInt();
		}
		int max=array[0];
		int min=array[0];

		for (int i = 0; i <size; i++) {
			
			if (array[i]>max) {
				max=array[i];
			}
		}
		for (int i = 0; i < size; i++) {
			
			 if (array[i] < min) 
			{
				min=array[i];
				
			}
				
			
		}
		System.out.println("Minimum Value is:" +min);
		System.out.println("Maximum Value is:" +max);
		
		
	}
}
