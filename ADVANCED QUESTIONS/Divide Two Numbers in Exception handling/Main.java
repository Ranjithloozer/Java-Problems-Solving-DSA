
public class Main
{
	public static void main(String[] args) {
	//	int[] a={1,2,3};
		
				   
		try{
		     int n1=8;
		    int n2=0;
		int n3=n1/n2;
		    System.out.println(n3);
		    //when this executes then it will not goes to catch
		}
		catch(Exception e){
		    System.out.println("Do u know java bro "); //if try failes then exceutes this
		}
		finally{
		    System.out.print("Ranjith made this "); //it always executes
		}
	}
}
