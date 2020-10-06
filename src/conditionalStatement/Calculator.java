package conditionalStatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number ");
		int a = sc.nextInt();
		
		System.out.print("Enter the second number ");
		int b = sc.nextInt();
		
		System.out.print("Enter the operant ");
		sc.nextLine();
		char operation = sc.next().charAt(0);
		
		int result = 0;
		
		switch(operation){
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		default:
			System.out.println("invalid operation");
			
		}
		
		System.out.println("The result is "+ result);
		
	}

}
