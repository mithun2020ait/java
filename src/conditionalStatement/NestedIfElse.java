package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		int a = 121, b = 32, c = 130;
		int result = 0;
		
//		if(a > b){
//			if(a > c){
//				result = a;
//			} else{
//				result = c;
//			}
//		} else{
//			if(b > c){
//				result = b;
//			} else{
//				result = c;
//			}
//		}
//		
		result = a > b ? a > c ? a : c : b > c ? b : c;
		
		System.out.println("The gretest of three number is "+ result);

	}

}
