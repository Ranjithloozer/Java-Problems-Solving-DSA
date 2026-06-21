
public class Main
{
		static int[] queue=new int[5];
		static int rear=-1;
		
		static void enqueue(int value){
		    if(rear==4){
		        System.out.println("Queue is full");
		        return;
		    }
		    rear++;
		    queue[rear]=value;
		}   
		 public static void main(String[] args) {
		 
		 enqueue(10);
		 enqueue(20);
		 enqueue(30);
		 for(int i=0;i<=rear;i++){
		     System.out.print(queue[i]+" ");
		 }
		}
	
}
