
public class Main
{
	static void validateMarks(int mark){
	    if(mark<90 || mark>100){
	        throw new ArithmeticException
	           ( "Mark Should be Within the 90 to 100 range");
	        }
	        System.out.println("Scored Top Grade");
	    }
	
	public static void main(String[] args) {
		try{
		    validateMarks(95);
		}
		catch(Exception e){
		    System.out.print(e.getMessage());
		}
	}
}
