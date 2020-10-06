package mathods;

public class passByValue {

	public static void main(String[] args) {
//		int firstNumber = 23;
//		int secondNumber = 65;
//		
//		swap(firstNumber, secondNumber);
//		
//		
//		Dog c = new Dog();
//		c.legs = 4;
//		Dog d = new Dog();
//		d.legs = 3;
//		
//		swap(c, d);
		Dog a = new Dog();
		a.legs = 4;
		
		changeDog(a);
		
		System.out.println(a.legs);
		

	}
	
	static void swap(Dog a, Dog b){
		Dog temp = a;
		a = b;
		b = temp;
	}
	
	static void changeDog(Dog dog){
		dog.legs = 6;
	}

}

class Dog {
	int legs;
}
