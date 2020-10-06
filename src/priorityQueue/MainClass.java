package priorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(1);
		pq.add(20);
		pq.add(6);
		pq.add(8);
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());

		System.out.println(pq.remove());

		System.out.println(pq.remove());


	}

}
