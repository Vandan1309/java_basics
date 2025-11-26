import java.io.*;
import java.util.Scanner;

 
class Employeedata{

Scanner sc = new Scanner(System.in);
File file=new File("employeedata.txt");

public static void main(String args[] ){


Employeedata manager= new Employeedata();
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

FileOutputStream fout= new FileOutputStream(file,true);
DataOutputStream dout= new DataOutputStream(fout);

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

dout.writeUTF(name);
dout.writeInt(id);
dout.writeUTF(dept);
dout.writeDouble(salary);

dout.close();
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
DataInputStream din = new DataInputStream(fin);

while(din.available() > 0){

String name= din.readUTF();
int id=din.readInt();
String dept=din.readUTF();
double salary=din.readDouble();

System.out.println("Name:"+ name + " ID:" + id + " Dept:" + dept + " Salary:" + salary); 
}

din.close();
fin.close();
} catch (Exception e) 
{
e.printStackTrace();
}
}
}










