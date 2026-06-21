import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        int Row,noOfRota;
        Scanner in=new Scanner(System.in);

        int r=in.nextInt();
        int c=in.nextInt();

        int[][] a=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=in.nextInt();
            }
        }

        System.out.println("Enter the row to rotate ");
        Row=in.nextInt();

        System.out.println("Enter how many rotations or shifts to rotate ");
        noOfRota=in.nextInt();

        int b=Row- 1;          
        noOfRota =noOfRota%c;             //   its for our reference
        for(int k=0;k<noOfRota;k++){
            int temp=a[b][c-1];           // int temp = a[b][0];

            for(int j=c-1;j>0;j--){      //for(int j = 0; j < c-1; j++)
                a[b][j] = a[b][j-1];      //  a[b][j] = a[b][j+1];
            }

            a[b][0] = temp;               //a[b][c-1]=temp
        }

        System.out.println(" after rotation:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
