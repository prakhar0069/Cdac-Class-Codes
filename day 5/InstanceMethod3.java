public class InstanceMethod3{

String sayHello(String s)                // void don't return anything so we have to give here required datatype
{
   String str;
   str = s + " CDAC ";
   return str;
}
public static void main(String args[]){
	
InstanceMethod3 i1 = new InstanceMethod3();
String s1 = i1.sayHello("Good Morning");
System.out.println(s1);
}
}