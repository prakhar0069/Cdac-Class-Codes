class DoWhileLoop1{
public static void main(String args[]){
int i=5;                                   //initialization before while,do while loop is necessary
do
{
	i=i+10;
System.out.println(i++);                    //if we do not increment/decrement inside while,do while loop then it will become infinite loop
}   while(i<10);
}
}