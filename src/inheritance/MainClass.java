package inheritance;
		
public class MainClass {

	public static void main(String[] args) {
		
		
		Teacher t1 = new Teacher();
		Singer s1 = new Singer();
		Person p = s1;
		Teacher t =(Teacher) p;
		
		boolean yo = t1 instanceof Teacher;
		
		System.out.println(t1 instanceof Teacher);
		System.out.println(s1 instanceof Singer);
	}

}
