package lec22;

public class queue {
	
	private int arr[];
	private int front;
	private int size;
	
public queue() {
		arr=new int [5];
		front=0;
		int size=0;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==arr.length;
	}
	public void Enqueue() {
		
	}
}
