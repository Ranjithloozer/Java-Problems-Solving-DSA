import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int n;
       Scanner in=new Scanner(System.in);
       System.out.print("Enter num :");
       n=in.nextInt();
       boolean isPrime=true;
       for(int i=2;i<=Math.sqrt(n);i++){
           if(n%i==0){
               isPrime=false;
               break;
           }
       }
  if(isPrime){
  
      System.out.println("Prime num");
  }else{
      System.out.println("Not prime");
  }
       
    }
}
