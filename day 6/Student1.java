class Student1{

   int id;
   String name;
   int marks;
   
   //Default constructor
   Student1()
   {
       id=111;
       name="Tushar";
	   marks=89;
   }
   
   //parametrised constructor
   
   Student1(int id, String name, int marks)
   {
      this.id=id;
      this.name=name;
	  this.marks=marks;
   }
   
   Student1(int id, String name)
   {
      this.id=id;
      this.name=name;
   }
   
   void display()
   {
      System.out.println("Id = "+id);
	  System.out.println("Name = "+name);
	  System.out.println("Marks = "+marks);
   }
	  
	  public static void main(String args[]){
	  
	  Student1 s1=new Student1();
	  Student1 s2=new Student1(412,"Yogesh",86); 
	  //Student s3=new Student(786,"Naveen");          //it will give error as only 2 parameter is written
	  Student1 s3=new Student1(786,"Naveen");
	  System.out.println("Student Details");
       s1.display();
	   s2.display();
	   s3.display();
   }
   }