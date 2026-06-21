import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
          int[] a={1,2,3,4,5};
          int[] b={6,7,8,9};
          int[] c=new int[a.length+b.length];
          int i,j;
          for( i=0;i<a.length;i++){
              c[i]=a[i];
          }
          for( i=0;i<b.length;i++){
              c[a.length+i]=b[i];
          }
             for( int k=0;k<c.length;k++){
              System.out.print(c[k]+",");
          }
          }
}