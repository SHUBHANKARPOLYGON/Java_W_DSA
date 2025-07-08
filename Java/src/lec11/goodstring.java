package lec11;

public class goodstring {

	public static void main(String[] args) {
		//agr number of vowels consonant se jada ho toh wo goodstring kehlata hai
		
		
		 String s = "/voivvjv*jqjobp@hhw^aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4pofifwffpovhefowf";
	        int n=s.length();
	        int cv=0,cc=0;

	        for (int i= 0;i < n; i++) {
	            char ch = s.charAt(i);
	            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch =='u'||
	                ch =='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
	            {
	                cv++;
	            } else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) 
	            {//we can also use charIsLetter();
	                cc++;
	            }
	        }

	        if (cv>cc) {
	            System.out.println("Good string");
	        } else {
	            System.out.println("Bad string");
	        }

	}

}
