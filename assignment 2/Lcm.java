import java.util.*;
class Lcm{
public static void main(String args[]){
int a=10;
int b=5;
int gcd=0;
int lcm=0;
for(int i=1;i<= a && i <= b; i++)
{
if(a%i==0 && b%i==0)
{
   gcd=i;
}
else
{
gcd=1;
}
}
System.out.println("this gcd of the two numbers is "+gcd);
lcm=(a*b)/gcd;
System.out.println("this lcm of the two numbers is "+lcm);
}

}