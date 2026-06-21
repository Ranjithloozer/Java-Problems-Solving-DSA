import java.util.Scanner;

class A{
    int a;
    A(){
        a=0;
    }

public void get(int a){  //same method name different parameters
    this.a=a;
    System.out.println("a is:"+a);
}
}   
   class B extends A{
       int b;
       B(){
           super();
           b=0;
       }
       public void get(){   // same method name no paramters

           Scanner in=new Scanner(System.in);
           b=in.nextInt();
           System.out.println("b is:"+b);
       }
   }
   class Main{
       public static void main(String args[]){
           B obj=new B();
           obj.get(10);
           obj.get();
       }
   }