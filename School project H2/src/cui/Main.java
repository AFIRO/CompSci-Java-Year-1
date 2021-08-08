package cui;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		
//		Scanner a = new Scanner(System.in);
//		int input; 
//		int addition=0;
//		
//		System.out.printf("Input positive number for addition. Input negative for result. ");
//		input = a.nextInt();
//	
//	if (input <0) System.out.printf("The result is %d", addition);
//	else while (input >=0) {addition = addition + input;
//	System.out.printf("Input positive number for addition. Input negative for result. ");
//	input = a.nextInt();}
//	
//	System.out.printf("The result is %d", addition); 
		
		for (int i=1; i <= 20; i++)
		{if (i %15==0)  System.out.println("FizzBuzz");
		else if (i %3==0) System.out.println("Fizz");
		else if (i %5==0) System.out.println("Buzz");
		else System.out.printf("%d\n",i);
		}
		
		
	
	}


}
