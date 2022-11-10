public class InstanceMethod2{

void sayHello(String s)
{
   System.out.println(s);
}
public static void main(String args[]){
InstanceMethod2 i1 = new InstanceMethod2();
i1.sayHello("Good Morning");

}
}