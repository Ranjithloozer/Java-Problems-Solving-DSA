import java.util.Scanner;
public class Main
{
    public static int hextoDeci(String hex){
        int value;
        int decimal=0,power=0;
        for(int i=hex.length()-1;i>=0;i--){
            char ch=hex.charAt(i);
            if(ch>='0'&& ch<='9'){
                value=ch-'0';
            }else{
                value=ch-'A'+10;
            }
            decimal+=value*(int)Math.pow(16,power);  //int is not mandtory if its not works can use int to comvert
            power++;
        }
        return decimal;
    }

        public static String deciToOctal(int decimal){
            int rem;
            String octal="";
            while(decimal>0){
                rem=decimal%8;
                octal=rem+octal;
                decimal/=8;
            }
            return octal;
        }

    
    
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter hexa values:");
		String hex=in.nextLine();
		int hexavalue=hextoDeci(hex);
		String octal=deciToOctal(hexavalue);
		System.out.print(octal);
		
	}
}
