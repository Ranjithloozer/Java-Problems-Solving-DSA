import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for(int num=1;num<=1000;num++){
            int ori=num;
            int temp=num;
            int digits=0;
            while(temp!=0){
                temp/=10;
                digits++;
            }
        int sum = 0;
         temp = num;

       while(temp != 0){
            int rem = temp % 10;
           int power = 1;
       
    for(int i=1;i<=digits;i++){
       power = power * rem;
    }
       sum = sum + power;
       temp = temp / 10;
            
        }
        if(sum==ori)
        System.out.println(ori);

        }
    }
}