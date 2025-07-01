package lec6;

public class productofarrayLC238 {

	public static void main(String[] args) {
		
		int arr[]= {8,3,2,4,1,2};
		int ans[]= pa(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
	
	public static int[] pa(int arr[]) {
		
		int n=arr.length;
		
		int left[]=new int[n];
		int right[]=new int[n];
		int ans[]=new int[n];
		
		left[0]=1;
		
		//left product
		for(int i=1;i<n;i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		
		//right product
		right[n-1]=1;
		
		for(int i=n-2;i>=0;i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		
		for(int i=0;i<n;i++) {
			ans[i]=left[i]*right[i];
		}
		return ans;
	}

}
