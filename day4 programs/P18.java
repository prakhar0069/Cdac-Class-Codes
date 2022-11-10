class P18{
	public static void main(String args[]){
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
                  System.out.print(" ");
			}	
			for(int j=1;j<=i;j++)
			{
                  //System.out.print("*");                                 // if we print * here then the output will be  * but if we pur a space after star i.e. "* " then the output will be     * 
				                                                                                               //        **                                                                       * *
																												//	    ***                                                                      * * *
																												///	   ****   														            * * * * 
																											
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
							   
							   
							   
							   */