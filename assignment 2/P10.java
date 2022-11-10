class P10{
public static void main(String args[]){
	int c;
	int alpha=65;
for(int i=5;i>=1;i--)
{
	c=i-1;
for(int j=1;j<i;j++)
{
System.out.print(" ");
}
for(int j=5;j>=i;j--)
{
System.out.print((char)(alpha+c)+" ");
c++;
}
System.out.println();
}

}
}


               /*

                     Output:   
                                E
                               D E
                              C D E
                             B C D E
                            A B C D E
							
							                */