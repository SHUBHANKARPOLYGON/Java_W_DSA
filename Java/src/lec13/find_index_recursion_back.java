package lec13;

public class find_index_recursion_back {

		// finding 
	public static void main(String[] args) {
		int arr[]= {1,5,3,5,6,8,3,6,8,3,5};
		int target=3;
		int n=arr.length;
		System.out.println(find(arr,n-1,target));
	}
	public static int find(int arr[],int i,int target) {
		if(arr[i]==target)
			return i;
		
		int f=find(arr,i-1,target);
		return f;
	}

}
