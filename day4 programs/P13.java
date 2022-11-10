/*     we have to print right to left i.e. *   for this we have to note that right side of triangle is having few spaces left i.e. ....* these spaces are shown by . and the spaces is decreasing first by 4 then by 3 then by 2 then by 1 and then by 0.
                                          **                                                                                       ...**
                                         ***                                                                                       ..***
									    ****                                                                                       .****
									   *****                                                                                       *****
                so we have to give 3 for loops structures for it.
              */



class P13{
	public static void main(String args[]){
		for(int i=1;i<=5;i++)    //rows
		{
			for(int j=4;j>=i;j--)   //columns                 // this for loop will work for . spaces
			{
                  //System.out.print("$");                      // this $ sign will replace dots shown above
			        System.out.print(" ");                      // now we will put space in the places of dollar
			}	
		for(int j=1;j<=i;j++)    //columns                                      
			{
                  System.out.print("*");
			}	
			System.out.println();
		}
		
	}
}





               /*
                    Output:  
					
					               *
                                  **
                                 ***
                                ****
                               *****

							   
							   */