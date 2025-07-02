package lec7;

public class binarysearch {

	public static void main(String[] args) {
		int []arr = {-1,0,3,5,9,12};
        int target = 9;
        int result = bs(arr, target);
        System.out.println(result);

	}
	
	//Binary Search Leetcode 704
		public static int bs(int arr[], int target) {
			
			int start=0;
			int end=arr.length-1;
			
			while(start<=end) {
				int mid=start+(end-start)/2;
				if(arr[mid]==target) {
					return mid;
				}else if(arr[mid]>target) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}
			return -1;
		}
}

