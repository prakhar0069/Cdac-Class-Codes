import java.util.Scanner
class PrintDigits{
	public static void main("Static args[]"){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number you want to print digits of");
		int num=sc.nextInt();
		int r;
		int rev=0;
		while(num!=0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		int num2=0;
		int r2;
		while(num!=0)
		{
			r2=rev%10;
			num2=num2*10+r;
			rev=rev/10;
		}
		System.out.println("the digits are "+num2);	
	}
}