class P2{
public static void main(String args[]){
int alpha=65;                                       // yaha pe agar alpha print karana h to int lagana pdega agar char lenge to for me nahi jaega
for(int i=0;i<5;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print((char)(alpha+j)+" ");               // typecast karne ke liye (char) ko bracket ke andar lena hai ni to error aaega
}
System.out.println();
}

}
}


               /*

                     Output:                                                       //hame character print karana hai to typecast karna pdega
                                A
                                A B
                                A B C
                                A B C D
                                A B C D E
							
							                */