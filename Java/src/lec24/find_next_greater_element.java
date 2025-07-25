package lec24;
import java.util.Stack;	

public class find_next_greater_element{
public static void main(String[] args) {
 
	int arr[]= {6,3,5,4,6,1};
	int ans[]=findNGE(arr);
	for(int i=0;i<ans.length;i++) {
		System.out.println(ans[i]+" ");
	}
}

public static int[] findNGE(int arr[]){
	int ans[]=new int[arr.length];
	Stack<Integer>st=new Stack<>();
	for(int i=0;i<arr.length;i++) {
		while(!st.isEmpty()&&arr[i]>arr[st.peek()]) {
			int idx=st.pop();
			ans[idx]=arr[i];
		}
		st.push(i);
	}
	while(!st.isEmpty()) {
		int idx=st.pop();
		ans[idx]=-1;
	}
	return(ans);
	}
}



