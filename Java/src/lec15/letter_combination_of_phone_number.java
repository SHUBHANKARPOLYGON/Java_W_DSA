package lec15;

//Leetcode problem no. 17
public class letter_combination_of_phone_number {

	public static void main(String[] args) {
		String key[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
				find("",0,"23",key);

	}
	public static void find(String ans, int idx, String digit, String[]key) {
		
		if(idx==digit.length()) {
			System.out.println(ans);
			return;
		}
		int d=digit.charAt(idx)-'0';
		String s=key[d];
		for(int i=0;i<s.length();i++) {
			find(ans+s.charAt(i),idx+1,digit,key);
		}
	}
}
