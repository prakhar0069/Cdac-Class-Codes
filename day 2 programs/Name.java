import java.util.Scanner;
class even{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	if(a%2==0)
	{
	System.out.println("the number is even");
}
else
{
	System.out.println("the number is odd");
}
}
}