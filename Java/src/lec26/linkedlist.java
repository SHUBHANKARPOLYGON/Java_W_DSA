package lec26;

public class linkedlist {
   
	public class Node{
		int data;
		Node next;
	}
	
private	Node head;
private	Node tale;
private	int size=0;

public void AddFront(int val) {
	Node n= new Node();
	
	n.data=val;
	n.next=head;
	head=n;
	if(size==0)tale=n;
	size++;
}

public void AddLast(int val) {
	if(size==0) {

		Node n= new Node();
		n.data=val;
		head=n;
		tale=n;
		size++;
		return;
	}
	
	Node n= new Node();
	n.data=val;
	tale.next=n;
	tale=n;
	size++;
	
	
}

public void AddAtIndex(int k,int val) throws Exception {
	
	if(k==0) {
		AddFront(val);
	}
	else if(k==size) {
		AddLast(val);
	}
	else{
		Node nprev=getNode(k-1);
		
		Node n= new Node();
		n.data=val;
		
		n.next=nprev.next;
		nprev.next=n;
		size++;
	}
	
}

public Node getNode(int k) throws Exception  {
	
	if(size<k)throw new Exception ("Baklol pagal utna Node hain hi nahi");
	
	Node curr=head;
	for(int i=0;i<k;i++) {
		curr=curr.next;
	}
	return curr;
}

  public int removeFront()throws Exception {
	  if(size==0)throw new Exception("Khali hu koi hain hi nahi mere pass");
	  
	  Node temp=head;
	  head=head.next;
	  temp.next=null;
	  if(size==1)tale=null;
	  size--;
	  return temp.data;
  }
  
  public int removeLast() throws Exception {
	  if(size==0)throw new Exception("size 0 hain");
	  
	  else if(size==1) {
		  int data=head.data;
		  head=null;
		  tale=null;
		  size--;
		  return data;
	  }
	  else {
		  Node secondLast=getNode(size-2);
		  int data=tale.data;
		  tale=secondLast;
		  secondLast.next=null;
		  size--;
		  return data;
	  }
  }

 public int size() {
	 return size;
 }
 
 public void Display() {
	 Node curr=head;
	 while(curr!=null) {
		 System.out.print(curr.data+" ->");
	     curr=curr.next;
	 }
		 System.out.println(".");
 }
 
	
	
}