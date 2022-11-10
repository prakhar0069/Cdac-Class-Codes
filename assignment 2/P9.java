class P9{
public static void main(String args[]){
int alpha=65;
for(int i=0;i<5;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print(" ");
}
for(int j=0;j<=i;j++)
{
System.out.print((char)(alpha+j)+" ");
}
System.out.println();
}

}
}


               /*

                     Output:   
                                A
                               A B
                              A B C
                             A B C D
                            A B C D E
							
							                */