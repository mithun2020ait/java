package recursion;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t--> 0){
//			int n = sc.nextInt();
//		}
		
		printNo(20);
	}
	
	static void printNo(int n){
		
		if(n>0){
			printNo(n-1);
			System.out.print(n + " ");
		}
		return;
		
	}

}
