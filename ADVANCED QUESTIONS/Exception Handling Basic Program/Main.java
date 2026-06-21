
public class Main
{
	public static void main(String[] args) {
		int[] a={1,2,3};
		try{
		    System.out.println(a[2]); //when this executes then it will not goes to catch
		}
		catch(ArrayIndexOutOfBoundsException e){
		    System.out.println("Do u know java bro "); //if try failes then exceutes this
		}
		finally{
		    System.out.print("Ranjith made this "); //it always executes
		}
	}
}
