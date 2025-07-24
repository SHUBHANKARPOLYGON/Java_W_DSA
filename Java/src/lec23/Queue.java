package lec23;

public class Queue {

	private int arr[];
	private int size;
	private int front;
	
	public Queue (int n) {
		arr= new int[n];
		size=0;
		front=0;
		}
	
	public Queue() {
		arr= new int[5];
		size=0;
		front=0;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean isFull() {
		return size==arr.length;
	}
	
	public void Enqueu(int val) throws Exception {
		if(isFull())throw new Exception("arre baklol array full hain");
		
		int idx=(size+front)%arr.length;
		arr[idx]=val;
		size++;
	}
	
	public int Dequeue()throws Exception {
		if(isEmpty()) throw new Exception("Bhk baklol queue Khali hain ap k demag ki tarah");
		
		int re=arr[front];
		front=(front+1)%arr.length;
		size--;
		return re;
	}
	public int peek()throws Exception {
		if(isEmpty()) throw new Exception("Bhk baklol queue Khali hain ap k demag ki tarah");
		return arr[front];
	}
	public  int size() {
		return size;
	}
	
	public void Display() {
		for(int i=0;i<size;i++) {
			int idx= (front+i)%arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
}
