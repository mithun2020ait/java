package array;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		int a = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for(int i = 0; i<n; i++){
			sum += arr[i];
		}
		System.out.println(sum);

	}

}
