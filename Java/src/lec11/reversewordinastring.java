package lec11;

public class reversewordinastring {

	public static void main(String[] args) {
		
		String s="the       sky       is        blue";
		System.out.println(Rev(s));
	}
	
	public static String Rev(String s) {
		String rev="";
		s=s.replaceAll("\\s", " "); //it will remove the spacing
		String words[]=s.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			rev=rev+words[i]+" ";
		}
		return rev.trim();
	}

}
