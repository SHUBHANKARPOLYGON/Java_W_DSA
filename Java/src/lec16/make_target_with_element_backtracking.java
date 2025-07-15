package lec16;

public class make_target_with_element_backtracking {

	//Coins find target using given array
	public static void main(String[] args) {
		int coins[]= {2,3,5};
		int target=8;
		exchange("",8,coins,0);
	}
	public static void exchange(String ans, int target, int coins[],int idx) {
		if(target==0) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<coins.length;i++) {
			if(target>=coins[i]) {
				exchange(ans+coins[i],target-coins[i],coins,i);
			}
		}
	}

}
