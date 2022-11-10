import java.util.Scanner;
class Swap{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first digit");
		int a=sc.nextInt();
		System.out.println("enter the second digit");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		
	}
}