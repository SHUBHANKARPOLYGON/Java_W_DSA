package lec19;

public class merge_two_sorted_array {

	public static void main(String[] args) {
		
		int[] arr1 = {2,7,11,19};
		int[] arr2 = {1,3,5,6,13,20};
		
		int arr[] = merge(arr1, arr2);
		print(arr);
	}
	
	public static int[] merge(int arr1[], int arr2[]) {
		int n = arr1.length;
		int m = arr2.length;
		int res[] = new int[n+m];
		
		int i=0, j=0, idx=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] > arr2[j]) {
				res[idx] = arr2[j];
				j++;
			}
			else {
				res[idx] = arr1[i];
				i++;
				
			}
			idx++;
		}
		
		while(i<arr1.length) {
			res[idx] = arr1[i];
			i++;
			idx++;
		}
		
		while(j<arr2.length) {
			res[idx] = arr2[j];
			j++;
			idx++;
		}
		
		return res;
	}
	
	public static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
		
}
