package lec22;

public class stack_client {

    public static void main(String[] args) throws Exception{
        stack s = new stack(2);
        // System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        System.out.println(s.peek());
        // s.Display();
        // System.out.println(s.isFull());
    }
}
