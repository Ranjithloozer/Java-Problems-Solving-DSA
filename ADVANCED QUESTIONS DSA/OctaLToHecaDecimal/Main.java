import java.util.Scanner;
class Main{
    public static int octalToDeci(int octal){
        int decimal=0;
        int base=1;
        
        while(octal>0){
            int lastDigit=octal%10;
            decimal=decimal+lastDigit*base;
            base=base*8;
            octal/=10;
        }
        return decimal;
    }
    
    public static String DeciToHex(int decimal)
    {
        String hex="";
        while(decimal>0){
            int rem=decimal%16;
            if(rem<10){
                hex=rem+hex;
            }
            else if(rem>=10){
                hex=(char)((rem-10)+'A')+hex;
            }
            decimal/=16;
        }
        return hex;
    }
    
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int octal=in.nextInt();
        int decimal=octalToDeci(octal);
        String hexaDecimal=DeciToHex(decimal);
        System.out.println("hexa is :"+hexaDecimal);
    }
}