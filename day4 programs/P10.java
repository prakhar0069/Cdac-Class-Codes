class P10{
	public static void main(String args[]){
		for(int i=1;i<5;i++)    //rows
		{
			for(int j=1;j<=i;j++)   //columns
			{
                  System.out.print("* ");
			}	
			System.out.println();
		}
		for(int i=1;i<=5;i++)    //rows                                          //isme middle wali line ek hi print hogi
		{
			for(int j=5;j>=i;j--)   //columns
			{
                  System.out.print("* ");
			}	
			System.out.println();
		}
		
	}
}





               /*
                    Output:  
					
					            *
                                * *
                                * * *
                                * * * *
                                * * * * *
                                * * * *
                                * * *
                                * *
                                *

							   
							   */