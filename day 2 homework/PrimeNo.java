import java.util.*;
class Factorial{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int a=num;
int x=1;
int b;
for(a;a>=x;a--)
{
	b=x*num;
}
System.out.println("the factorial of the number"+a" is "+b);
}
}