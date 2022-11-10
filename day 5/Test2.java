class Test2{

   static int calculate(int l)
   {
      return l*l*l;
   }
   
   public static void main(String args[]){
   
   /*
   Test2 t1 = new Test2();                      //for instance variable we have to create an object to call it
   int v = t1.calculate(5);
       */

	   int x = calculate(7);                            //for static variable we can call it directly..object formation is not allowed for it.
   //System.out.println("Volume of cube = "+v);
   System.out.println("Volume of cube = "+calculate(7));       //we can directly print it
   System.out.println("Volume of cube = "+x);                  //we can also store it in another variable and print it.
   
}
}