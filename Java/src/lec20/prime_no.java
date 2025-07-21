package lec20;

public class prime_no {
	
	//Time Complexities
	public static void main(String[] args) {
		for(int i=2;i<=100000;i++) {
			if(Prime(i)==true) {
				System.out.println(i);
			}
		}
	}
	public static boolean Prime(int n) {
		for(int i=2;i<=(n-1);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
