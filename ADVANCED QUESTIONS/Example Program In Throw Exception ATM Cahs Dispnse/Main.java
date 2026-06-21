
public class Main
{
	static void withdraw(int amount){
	    if(amount%100 !=0){
	        throw new ArithmeticException
	           ( "Amount should be multiple of 100");
	        }
	        System.out.println("cash dispensed");
	    }
	
	public static void main(String[] args) {
		try{
		    withdraw(493);
		}
		catch(Exception e){
		    System.out.print(e.getMessage());
		}
	}
}
