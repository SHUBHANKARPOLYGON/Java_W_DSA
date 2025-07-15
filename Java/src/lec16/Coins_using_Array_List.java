package lec16;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Coins_using_Array_List {

	public static void main(String[] args) {
		int coins[]= {2,3,5};
		int target=8;
		exchange(new ArrayList<>(), target,coins,0);
	}
	public static void exchange(List<Integer> ans,int target,int coins[], int i) {
		if(target==0) {
			System.out.println(ans);
			return;
		}
		while(i<coins.length) {
			if(target>=coins[i]) {
				ans.add(coins[i]);
				exchange(ans,target-coins[i], coins, i);
				ans.remove(ans.size()-1);
			}
			i++;
		}
	}
}
