import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        
        int n1=s1.length()-1;
        int n2=s2.length()-1;
        
        int carry=0;
        String sum="";
        while(n1>=0 || n2>=0 || carry==1){
           int num=carry;
           
             if(n1>=0){
                num+=s1.charAt(n1)-'0';
                n1--;
            }
            if(n2>=0){
               num+=s2.charAt(n2)-'0';
               n2--;
            }
                carry=num/2;
                num=num%2;
                sum=num+sum;
           
        }
         System.out.print(sum);
        
    }
}