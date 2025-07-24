package lec23;

public class QueueClient {
public static void main(String[] args)throws Exception {
		
		Queue q= new Queue(4);
		
		q.Enqueu(4);
		q.Enqueu(9);
		q.Enqueu(6);
		q.Display();
		q.Enqueu(7);
		
		System.out.println(q.Dequeue());
		q.Enqueu(-1);
		q.Display();
		System.out.println(q.peek());
		q.Dequeue();
		System.out.println(q.peek());

	}
}
