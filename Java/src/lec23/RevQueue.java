package lec23;

public class RevQueue {
	public static void rev(Queue q)throws Exception{
		if(q.isEmpty()) return;
		int x=q.Dequeue();
		rev(q);
		q.Enqueu(x);
	}
}
