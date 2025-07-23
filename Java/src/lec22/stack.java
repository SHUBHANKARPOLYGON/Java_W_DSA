package lec22;

import java.util.Stack;

public class stack {

    private int arr[];
    private int top;

    public stack(){
        arr = new int[5];
        top = 0;
    }

    public stack(int n){
        arr = new int[n];
        top = 0;
    }

    public boolean isEmpty(){
        // return top=0?true:false;
        return top==0;
    }

    public boolean isFull(){
        return top == arr.length;
    }

    public void push (int val) throws Exception{
        if(isFull()) throw new Exception("Stack Overflow!");
        arr[top] = val;
        top++;
    }

    public int pop() throws Exception{
        if(isEmpty()) throw new Exception("Stack is Empty!");
        int rv = arr[top-1];
        top--;
        return rv;
    }

    public int peek() throws Exception{
        if(isEmpty()) throw new Exception("Stack is Empty!");
        return arr[top-1];
    }

    public int size(){
        return top;
    }

    public void Display(){
        for(int i=0; i<top; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
