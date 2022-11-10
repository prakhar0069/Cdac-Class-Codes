import java.util.Scanner;
class SumOfDigits{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int temp=0;
		int sum=0;
		while(a!=0)
		{
	    temp=a%10;
		sum=sum+temp;
		a=a/10;
		}
	}
}