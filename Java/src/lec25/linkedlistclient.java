package lec25;
import java.util.*;

public class linkedlistclient {
	static linkedlist Head; //to make it global

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		linkedlist Head;
		linkedlist n=new linkedlist(5);
		Head=n;
		int i=1;
		while(i<5) {
			linkedlist nn=new linkedlist();
			nn.val=sc.nextInt();
			n.next=nn;
			n=nn;
			i++;
		}
		Display(Head);
		AddLast(8);
		Display(Head);
		AddLast(7);
		AddLast(-1);
		Display(Head);
		AddFirst(0);
		Display(Head);

	}
	public static void AddLast(int val) {
		linkedlist prev=null;
		linkedlist current=Head;
		while(current!=null) {
			prev=current;
			current=current.next;
		}
		linkedlist n=new linkedlist(val);
		prev.next=n;
	}
	public static void AddFirst(int val) {
		linkedlist newNode=new linkedlist();
		newNode.val=val;
		newNode.next=Head;
		Head=newNode;
	}
	public static void Display(linkedlist Head) {
		linkedlist n= Head;
		while(n!=null) {
			System.out.print(n.val+"->");
			n=n.next;
		}
		System.out.println();
	}

}
