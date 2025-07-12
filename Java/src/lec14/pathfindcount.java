package lec14;

public class pathfindcount {

	public static void main(String[] args) {
		int n=3;
		int m=3;
		int cc=0; //current column
		int cr=0; //current row
		int dc=m-1; //desired column
		int dr=n-1; //desired row
		
		int total=path("",cc,cr,dc,dr);
		System.out.println(total);
	}
	public static int path(String ans,int cc,int cr, int dc, int dr) {
		if(cc==dc&&cr==dr) {
			System.out.println(ans);
			return 1;
		}
		if(cc>dc || cr>dr)
			return 0;
		
		//Horizontal
		int h=path(ans+"H",cc+1,cr,dc,dr);
		//verticle
		int v=path(ans+"V",cc,cr+1,dc,dr);
		
		return h+v;
	}

}
