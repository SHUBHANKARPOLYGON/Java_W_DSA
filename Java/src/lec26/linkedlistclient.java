package lec26;

public class linkedlistclient {

	public static void main(String[] args) throws Exception {
		
		linkedlist ll=new linkedlist();
		
		ll.AddFront(5);
		ll.AddFront(6);
		ll.AddFront(1);
		ll.AddFront(2);
		ll.AddLast(-1);
		ll.Display();
        ll.removeFront();
        ll.Display();
        
        ll.removeLast();
        ll.Display();
        
	}

}