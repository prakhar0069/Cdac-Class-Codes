class Test4{

  static int x = 20;
  
  void display()
  {
       System.out.println("Instance Method");
	   //show();
  }
  
  static void show()
  {
       System.out.println("Static Method");
	   //System.out.println(y);
  }
  
  public static void main(String args[]){
  Test4 t1 = new Test4();
  t1.display();
  Test4 t2 = null;
  show();
  int a = t2.x;
  System.out.println(x);
  
}
}