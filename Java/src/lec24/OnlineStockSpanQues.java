package lec24;
import java.util.Stack;
public class OnlineStockSpanQues{
	static class StockSpanner {
		Stack <int[]> st;
	    public StockSpanner() {
	        st = new Stack<>();
	    }
	    
	    public int next(int price) {
	        int day =1;
	        
	        while(! st.isEmpty() && st.peek()[1] <= price) {
	        	int arr[] = st.pop();
	        	day = day + arr[0];
	        }
	        
	        int[] narr = new int[2];
	        narr[0] = day;
	        narr[1] = price;
	        
	        st.push(narr);
	        
	        return day;
	    } 
	}
	public static void main(String args[]) {
    	StockSpanner s = new StockSpanner();
    	System.out.print(s.next(100)+" ");
    	System.out.print(s.next(80)+" ");
    	System.out.print(s.next(60)+" ");
    	System.out.print(s.next(70)+" ");
    	System.out.print(s.next(60)+" ");
    	System.out.print(s.next(75)+" ");
    	System.out.print(s.next(85)+" ");
    	
    }	
}