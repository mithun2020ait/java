package oops;

class Cat {
	boolean fur;
	String breed, colour;
	int legs, eyes;
	
	public void walk() {
		System.out.println("cat is walking");
	}
	
	public void eat() {
		System.out.println("cat is eating ");
	}
	
	public void description() {
		System.out.println("My cat has "+ legs + " leges and "+ eyes + " eyes ");
	}
}


class Dog {
	String breed, name;
	
	public void jump() {
		System.out.println("My dog "+ name + " jump");
	}
	
	public void descriotion() {
		System.out.println("my dog's name is "+name+ "and it's breed is "+ breed );
	}
	
}

public class MainClass {

	public static void main(String[] args) {


//		Cat cat1 = new Cat();
//		cat1.legs = 3;
//		cat1.eyes = 2;
//		
//		Cat cat2 = new Cat();
//		cat2.legs = 4;
//		cat2.eyes = 2;
//		
//		
//		
//		cat1.description();
//		cat2.description();
		
		Dog hasky = new Dog();
		Dog poodle = new Dog();
		
		hasky.breed = "hasky";
		hasky.name = "Browny";
		
		poodle.breed = "poodle";
		poodle.name = "Mr.mulchand ji";
		
		hasky.jump();
		hasky.descriotion();
		poodle.jump();
		poodle.descriotion();
	}

}
