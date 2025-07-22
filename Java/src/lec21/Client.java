package lec21;

public class Client {

	public static void main(String[] args) {
		
		Seller s= new Seller("Tv",500,"patna Amity");
		
		Seller s1= new Seller();
		
		Seller s2= new Seller("Washing machin");
		
		System.out.println(s.product+" "+s.price+" "+s.location);
        System.out.println(s1.product+" "+s1.price+" "+s1.location);
	}

}