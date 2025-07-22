package lec21;

public class BankDetails {
    
	String name;
	private int amt;
	
	public BankDetails(int i) {
		amt=i;
	}
	
	public void Deposit(int amount) {
		amt=amt+amount;
	}
	
	public  int checkBalance() {
		return amt;
	}
	
}