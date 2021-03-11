package LoopPrograms;



public class PrimeNumber {

	public static void main(String[] args) {
		int Count=0;
		System.out.println(2);
		Count=Count+1;
		int number=3;
		
		boolean isprime = true;
		int i = 2;
		while(Count<15) {
			
			while (i<number) {
				
				if(number%i==0) {
					System.out.println(number);
					isprime=false;
				}
					i++;
				}
				if(isprime==true)
				{
					System.out.println(number);
					Count=Count+1;
				}
				number=number+2;
		}		
		
	
		}
			}

