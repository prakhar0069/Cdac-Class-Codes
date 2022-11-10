import java.util.*;
class Reverse{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int x;
rev=0;
if(num>=0)
{
	r=num%10;
	rev=rev*10+r;
	num=num/10;
}
System.out.println("The reverse of the no. is"+rev);
}
}