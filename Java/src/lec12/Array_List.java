package lec12;
import java.util.*;
public class Array_List {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		
		list.add(5);
		list.add(4);
		list.add(8);
		System.out.println(list);
		
		//contains
		System.out.println(list.contains(4));
		
		//get
		System.out.println(list.get(2));
		
		//add values using indexes
		list.add(1,10);
		System.out.println(list);
		
		//remove
		list.remove(2);
		System.out.println(list);
		
		//size
		System.out.println(list.size());
		
		//sort
		Collections.sort(list);
		System.out.println(list);
		
		//binary search
		System.out.println(Collections.binarySearch(list,10)); //2
		System.out.println(Collections.binarySearch(list,9)); //shows the element number
	}

}
