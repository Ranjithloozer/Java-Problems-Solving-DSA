class Example{
    
   static int count=0;
    
      Example(){
        count=count+1;
    }
    public void dis()
    {
         System.out.print("objects created: "+count);
    }
    
}
    class Main{
    public  static void main(String args[]){
      
        Example obj1=new Example();
         Example obj2=new Example();
          Example obj3=new Example();
           Example obj4=new Example();
           obj4.dis();
           
           
            //  System.out.print(Example.count);

    }
}