package lec16;

public class exponential_2 {
	//by sir
	public static void main(String[] args) {
		System.out.println(pow(2,10));

	}
	public static int pow(int x,int n) {
		if(n==1) 
			return x;
		
		int res=pow(x,n/2);
		
		if(n%2==0) {
			return res*res;
		}else{ 
			return res*res*x;
		}
	}

}
