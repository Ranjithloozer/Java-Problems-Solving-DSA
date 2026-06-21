abstract class Shape{
    double area;
    abstract public void cal();
}
class Circle extends Shape{
    int r;
    double pi=3.14;
    Circle(int r){
        this.r=r;
    }
    public void cal(){
        area=pi*r*r;
        System.out.print("area is: "+area);
    }
}
class Main{
    public static void main(String args[]){
        Circle obj=new Circle(6);
        obj.cal();
    }
}



