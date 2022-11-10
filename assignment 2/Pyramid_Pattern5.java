class Pyramid_Pattern5{
public static void main(String args[]){
	int c=0;
for(int i=9;i>=1;i--)
{
	c=i;
for(int j=1;j<i;j++)
{
System.out.print("  ");
}
for(int j=9;j>=i;j--)
{

System.out.print(c+" ");
c++;
}
for(int j=8;j>=i;j--)
{
System.out.print(j+" ");
}
System.out.println();
}

}
}


               /*

                     Output:   
                                                9
                                              8 9 8
                                            7 8 9 8 7
                                          6 7 8 9 8 7 6
                                        5 6 7 8 9 8 7 6 5
                                      4 5 6 7 8 9 8 7 6 5 4
                                    3 4 5 6 7 8 9 8 7 6 5 4 3
                                  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
                                1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
							
							                                          */