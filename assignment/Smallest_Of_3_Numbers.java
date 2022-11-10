import java.util.Scanner;
class Even_Number_Series{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int num=sc.nextInt();
		int temp=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0);
			{
			System.out.print(i);
			}
		}
		
	}
}