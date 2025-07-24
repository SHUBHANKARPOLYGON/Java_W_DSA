package lec23;

public class Find {

	public static void main(String[] args) {
		int i =find("harsh", "rsh");
        System.out.println(i);
	}
	
	public static int find(String s, String str) {
		
		for (int i = 0; i <s.length(); i++) {
			
			if(s.charAt(i)==str.charAt(0)) {
				int j=1;
				while((i+j)<s.length() &&s.charAt(i+j)==str.charAt(j)) {
					j++;
				}
				if(j==str.length())return i;
			}
			
		}
		return-1;

	}

}
