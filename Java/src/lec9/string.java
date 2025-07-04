package lec9;

public class string {

	public static void main(String[] args) {
		
//		char ch='M';
//		System.out.println((int)ch); //Typecasting to Int
//		System.out.println((char)97); //ASCII code
		
		String s="shubhankar";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.print(ch);
		}
	}

}
