package conditionalStatement;

public class SwitchCaseStatement {

	public static void main(String[] args) {
//		
//		int dayOfWeek = 1;
//		
//		switch(dayOfWeek) {
//		case 1: case 2:
//			System.out.println("I'm on leave");
//			break;
////		case 2:
////			System.out.println("I'm in office");
////			break;
//		case 3:
//			System.out.println("I'm playing cricket");
//		    break;
//			case 4:
//				System.out.println("I'm in the ground");
//				break;
//				
//			default:
//				System.out.println("I dont known what the day is");
//		}
		
		int rating = 6;
		
		switch(rating){
		case 1:
		case 2:
			System.out.println("Bad review");
			break;
		case 3:
			System.out.println("Average review");
			break;
		case 4:
		case 5:
			System.out.println("Good review");
			break;
		default:
			System.out.println("Rating in out of range ");
		}
	}

}
