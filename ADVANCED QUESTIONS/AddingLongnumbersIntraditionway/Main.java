import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter: ");
        String n1=in.nextLine();
        System.out.print("Enter: ");
        String n2=in.nextLine();
        int carry=0;
        String result=" ";
        
        int i,j;
        for(i=n1.length()-1,j=n2.length()-1;i>=0||j>=0;i--,j--){
            int a=0,b=0;
            if(i>=0){
                a=n1.charAt(i)-'0';
            }
              if(j>=0){
                b=n2.charAt(j)-'0';
            }
            int sum=a+b+carry;
            carry=sum/10;
            result=sum%10+result;
            
        }
        if(carry!=0){
            result=carry+result;
        }
        System.out.print(result);
    }
}