package inheritance;

public class Teacher extends Person {
	
	public void teach() {
		System.out.println(name+ " is teaching ");
	}
	
	public void eat() {
		System.out.println("person " + name +" is eating");
	}

}
