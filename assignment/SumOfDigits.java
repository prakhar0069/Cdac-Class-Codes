import java.util.Scanner;
class Smallest_Of_3_Numbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the third number");
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("the largest number is "+a);
			}
			else
			{
				System.out.println("the largest number is "+c);
			}
		}
		else
		{
			System.out.println("the largest number is "+b);
		}			
		
	}
}