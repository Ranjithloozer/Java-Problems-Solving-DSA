import java.util.Stack;
 class Main
{
   public static boolean a(String s){
       
       while(s.contains("()")||s.contains("[]")||s.contains("{}")){
           s=s.replace("()","").replace("[]","").replace("{}","");
       }
        return s.isEmpty();
    }
	public static void main(String[] args) {
	String s="([{}])";
	if(a(s)){
	    System.out.print("balanced");
	}else{
	    System.out.print("not balanced");
	}
	}
}
