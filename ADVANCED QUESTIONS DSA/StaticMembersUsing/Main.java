class Example{
    static String college="hicet";
    String name;
    
    Example(String name){
        this.name=name;
    }
    
    void display(){
        System.out.print(name+" studies@"+college);
    }
}
    class Main{
    public  static void main(String args[]){
        String name="ranjith";
        Example obj=new Example(name);
        obj.display();
    }
}