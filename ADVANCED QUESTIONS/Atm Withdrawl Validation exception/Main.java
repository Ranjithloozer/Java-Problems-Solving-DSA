
public class Main
{
    static void AtmWithdrawlValid(int amount,int balance){
        if(amount>balance){
            throw new ArithmeticException("Insufficient balance");
        }
        System.out.print("Available u can take the money");
    } 
	public static void main(String[] args) {
      AtmWithdrawlValid(5000,1000);
	}
}
