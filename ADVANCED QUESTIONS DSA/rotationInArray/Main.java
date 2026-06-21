import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] a = {10,7,4,5};
        int[] b = {7,4,10,5};
        

        boolean rota = false;
        int i;
       
       if(a.length==b.length){
            int count = 0;
        for (i=0;i<a.length;i++) {
           
            
            for (int j=0;j<a.length;j++) {
                if (a[(i+j)%a.length] == b[j]){
                     count++;

                }
            
        }
            if (count == a.length) {
                rota = true;
                break;
            }
        }
       }
       
        if (rota)
            System.out.println("B is rotation of A");
        else
            System.out.println("B is NOT rotation of A");
    }
}
