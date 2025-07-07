package lec10;

public class stringsplit {

	public static void main(String[] args) {
		String s="   hack.codingblocks.com/app/contasts/8283/43         ";
		
		System.out.println(s);
		
		//trim
		s=s.trim();
		System.out.println(s);
		
		String word[]=s.split("\\.");
		int n=word.length;
		System.out.println(n);
		System.out.println("website ->"+word[0]);
		System.out.println("contast ->"+word[n-2]);
		System.out.println("question ->"+word[n-1]);
	}

}
