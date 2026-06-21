import java.util.Scanner;
 class Factorial{
     int n,fact;
     Factorial()
     {
         fact=1;
         n=7;
         
     }
     public void cal(){
         for(int i=1;i<=n;i++){
             fact=fact*i;
         }
         System.out.print(fact);
     }
 }
 class Main
{
	public static void main(String[] args) {
	    Factorial obj=new Factorial();
	    obj.cal();
	   
	    
	    
	    
	}
}
