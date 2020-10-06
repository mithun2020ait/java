import java.util.Scanner;


public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int principal = sc.nextInt(); 
		float rateofinterest = sc.nextInt();
		int time = sc.nextInt();
		float simpleinterest = 0;
		
		simpleinterest = principal * rateofinterest * time / 100;
		System.out.println("the simpleinterest is " + simpleinterest);
	}

}
