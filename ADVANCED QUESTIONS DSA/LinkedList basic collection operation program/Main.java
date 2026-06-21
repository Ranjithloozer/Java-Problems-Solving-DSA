import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    LinkedList<Integer> a=new LinkedList<>();
	    a.add(10);
	    a.add(20);
	    a.add(30);
	    a.addFirst(5); // added to the LinkedList in front
	    a.addLast(40);  // added to LinkedList in last
	    a.removeFirst(); //it removes the first element after inserted into the list
	    for(int name:a){
		System.out.println(name);  //display the ouput 
	    }
	}
}
