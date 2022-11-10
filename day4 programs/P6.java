class P6{
	public static void main(String args[]){
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)                                               //we can also put j<=i-1 here
			{
                  System.out.print(j+" ");
			}	
			for(int j=i-1;j>=1;j--)                                            // if we will not put j=i-1 here and will put j=i then it will print 1
			                                                                     //                                                                 1 2 2 1
																					//															    1 2 3 3 2 1 hence middle two no.s are repeating	                                                               
			{
                  System.out.print(j+" ");
			}	
			System.out.println();
		}
		
	}
}





               /*
                    Output:  
					           1
							   1 2 1
							   1 2 3 2 1
							   1 2 3 4 3 2 1
							   1 2 3 4 5 4 3 2 1
							   
							   */
		