package comparablesAndcomparator;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(55, "Ram"));
		students.add(new Student(65, "Tapan"));
		students.add(new Student(50, "Chandan"));
		students.add(new Student(70, "Avi"));
		
		Collections.sort(students);
		students.forEach(System.out::println);
		
		
	}
	

}
