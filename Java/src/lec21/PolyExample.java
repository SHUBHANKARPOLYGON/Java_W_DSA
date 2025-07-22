package lec21;

public class PolyExample {

	public static void main(String[] args) {
		
		int sum=sum(2,3);
		double s1=sum(2.5,4.5);
		int s2=sum(2,3,4);
		System.out.println(sum);
		System.out.println(s1);
		System.out.println(s2);

	}
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	public static double sum(double a, double b) {
		return a+b;
	}
	
	

}