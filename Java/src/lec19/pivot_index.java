package lec19;

public class pivot_index {

	public static void main(String[] args) {
		int arr[]= {7,5,1,3,9,4};
		int pi=find(0,arr.length-1,arr);
		System.out.println(pi);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static int find(int start,int end,int[] arr) {
		int item=arr[end];
		int pivot=start;
		for(int i=start;i<end;i++) {
			if(item>arr[i]){
				int t=arr[pivot];
				arr[pivot]=arr[i];
				arr[i]=t;
				pivot++;
			}
		}
		int temp=arr[pivot];
		arr[pivot]=item;
		arr[end]=temp;
		
		return pivot;
		
	}

}
