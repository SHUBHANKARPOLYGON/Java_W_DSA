package lec2;

import java.util .*;  
public class custominput {

	private static double sum;

	public static void main(String[] args) {
		
		
		
		//custom input to print star pattern
//		Scanner sc= new Scanner(System.in);
//		
//		int row=sc.nextInt();
//		int cr=1;
//		while (cr<=row) {
//			
//			int star=1;
//			while(star<=cr) {
//				System.out.print("* ");
//				star=star+1;
//			}
//			System.out.println();
//			cr=cr+1;
//		}
		
		
		
		//Factorial of a number 
//		Scanner sc =new Scanner(System.in);
//		
//		int num=sc.nextInt();
//		int fact=2;
//		
//		while(num>1) {
//			if(num%fact==0) {
//				System.out.println(fact);
//				num=num/fact;
//			}
//			
//			else fact=fact+1;
//		}
		
		
		
		// Given a number and count a digits in a number
		
//		Scanner sc =new Scanner(System.in);
//		
//		int num=sc.nextInt();
//		
//		int cnt=0;
//		while(num!=0) {
//			num=num/10;
//			cnt=cnt+1;
//		}
//		System.out.println(cnt);
		
		
		
		
		
		//sum of number and its digit
//		Scanner sc=new Scanner(System.in);
//		
//		int num=sc.nextInt();
//		
//		int cnt=0;
//		while (num!=0) {
//		
//			int ld=num%10;
//			num=num+ld;
//			num=num/10;
//	}
//	
//			System.out.println(num);
		

		
		
		//Armstrong of a number
		
		Scanner sc=new Scanner(System.in);
		
		double num=sc.nextInt();
		
		int cnt=0;
		int temp=(int) num;
		while(temp!=0) {
			 cnt=cnt+1;
			 temp=temp/10; 
		 }
		 
		 temp=(int) num;
		 
		 while(temp!=0) {
			 int ld=temp%10;
			 sum=sum+(int) Math.pow(ld, cnt);
			 
			 
			 temp=temp/10;
		 }
		 
		 if(num==sum) {
			 System.out.println("Armstrong");
	}
		 else {
			 System.out.println("this is not armstrong");
		 }
		
		
	}
}
