package lec24;

public class Stack {

	protected int arr[];
	
	private int top;
	
	public Stack() {
		arr=new int[5];
		top=0;
	}
	public Stack(int n) {
		arr= new int [n];
		top=0;
	}
	public boolean isEmpty() {
		return top==0;
	}
	
	public boolean isFull() {
		return top==arr.length;
	}
	public void push(int val) throws Exception {
		
		if(isFull()) throw new Exception("pagal bache Stack"
				+ " Full ho gaya hain ab aur values insert nahi ho skti");
		
		arr[top]=val;
		top++;
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack khali hai"
					+ " pagal bache ap k demag ki tarah");
		}
		
		int rv=arr[top-1];
		top--;
		return rv;
	}
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack khali hai"
					+ " pagal bache ap k demag ki tarah");
		}
		return arr[top-1];
	}
	public int size() {
		return top;
	}
	
	public void Display() {
		for (int i = 0; i < top; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}