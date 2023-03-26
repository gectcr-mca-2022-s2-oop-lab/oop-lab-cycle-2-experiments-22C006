import java.util.*;

class Employee {

 int eNo;

 String eName;

 int eSalary;
 static Scanner sc = new Scanner(System.in);



 public void read() {

  Scanner sc = new Scanner(System.in);

  System.out.print("Enter ID : ");

  eNo = Integer.parseInt(sc.nextLine());

  System.out.print("Enter Name : ");

  eName = sc.nextLine();

  System.out.print("Enter monthly salary : ");

  eSalary = Integer.parseInt(sc.nextLine());

 }

	
 public String toString() {
  return "Name : " + eName + "\nsalary " + eSalary;
 }

 public static void main(String[] args) {
  

  int i;
  System.out.println("Enter the Number of Employees:");
  int n=sc.nextInt();

  int No;

  Employee emp[] = new Employee[n];

  for (i = 0; i < n; i++) {

   emp[i] = new Employee();

   emp[i].read();

  }

  System.out.println("Search");

  while (true) {

   Scanner sc1 = new Scanner(System.in);

   System.out.print("Enter ID : ");

   No = Integer.parseInt(sc1.nextLine());
   int flag=0;

   for (i = 0; i < n; i++) {

    if (emp[i].eNo == No) {

     System.out.println(emp[i]);
     flag=1;

     break;

    }}
   if(flag==0)
   {
    System.out.println("Enter Valid ID!");
   }
     

   

  }

 }

}