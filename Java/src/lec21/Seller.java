package lec21;

public class Seller {

	String product;
	int price;
	String location;
	public Seller(String s) {
		product=s;
	}
	public Seller() {
		
	}
	public Seller(String pro,int p, String loc) {
		product=pro;
		price=p;
		location=loc;
	}
	
	public void Loc(String s) {
		location=s;
	}

}