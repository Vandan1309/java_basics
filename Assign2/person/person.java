import java.util.Scanner;

class person{

String name;
int age;
double salary;

person(){

System.out.println("Enter the name");
Scanner sc1=new Scanner(System.in);
name=sc1.nextLine();
System.out.println("Enter the age");
Scanner sc2=new Scanner(System.in);
age=sc2.nextInt();
System.out.println("Enter the name");
Scanner sc3=new Scanner(System.in);
salary=sc3.nextDouble();
}


void display(){

System.out.println("Name: "+ name);
System.out.println("Age: "+ age);
System.out.println("Salary: "+ salary);
}


public static void main(String args[]){

person p=new person();
p.display();

}


}



