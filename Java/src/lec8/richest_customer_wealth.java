package lec8;

public class richest_customer_wealth {

	
	//Leetcode 1672 Richest Customer Wealth
	public static void main(String[] args) {
		int arr[][]= {{1,5},{7,3},{3,5}};
		int max=find(arr);
		System.out.println(max);

	}
	public static int find(int[][] accounts) {
		int maxWealth=0;
		
		for(int i=0;i<accounts.length;i++) {
			int currentWealth=0;
			for(int j=0;j<accounts[i].length;j++) {
				currentWealth+=accounts[i][j];
			}
			if(currentWealth>maxWealth) {
				maxWealth=currentWealth;
			}
		}
		return maxWealth;
	}
}
