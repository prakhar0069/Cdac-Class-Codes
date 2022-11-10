class P11{
	public static void main(String args[]){
		for(int i=1;i<=5;i++)    //rows
		{
			for(int j=5;j>=i;j--)   //columns
			{
                  System.out.print("* ");
			}	
			System.out.println();
		}
		for(int i=1;i<=5;i++)    //rows                                       //but it will print middle lines two times
		{
			for(int j=1;j<=i;j++)   //columns
			{
                  System.out.print("* ");
			}	
			System.out.println();
		}
		
	}
}





               /*
                    Output:  
					
					           * * * * *
                               * * * *
                               * * *
                               * *
                               *
                               *
                               * *
                               * * *
                               * * * *
                               * * * * *

							   
							   */