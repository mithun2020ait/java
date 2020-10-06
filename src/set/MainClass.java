package set;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Set<Integer> x = new HashSet<>();
		
		x.add(12);
		x.add(23);
		x.add(34);
		
		Set<Integer> y = new HashSet<>();
		y.add(3);
		y.add(23);
		y.add(9);
		
	//	x.addAll(y);
		/* to get the union of the two set x and y.*/
	//	System.out.println(x);
		
	//	x.retainAll(y);
		/* to get the intersection of two set x and y.*/
	//	System.out.println(x);
		
		System.out.println(x.containsAll(y));
		/* to check y is a subset of x*/
	}

}
