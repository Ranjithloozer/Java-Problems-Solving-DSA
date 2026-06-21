//throws
import java.io.*;
public class Main
{
	
       static void readFile() throws IOException{
           FileReader fr=new FileReader("abc.txt");
       }
       public static void main(String[] args) {
           try{
               readFile();
           }
           catch(Exception e){
               System.out.println("Exception Handled");
           }
       }
}
