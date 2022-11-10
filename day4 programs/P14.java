 /*      now for printing right to left in decreasing order i.e.  ***** we have to check left spaces which is in triangularz form i.e. ***** so we have to run 3 for loops for it in which 2nd for loop is for spaces or . here
                                                                   ****                                                                .****
                                                                    ***                                                                ..***
                                                                     **                                                                ...**
                                                                      *                                                                ....*
                                       

									   */
 
 
 class P14{
	public static void main(String args[]){
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
                    Output:  
					
					           *****
                                ****
                                 ***
                                  **
                                   *

							   
							   */