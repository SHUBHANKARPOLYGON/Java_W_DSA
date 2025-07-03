package lec8;

public class peakofmountain {
	
	//Leetcode 852 Peak Index in a Mountain Array
	public static void main(String[] args) {
		int arr[]= {0,1,0};
		int peakIndex=Peak(arr);
		System.out.println(peakIndex);

	}
	public static int Peak(int arr[]) {
		int i=0;
		int j=arr.length-1;
		
		while(i<=j) {
			int m=(i+j)/2;
			
			if(arr[m]<arr[m+1])i=m+1;
			else j=m-1;
		}
		return i;
	}

}
