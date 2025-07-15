package lec16;

public class backtracking {

	public static void main(String[] args) {
		boolean chair[]=new boolean[3];
		seat("",2,chair);
	}
	public static void seat(String ans,int n,boolean chair[]) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<chair.length;i++) {
			if(chair[i]==false) {
				chair[i]=true;
				seat(ans+"Chair "+i+" Queen "+n+"   ",n-1,chair);
				chair[i]=false; //backtrack
			}
		}
		
	}

}
