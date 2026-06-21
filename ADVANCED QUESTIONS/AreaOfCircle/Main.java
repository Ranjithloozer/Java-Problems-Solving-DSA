import java.util.Scanner;
 class Circle{
    double r,area;
    public void getdata(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter r: ");
        r=in.nextDouble();
    }
    
     public void cal(){
        area=3.14*r*r;
        System.out.print("Area is: "+area);
    }
}




 class Main
{
	public static void main(String[] args) {
	    Circle obj=new Circle();
	    obj.getdata();
	    obj.cal();
	    
	}
}
