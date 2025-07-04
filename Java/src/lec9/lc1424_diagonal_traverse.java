package lec9;

public class lc1424_diagonal_traverse {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int row=0;row<arr.length;row++) {
			int r=row;
			int c=0;
			
			while(r>=0&&c<arr[0].length) {
				System.out.print(arr[r][c]+" ");
				r--;
				c++;
			}
		}
		
		for(int col=1;col<arr[0].length;col++) {
			int r=arr.length-1;
			int c=col;
			while(c<arr[0].length&&r>0) {
				System.out.print(arr[r][c]+" ");
				r--;
				c++;
			}
		}
	}

}
