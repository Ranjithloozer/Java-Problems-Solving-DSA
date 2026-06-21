import java.util.*;
class MyQueue {
 Stack<Integer> a;
 Stack<Integer> b;     
    public MyQueue() {
        a=new Stack<>();
        b=new Stack<>();
    }
    
    public void push(int x) {
        a.push(x);
    }
    
    public int pop() {
        peek();
        return b.pop();
    }
    
    public int peek() {
        if(b.isEmpty()){
            while(!a.isEmpty()){
                b.push(a.pop());
            }
        }
        return b.peek();
    }
    
    public boolean empty() {
        return a.isEmpty() && b.isEmpty();
    }
}

class Main{
    public static void main(String args[]){
       MyQueue obj = new MyQueue();
          obj.push(1);
          obj.push(2);
          obj.push(3);
          
        System.out.println(obj.pop());   
        System.out.println(obj.peek());
        System.out.println(obj.empty());
    }
}

