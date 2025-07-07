package lec10;

public class arrayfreq {

	public static void main(String[] args) {
		
//		String s="kalakaliya";
//		
//		int arr[]=new int[26];
//		for(int i=0;i<s.length();i++) {
//			int idx=s.charAt(i)-'a';
//			
//			arr[idx]++;
//		}
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=0) {
//				System.out.println((char)('a'+i)+" "+arr[i]);
//			}
//		}
		
		// Count capital Characters
		 String s = "abGdjEDJdkkdykGIEGOjo";
	        int count = 0;
	        for(int i= 0;i<s.length();i++) {
	            char c= s.charAt(i);
	            if(c>='A' && c<='Z') {
	                count++;
	            }
	        }
	        System.out.println("Number of capital characters: " +count);
	}

}
