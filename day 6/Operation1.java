

public class Operation1{

/*
   int sum(int i, int j)                     //non static method
   {
      return i+j;
   }
   */
   
  static int sum(int i, int j)                 //static method
   {
      return i+j;
   }
   
   public static void main(String args[]){
   
    System.out.println(sum(11,22));           ////here sum is non static & main is static so it can't be referenced,we have to make sum as static
	 
   }
   }