package lec23;

public class StackClient {
public static void main(String[] args) throws Exception {
		
		Stack s= new Stack(5);
		
		s.push(1);
		s.push(2);
        s.Display();
        s.push(6);
        s.push(8);
        s.pop();
        s.Display();
        s.pop();
        s.pop();
        s.pop();
        s.Display();
//        s.pop();
        s.push(6);
        s.push(8);
        s.push(6);
        s.push(8);
        s.push(6);
        s.push(8);
        
        
        
        

	}
}
