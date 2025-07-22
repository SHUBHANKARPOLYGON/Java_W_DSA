package lec21;

public class BankClient {

	public static void main(String[] args) {
		
		BankDetails user= new BankDetails(8);
		
		user.name="harsh";
		
		System.out.println(user.checkBalance());
		user.Deposit(12);
		System.out.println(user.checkBalance());

	}

}