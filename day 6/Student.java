class Student{

   int id;
   String name;
   int marks;
   
   //Default constructor
   Student()
   {
       id=111;
       name="Tushar";
	   marks=89;
   }
   
   //parametrised constructor
   
   Student(int id1, String name1, int marks1)
   {
      id=id1;
      name=name1;
	  marks=marks1;
   }
   
   void info()
   {
       id=253;
	   name="Gaurav";
	   marks=47;
   }
   
   void getdata(int id1, String name1, int marks1)
   {
      id=id1;
      name=name1;
	  marks=marks1;
   }
   
   void display()
   {
      System.out.println("Id = "+id);
	  System.out.println("Name = "+name);
	  System.out.println("Marks = "+marks);
   }
	  
	  public static void main(String args[]){
	  
	  Student s1=new Student();                         //class ke naam se object bnaenge constructor aur method dono ke liye
	  Student s2=new Student(412,"Yogesh",86); 
	  Student s3=new Student(786,"Naveen",73); 
	  Student s4=new Student();
	  Student s5=new Student();
	  System.out.println("Student Details");
	 
	 s4.info();
	 s5.getdata(329,"Pankaj",837);
       s1.display();
	   s2.display();
	   s3.display();
	   s4.display();
	   s5.display();
   }
   }