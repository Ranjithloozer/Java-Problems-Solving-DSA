import java.util.*;
class MyStack {
  Queue<Integer> a;
  Queue<Integer> b;
    public MyStack() {
       a=new LinkedList<>();
       b=new LinkedList<>();
    }
    public void push(int x) {
       b.offer(x);
       while(!a.isEmpty()){
       b.offer(a.poll());
       }
        Queue<Integer> temp=a;
        a=b;
        b=temp;
    }
    public int pop() {
        return a.poll();
    }
    public int top() {
        return a.peek();
    }
    public boolean empty() {
        return a.isEmpty();
    }
}
class Main{
    public static void main(String args[]){
       MyStack myStack = new MyStack();
          myStack.push(1);
          myStack.push(2);
          myStack.push(3);
          myStack.top(); 
         myStack.pop(); 
         myStack.empty(); 

  System.out.println(myStack.top());   
        System.out.println(myStack.pop());   
        System.out.println(myStack.empty());
    }
}

  