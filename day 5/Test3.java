class Test3{

  static int x = 20;
  int y = 30;
  
  void display()
  {
       System.out.println(x);
	   System.out.println(y);
	   show();
  }
  
  static void show()
  {
       System.out.println(x);
	   //System.out.println(y);
  }
  
  public static void main(String args[]){
  Test3 t1 = new Test3();
  t1.display();                       //static variable can be referenced from non static variable
  show();                        //here show is static and x is static but y is non static so non static variable can't be referenced from static variable
  
}
}