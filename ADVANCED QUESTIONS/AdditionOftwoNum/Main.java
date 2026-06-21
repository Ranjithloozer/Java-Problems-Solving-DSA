import java.util.Scanner;
 class Sum{
     private int a,b,c;
     public void setter(int a,int b){
         this.a=a;
         this.b=b;
     }
     public int get_a(){
         return a;
     }
     public int get_b(){
         return b;
     }
     
     public void dis(){
         c=a+b;
         System.out.print(c);
     }
 }

 class Main
{
	public static void main(String[] args) {
	    Sum obj=new Sum();
	   
	    obj.setter(5,10);
	    System.out.println("a is: "+obj.get_a());
	    System.out.println("b is: "+obj.get_b());
	    obj.dis();
	    
	    
	}
}
