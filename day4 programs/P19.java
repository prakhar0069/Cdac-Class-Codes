class P19{
	public static void main(String args[]){
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
                  System.out.print(" ");
			}	
			for(int j=1;j<=i;j++)
			{
                  System.out.print("1");																						
			}	
			for(int j=0;j<i-1;j++)
			{
                  System.out.print("1");																						
			}	
			System.out.println();
		}
		
	}
}



              /*
                      Output:    
					                        1
                                           111
                                          11111
                                         1111111      
										                        */