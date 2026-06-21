import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<String> names=new ArrayList<>();
	    names.add("Ranjith");
	    names.add("kumar");
	    names.add("mad"); // added to the list
	    names.remove("mad"); //remove from the list
	   System.out.println( names.get(0)); // accessing elements using get NoSuchMethodError
	   
	   names.set(0,"ram");  // update the values or data
	    for(String name:names){
		System.out.println(name);
	    }
	}
}
