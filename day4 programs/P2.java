class P2{
	public static void main(String args[]){
		int c=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				c=c+j;
                  System.out.print(j+" ");
			}	
			System.out.println(" "+c);
			c=0;                                                        //by doing this we are reinitializing c value to 0 hence while entering the inner for loop it will calculate from the next j value not the previous ones
		}
		
	}
}




                  /*

                    Output:  
					           1 1
							   1 2 3
							   1 2 3 6
							   1 2 3 4 10
							   1 2 3 4 5 15
							   
							   
							   
							   
							   */