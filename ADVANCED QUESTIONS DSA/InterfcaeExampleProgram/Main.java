interface Circle{
    double pi=3.14;
   public void cal();
    
}
 class Area implements Circle{
    double r,area;
    Area(double r){
        this.r=r;
    }
    public void cal(){
        area=pi*r*r;
        System.out.println(area);
	}
    }


 class Main
{
	public static void main(String[] args) {
	    Area obj=new Area(10);
	    obj.cal();
		
}
}