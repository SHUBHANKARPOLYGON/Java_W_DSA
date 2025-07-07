package lec10;

public class longestcommonprefix {

	public static void main(String[] args) {
		
//		String s="shubhankar";
//		
//		System.out.println(s.charAt(2));
//		System.out.println(s.contains("h"));
//		
//		System.out.println(s.substring(1,4)); //Jitna tak character chahiye uske ek baad tak call hoga
//		String words[]=s.split(" ");
//		for(int i=0;i<words.length;i++) {
//			System.out.println(words[i]+" ->");
//		}
		
		//Leetcode 14 Longest common prefix
		String []strs= {"flower","flow","flight"};
		System.out.println(Prefix(strs));
	}
	
		public static String Prefix(String[]strs) {
			String cm=strs[0];
			int temp=0;
			for(int i=1;i<strs.length;i++) {
				String s=strs[i];
				for(int j=0;j<Math.min(strs[i].length(),cm.length());j++) {
					if(s.charAt(j)!=cm.charAt(j)) {
						cm=s.substring(0,j);
						temp=1;
						break;
					}
			}
				if(temp==0)cm=strs[i].length()<cm.length()?strs[i]:cm;
		}
			return cm;
}
}
