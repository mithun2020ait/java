package Queue;




public class MainClass {

	public static void main(String[] args) {
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(23);
		mq.enqueue(10);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
	}

}
