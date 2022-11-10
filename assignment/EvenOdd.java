import java.util.Scanner;
class PrimeNo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int n=num/2;
int count=0;
while(n>0)
{
	for(n;num>=n;n--)
	{
		if(num%n==0)
		{
			count++;
		}
	}
}
if(count==2)
System.out.println("the number"+num+"is prime");
else
System.out.println("the number"+num+"is not prime");
}
}