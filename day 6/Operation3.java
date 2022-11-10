//Note : Data Type,Arguments & Order of Arguments should be same in the case of method overloading calling

class Operation1{

   public static int sum(int i, int j)            //if static method is there in class 1 and we have to call it in class 2,then we have to call using class1 name i.e. Operation.sum(); coz class 1 has static method
   {
      return i+j;
   }
   
   public static int sum(int i, int j,int k)      //if non static method is there in class 1 then we can make object of class 1 & can call it using the object in class 2
   {
      return i+j+k;
   }
   
   public static double sum(double i, double j,double k)
   {
      return i+j+k;
   }
   
}  
   
class Operation3{
   public static void main(String args[]){
   
   //Operation1 op1 =new Operation1();
   
    System.out.println(Operation1.sum(11,22));
	
	System.out.println(Operation1.sum(1.1,2.2,3.3));
	
	System.out.println(Operation1.sum(11,22,33));
	 
   }
   }