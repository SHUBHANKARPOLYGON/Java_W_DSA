package lec4;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
		
		//normal arrar ques
		
//		Scanner sc=new Scanner(System.in);
//		int size=sc.nextInt();
//		
//		int arr[]=new int[size];
//		
//		for(int i=0;i<=size-1;i++) {
//			arr[i]=sc.nextInt(); //come array in input
//		}
//		for(int i=0;i<=size-1;i++) {
//			System.out.print(arr[i]+" "); 
//		}
		
		
		//sum of array
		
//		Scanner sc=new Scanner(System.in);
//		int size=sc.nextInt();
//		
//		int arr[]=new int[size];
//		
//		for(int i=0;i<=size-1;i++) {
//			arr[i]=sc.nextInt();
//		}
//		
//		System.out.println();
//	int sum=0;
//	for(int i=0;i<=size-1;i++) {
//		sum=sum+arr[i];
//		System.out.println(sum);
//	}


		//array max min element searching
		
//		int arr[]= {3,2,4,5,71,5};
//		
//		int min=Integer.MAX_VALUE; //dont know the minimum
//		int max=Integer.MIN_VALUE; //dont know the maximum
//		
//		for(int i=0;i<arr.length;i++) {
//			if(max<arr[i]) {
//				max=arr[i];
//			}
//			if(min>arr[i])min=arr[i];
//		}
//		System.out.println(min+" "+max);
		
		
		
		//two sum array
		
		int arr[]= {1,2,3,4,5};
		int target=5;
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(i+" "+j);
					temp=1;
					break;
				}
				
			}
			if(temp==1)break;
			
		}
		
		if(temp==0)
			System.out.println("target not found");
		
		
		
}

}
