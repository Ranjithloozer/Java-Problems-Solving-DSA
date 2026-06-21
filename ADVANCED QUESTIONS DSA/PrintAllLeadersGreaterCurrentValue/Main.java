
//using two loops


public class Main
{
	public static void main(String[] args) {
	
		int[] a={5,6,10,9,8};
		boolean flag=false;
		for(int i=0;i<a.length;i++){
		    for(int j=i+1;j<a.length;j++){
		        
		        if(a[i]>a[j]){
		            flag=true;
		            System.out.println(a[i]);
		            
		            break;
		        }
		       
		    }
		   
		}
		 if(flag==false){
		        System.out.print("not ");
		  
		    }
	}
}



//if the currect number is grater than right side number then the currect number is print
 //another method
 
 //using one loop 

public class Main
{
	public static void main(String[] args) {
	
		int[] a={9,7,8,6,3,4,2};
		int n=a.length;
		boolean flag=false;
		for(int i=0,j=i+1;i<n-1;j++){
		    
		        if(a[i]>a[j]){
		            flag=true;
		            System.out.println(a[i]);
		            i++;
		            j=i;
		    }

		}
		 if(flag==false){
		        System.out.print("not ");
		  
		    }
	}
}




