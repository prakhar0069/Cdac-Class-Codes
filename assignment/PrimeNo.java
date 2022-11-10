import java.util.Scanner;
class PrimeNo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int n=num/2;
int count=0;
if(num==0)
{
	System.out.println("the number "+num+" is neither prime nor composite");
	return;
}
	for(int i=2;i<=n;i++)
	{
		if(num%i==0)
		{
			count=1;
			break;
		}
	}
if(count==0)
{
System.out.println("the number"+num+"is prime");
}
else
{
System.out.println("the number"+num+"is not prime");
}
}
}