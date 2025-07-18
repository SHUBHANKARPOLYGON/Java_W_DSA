package lec19;

public class Merge_sort {

	public static void main(String[] args) {
		int arr[] = {6,9,1,5,3,11,3,4};

		int arr_sort[] = sort(0, arr.length-1, arr);
		for(int i=0; i<arr_sort.length; i++) {
			System.out.print(arr_sort[i]+ " ");
		}
	}
	public static int[] sort(int start, int end, int arr[]) {
		if(start == end) {
			int a[] = new int[1];
			a[0] = arr[start];
			return a;
		}
		int mid = (start + end)/2;
		int first_arr[] = sort(start, mid, arr);
		int second_arr[] = sort(mid+1, end, arr);

		int[] a = merge(first_arr, second_arr);
		return a;
	}

	private static int[] merge(int[] arr1, int[] arr2) {
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

}
