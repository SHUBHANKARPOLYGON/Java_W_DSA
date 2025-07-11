package lec13;

public class subsequences {
	
	//Recursion Basics	
	public static void main(String[] args) {
		String s="abc";
		subseq(s,0,"");

	}
	
	public static void subseq (String s, int i, String ans) {
		if(i==s.length()) {
			System.out.println(ans);
			return;
		}
		
		//include
		subseq(s,i+1,ans+s.charAt(i));
		
		//exclude
		subseq(s,i+1,ans);
		
	}

}
