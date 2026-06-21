
public class Main
{
		static int[] queue={10,20,30};
		static int front=0;
		static int rear=2;
		
		static void dequeue(){
		    if(front==-1){
		        System.out.println("Queue is empty");
		        return;
		    }
		   System.out.println("Removed : "+ queue[front]);
		   front++;
		}   
		 public static void main(String[] args) {
		 
		 dequeue();
		 
		 for(int i=front;i<=rear;i++){
		     System.out.print(queue[i]+" ");
		 }
		}
	
}
