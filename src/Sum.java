import java.util.Scanner;


public class Sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the number" +  a);
		int b =sc.nextInt();
		System.out.println("Enter the number" +  b);
		int sum = 0;
		sum = a + b;
		System.out.println("The sum is " + sum);
	}

}
