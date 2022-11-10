class Operation1{                       //nested classes in which we will make a folder of that class which have main method

   int sum(int i, int j)                //if we declare 1st class as public then we will have to save the program with class 1st name
   {
      return i+j;
   }
}  
   
class Operation2{
   public static void main(String args[]){
   
   Operation1 op1 =new Operation1();            //here we have to call method of 1st class,so we have to make object of 1st class
   
    System.out.println(op1.sum(11,22));
	 
   }
   }