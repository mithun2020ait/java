package recursion;

import java.util.Scanner;

public class NumberOfPaths {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t, m, n;
		 t = sc.nextInt();
		 while(t--> 0){
			 m = sc.nextInt();
			 n = sc.nextInt();
			 int p = npaths(m, n);
			 System.out.println(p);
		 }
		
		
		
		
	}
	
	static int npaths(int m, int n){
		if(m == 1 || n == 1){
			return 1;
		}
		return npaths(m-1, n) + npaths(m, n-1);
	}

}
