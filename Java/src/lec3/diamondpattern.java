package lec3;

import java.util.Scanner;

public class diamondpattern {

	public static void main(String[] args) {
		
		
		//WAP in java to reverse a given number
		
//		Scanner sc=new Scanner(System.in);
//		
//		int num=sc.nextInt();
//		int rev=0;
//		
//		while(num>0) {
//			int ld=num%10;
//			rev=rev*10+ld;
//			num=num/10;
//		}
//		System.out.println(rev);
		
		
		
		
		
		//Prime number
		
//		Scanner sc=new Scanner(System.in);
//		
//		int num=sc.nextInt();
//		int temp = 0;
//        
//        if (num <= 1) {
//            temp = 1;
//        } else {
//            for (int i = 2; i <= num/2; i++) {
//                if (num % i == 0) {
//                    temp = 1;
//                    break;
//                }
//            }
//        }
//        
//        if (temp == 0) {
//            System.out.println("Prime number");
//        } else {
//            System.out.println("Not a prime");
//        }
		
		
		
		//HCF of a number	
		
//		int n1=90;
//		int n2=20;
//		
//		int hcf=1;
//		
//		for(int i=2;i<Math.min(n1, n2);i++) {
//			if(n1%i==0 && n2%i==0)
//				hcf=i;
//		}
//		System.out.println(hcf);
		
		
		
		//Bostom No.
		
//		int n=378;
//		int temp=n;
//		int fact=2;
//		int factSum=0;
//		
//		//fact sum
//		while(temp>1) {
//			if(temp%fact==0) {
//				int tempfact=fact;
//				
//				while(tempfact>0) {
//					int ld=(tempfact%10);
//					factSum=factSum+ld;
//					tempfact=tempfact/10;
//				}
//				temp=temp/fact;
//			}
//			else {
//				fact++;
//			}
//		}
//		
//		temp=n;
//		int digitSum=0;
//		
//		while(temp>0) {
//			int ld=temp%10;
//			digitSum=digitSum+ld;
//			temp=temp/10;
//		}
//		
//		System.out.println(digitSum==factSum?"Boston":"not a boston");
		
		
		
		//Happy number code
		
		int n=20;
		
		int temp=0;
		
		for(int i=1;i<=1000;i++) {
			int sum=0;
			
			while(n>0) {
				sum=sum+(n%10)*(n%10);
				n=n/10;
			}
			
			if(sum==1) {
				temp=1;
				break;
			}
			n=sum;
		}
		System.out.println(temp==1?"Happy":"not happy");
		
	}

}
