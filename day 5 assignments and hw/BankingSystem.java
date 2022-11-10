import java.util.*;
class BankingSystem{
String name="Prakhar Srivastava";
String AccountType= "Savings";
int age=27;
static private long accountNo=234543245424L;
private String IFSC_Code="SBIN0045673";
static long balance=75000;
int min_Balance=3000;
static String password="Jf@29$";
long accNo;
String pass;

Scanner sc=new Scanner(System.in);

public void display()
{
   System.out.println(" Account Holder Name : "+name);
   System.out.println("Account Type : "+AccountType);
   System.out.println("Age : "+age);
   System.out.println("Account Number : "+accountNo);
   System.out.println("IFSC code : "+IFSC_Code);
   System.out.println("Available Balance : "+balance);
}

public void deposit()
{
     System.out.println("Enter the amount you want to deposit");
	 long deposit=sc.nextLong();
	 balance=balance+deposit;
	 System.out.println("Transaction Successful...!!!");
	 System.out.println("your available balance is : "+balance);
}

public void withdraw()
{
     System.out.println("Enter the amount you want to withdraw ");
	 Long amount=sc.nextLong();
	 if(balance>amount)
	 {
	     balance=balance-amount;
		 if(balance>min_Balance)
		 {
		 System.out.println("Transaction Successful...!!!");
		 System.out.println("your available balance is : "+balance);
	     }
	 }
	 else
	 {
	     System.out.println("You don't have required balance"+"\tTransaction failed...!!!");
	 }
}

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
System.out.println("-------------Welcome to State Bank of India-------------");
System.out.println("Enter the account number");
long accNo=sc.nextLong();
System.out.println("Enter your password");
String pass=sc.next();
if((accNo == accountNo) && (pass.equals(password)))
{
    System.out.println("Login Successful...!!!");
	
	BankingSystem o1 = new BankingSystem();

System.out.println("Press 1. to display your account details \nPress 2. to deposit money \nPress 3. to withdraw money \nPress 4. to check your balance \nPress 5. to show receipt");
System.out.println("Enter your choice");

int choice=sc.nextInt();

switch(choice) {
  case 1:
  
  o1.display();
  break;
  case 2:
  o1.deposit();
  break;
  case 3:
  o1.withdraw();
  break;
  case 4:
  System.out.println("Your available balance is : "+balance);
  break;
  case 5:
  System.out.println("Take your receipt");
  break;
}
}
else
{
     System.out.println("Transaction Failed...!!!");
}

}
}