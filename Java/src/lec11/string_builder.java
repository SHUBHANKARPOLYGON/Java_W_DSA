package lec11;

public class string_builder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		String ans="";
		System.out.println("String loop ongoing");
		for(int i=0;i<500000;i++) {
			ans=ans+"0";
		}
		System.out.println("String loop stop");
		
		System.out.println("String builder value will be change");
		for(int i=0;i<500000;i++) {
			sb.append("0");
		}
		System.out.println("String builder loop over");

	}

}
