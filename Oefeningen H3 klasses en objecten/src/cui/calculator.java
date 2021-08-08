package cui;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

			
			Scanner s = new Scanner(System.in);
			int num1,num2;
			String operation;
			System.out.print("Input first number? ");
			num1 = s.nextInt();
			System.out.print("Input operator? ");
			operation = s.next();
			System.out.print("Input second number? ");
		    num2 = s.nextInt();
		    System.out.println(calculate(operation, num1, num2));
			
			}
			
			public static int calculate(String operation, int num1, int num2) {
				
				if (operation.contentEquals("+")) { return num1+num2;}
				if (operation.contentEquals("-")) { return num1-num2;}
				if (operation.contentEquals("*")) { return num1*num2;}
				else return num1/num2;
			}

	}


