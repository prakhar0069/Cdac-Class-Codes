class Test5{

    static int x = 20;
	
	static int change()
	{
	   int x = 10;             //it is a local variable inspite of static
	   return x;
	}
	
	public static void main(String args[]){
		System.out.println(x);
	int a = change();
	
	System.out.println(a);
	System.out.println(x);
	
	}
	}