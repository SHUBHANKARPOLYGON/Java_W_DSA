package lec2;

public class start {

	public static void main(String[] args) {
		
		// 5X5 star pattern series
//		int row=1;
//		while (row<=5) {
//			int star=1;
//			while(star<=5) {
//				System.out.print("* ");
//				star=star+1;
//			}
//			System.out.println();
//			row=row+1;
//		}

		
		
		
		//Fibonacci Series
		int ele=2;
		int f=0;
		int s=1;
		
		System.out.print(f+" "+s+" ");
		
		while(ele<=8) {
			int sum=f+s;
			System.out.print(sum+" ");
			f=s;
			s=sum;
			ele=ele+1;			
	}

		
		
}
	
}
