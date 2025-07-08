package lec11;

public class frequencynum {

	public static void main(String[] args) {
		String s="aabbcdffgii";
		int i=0;
		while(i<s.length()) {
			int j=i;
			
			while(j<s.length()&&s.charAt(i)==s.charAt(j)) {
				j++;
			}
			System.out.println(s.charAt(i)+"->"+(j-i));
			i=j;
		}

	}

}
