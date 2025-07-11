package lec13;

public class find_index_recurssion {

	public static void main(String[] args) {
		int arr[]= {6,2,9,1,5,3,5,1,4};
		int target=1;
		
		System.out.println(find(arr,0,target));
	}
	public static int find(int arr[],int i,int target) { 
			if(i>=arr.length) return -1;
			if(arr[i]==target)return i;
			int f=find(arr,i+1,target);
			return f;
		}
}
