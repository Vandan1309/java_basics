import java.util.Scanner;

class employee{

String name;
int age;
double salary;
static int empno=0;

employee(String na, int ag, double sa){
this.name=na;
this.age=ag;
this.salary=sa;
empno++;
}


void display(){

System.out.println("Name: "+ name);
System.out.println("Age: "+ age);
System.out.println("Salary: "+ salary);
System.out.println("Employee id no.: "+ empno); 
}


public static void main(String args[]){

employee[] p=new employee[10];

for(int i=0;i<10;i++)
{

System.out.println("Enter the name");
Scanner sc1=new Scanner(System.in);
String n=sc1.nextLine();
System.out.println("Enter the age");
Scanner sc2=new Scanner(System.in);
int a=sc2.nextInt();
System.out.println("Enter the salary");
Scanner sc3=new Scanner(System.in);
double s=sc3.nextDouble();
p[i]=new employee(n,a,s);
p[i].display();
}

}


}



