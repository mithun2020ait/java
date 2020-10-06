package array;
import java.util.*;

public class AverageMarkesOfStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total number of student : ");
		int n = sc.nextInt();
		int mark[] = new int[n];
		
		System.out.println("Enter the marks now :");
		for(int i = 0; i < n; i++){
			mark[i] = sc.nextInt();
		}
		
		int averageMarks = 0;
		
		for(int i = 0; i < n; i++){
			averageMarks += mark[i];
		}
			
			averageMarks /= n;
			System.out.println("The average marks is " + averageMarks);
		
		
	
	}

}
