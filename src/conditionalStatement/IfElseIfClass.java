package conditionalStatement;

public class IfElseIfClass {

	public static void main(String[] args) {
		int number = 0;
		
		if(number <= 10) {
			System.out.println("The number is less than 10");
		} else if(number > 10 && number <= 20){
			System.out.println("The number is grater than 10 and less than 20 ");
		} else if(number > 20 && number <= 30){
			System.out.println("The number is grater than 20 and less than 30");
		} else {
			System.out.println("The number is grater than 30");
		}

	}

}
