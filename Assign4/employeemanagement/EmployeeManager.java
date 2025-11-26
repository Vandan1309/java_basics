import java.io.*;
import java.util.Scanner;

 class Employee implements Serializable{

  String name;
  int id;
  String dept;
  double salary;

  Employee(String n, int id, String d, double sal )
      {
      this.name=n;
      this.id=id;
      this.dept=d;
      this.salary=sal;
      }

void infodisplay()
{
System.out.println("Name: " + name + "\n" + "Employee id: " + id + "\n" + "Department: " + dept + "\n" + "Salary" + salary );
}

}



class EmployeeManager{

Scanner sc = new Scanner(System.in);
File file=new File("empdata.txt");

public static void main(String args[] ){


EmployeeManager manager= new EmployeeManager();
manager.run();



}

void run(){
int choice;
do{

System.out.println("Employee data manipulation manager. " );
System.out.println(" Press 1 for adding an employee. ");
System.out.println(" Press 2 for viewing the employee information file. ");
System.out.println(" Press 3 for exit. ");
System.out.println(" Enter your choice: ");
choice = sc.nextInt();
sc.nextLine();

switch(choice){

case 1: addemployee();
        break;

case 2: viewfile();
        break;

case 3: System.out.println("Exiting...");
        break;

default: System.out.println("Invalid input");
         break;
}

}
while(choice!=3);
}



void addemployee()
{

try{
System.out.println("Enter name: ");
String name=sc.nextLine();

System.out.println("Enter id: ");
int id = sc.nextInt();
sc.nextLine();

System.out.println("Enter Department: ");
String dept=sc.nextLine();

System.out.println("Enter salary: ");

double salary = sc.nextDouble();
sc.nextLine();

Employee ex = new Employee(name, id, dept, salary);
FileOutputStream fout= new FileOutputStream(file,true);
ObjectOutputStream oout= new ObjectOutputStream(fout);
oout.writeObject(ex);
            oout.close();
            fout.close();
            System.out.println("Employee info added succesfully.");
}
catch( Exception e)
     {
      e.printStackTrace();
     }

}

void viewfile()
{
try {
FileInputStream fin = new FileInputStream(file);
ObjectInputStream oin = new ObjectInputStream(fin);
Employee e1 = (Employee) oin.readObject();
e1.infodisplay();
oin.close();
fin.close();
} catch (Exception e) 
{
e.printStackTrace();
}
}





}










