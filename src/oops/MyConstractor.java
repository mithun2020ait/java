package oops;

class Vechile {
	int wheels;
	int hadeLights;
	String colour;
	
	Vechile(int wheel){
		this.wheels = wheel;
		int headLight = 2;
	}
	
	 Vechile(int wheel, String colour) {
		this.wheels = wheel;
		this.colour = colour;
	}
}

public class MyConstractor {
	
	 MyConstractor() {
		System.out.println("Object now created");
	}

	public static void main(String[] args) {
		
		Vechile car = new Vechile(4);
		Vechile bike = new Vechile(2);
		Vechile eRikshaew = new Vechile(3, "Yelow");
		
		System.out.println(eRikshaew.wheels+ " wheels and colour =  "+ eRikshaew.colour);
		
		
	}

}
