package WhileLoop;

import java.util.Scanner;

public class FindtheDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int temp = n;
		int sum = 0;
		
		int numberofDigit = (int)Math.log10(n) +1;
		
		System.out.println(numberofDigit);

	}

}
