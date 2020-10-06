package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.addFirst(12);
		ad.addFirst(30);
		ad.addFirst(24);
		
		System.out.println(ad.poll());
		
	}

}
