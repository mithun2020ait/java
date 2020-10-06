package datatype;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
//		int principal = 100000;
//		
//		float rate = 1.25f;
//		
//		int time = 12;
//		
//		float SimpleInterest = principal * rate * time / 100;
//		
//		System.out.println("the simpleinterest is "+ SimpleInterest);
		
		Scanner sc = new Scanner(System.in);
		
		int principal = sc.nextInt();
		
		float rate = sc.nextFloat();
		
		int time = sc.nextInt();
		
		float simpleInterest = principal * rate * time / 100;
		
		System.out.println("The simpleInterest is "+ simpleInterest);
	}

}
