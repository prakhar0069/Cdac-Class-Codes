import java.util.Scanner;
class Array4{

  public static void main(String args[]){
  
  Scanner sc=new Scanner(System.in);
  int[]a1=new int[5];
  
  /*
     for(int i=0;i<3;i++)           //length is used for arrays whereas length() is used for strings
	 {
	    System.out.println("Array Element");
		a1[i]=sc.nextInt();
	 }
	 */
	 
	 for(int i=0;i<a1.length;i++)           //length is used for arrays whereas length() is used for strings
	 {
	    System.out.println("Array Element");
		a1[i]=sc.nextInt();
	 }
  
      //for each loop
	  for(int x:a1)
	  {
		  System.out.println(x);
	  }
	 
  }
}