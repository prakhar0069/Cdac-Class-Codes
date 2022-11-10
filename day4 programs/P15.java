class P15{
	public static void main(String args[]){
		for(int i=1;i<5;i++)    //rows                        //if we put here i<=5 then middle lines will become twice
		{
			for(int j=4;j>=i;j--)   //columns
			{
			        System.out.print(" ");
			}	
		for(int j=1;j<=i;j++)    //columns                                      
			{
                  System.out.print("*");
			}	
			System.out.println();
		}
		for(int i=1;i<=5;i++)    //rows
		{
			for(int j=1;j<i;j++)   //columns
			{
                  System.out.print(" ");               //  here we will put space
			}
			for(int j=5;j>=i;j--)   //columns
			{
                  System.out.print("*");
			}	
			System.out.println();
		}
		
	}
}

                      /*

                           OUTPUT:        *
                                         **
                                        ***
                                       ****
                                      *****
                                       ****
                                        ***
                                         **
                                          *
										  
										        */