class P8{
public static void main(String args[]){
	int c;
for(int i=5;i>=1;i--)
{
	c=i;
for(int j=1;j<i;j++)
{
System.out.print(" ");
}
for(int j=5;j>=i;j--)
{
System.out.print(c+" ");
c++;
}
System.out.println();
}

}
}


               /*

                     Output:   
                                5
                               4 5
                              3 4 5
                             2 3 4 5
                            1 2 3 4 5
							
							                */