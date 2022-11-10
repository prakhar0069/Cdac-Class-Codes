class P1{
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
			System.out.println();
		}
		
	}
}




              /*

                    Output:  
					           1 1
							   1 2 4
							   1 2 3 10
							   1 2 3 4 25
							   1 2 3 4 5 55
							   
							   
							   
							   */