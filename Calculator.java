package Calculation;
import java.util.Scanner;
public class Calculator {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" -------------------");
		System.out.println("| Simple Calculator |");
		System.out.println(" -------------------");
		System.out.println("Enter the 1st Number : ");
		double num1 =sc.nextDouble();
		System.out.println("Enter the 2nd Number : ");
		double num2 =sc.nextDouble();
		while(true) {
			System.out.println("\nEnter the operation : ");
			System.out.println("+ Addition");
			System.out.println("- Subtraction");
			System.out.println("* Multiplication");
			System.out.println("/ Division");
			System.out.println("% Modulus");
		
		    System.out.println("\nEnter operator : ");
		    char operator=sc.next().charAt(0);
		    double result;
		    switch(operator) {
		    	case '+':
		    		result = num1 + num2;
		    		System.out.println("Result = "+ result);
		    		break;
			
		    	case '-':
		    		result = num1 - num2;
		    		System.out.println("Result = "+ result);
		    		break;
			
		    	case '*':
		    		result = num1 * num2;
		    		System.out.println("Result = "+ result);
		    		break;
		
		    	case '/':
		    		result = num1 / num2;
		    		System.out.println("Result = "+ result);
		    		break;
			
		    	case '%':
		    		result = num1 % num2;
		    		System.out.println("Result = "+ result);
					break;
			
		    	default :
		    		System.out.println("Choose the correct operator!");
		    		continue;
		    }
		    break;
		}
		sc.close();
	}
}
