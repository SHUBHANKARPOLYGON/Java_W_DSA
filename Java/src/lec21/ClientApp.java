package lec21;

public class ClientApp {

	public static void main(String[] args) {
		
		AppV1 v= new AppV1();
		
//		v.chat();
//		v.seen();
//		v.video();
		
		
		AppV2 v2=new AppV2();
		
		v2.chat();
		v2.videocall();
		v2.seen();
	}

}