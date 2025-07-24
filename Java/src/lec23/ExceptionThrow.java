package lec23;

public class ExceptionThrow {
public static void main(String[] args) throws Exception {
		
		int age=15;
		
		if(age<18) throw new Exception("pagal bacha tu "
				+ "drive nahi krr skta hain");

		else System.out.println("Bhaiya tum drive krr skte ho");
	}
}
