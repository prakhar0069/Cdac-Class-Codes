public class InstanceMethod4{

String sayHello(String s)
{
   String str;
   str = s + " CDAC ";
   return str;
}

int addition(int x, int y)
{
   int sum = x+y;
   return sum;
}
public static void main(String args[]){
	
InstanceMethod4 i1 = new InstanceMethod4();
InstanceMethod4 i2 = new InstanceMethod4();
String s1 = i1.sayHello("Good Morning");
System.out.println(s1);

int s = i2.addition(25,40);
System.out.println("Addition = "+s);
System.out.println(i2.addition(10,20));
}
}