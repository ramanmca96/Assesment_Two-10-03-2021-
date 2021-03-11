package LoopPrograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String reverse="";
		System.out.print("Enter The Words:");
		
		String originalstr = scan.nextLine();
		char[] charArray = originalstr.toCharArray();
		
		
		
		for (int i = charArray.length-1; i>=0; i--) {
			
			reverse=reverse+originalstr.charAt(i);
		}
		System.out.println("Given word reverse is :" +reverse);
	}

}
