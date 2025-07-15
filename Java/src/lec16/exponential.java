package lec16;

public class exponential {
	
	//by my own
	public static void main(String[] args) {
		System.out.println(expo(2,10));
	}
	public static int expo(int x,int n) {
		if(x==0) {
			return 0;
		}
		if(n==1) {
			return x;
		}
		int pow=x*expo(x,n-1);
		return pow;
	}

}
