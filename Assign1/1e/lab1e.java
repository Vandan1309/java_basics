
import java.util.Scanner;

class lab1e{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the Marks of Subject 1:");
int s1=sc.nextInt();

System.out.println("Enter the Marks of Subject 2:");
int s2=sc.nextInt();

System.out.println("Enter the Marks of Subject 3:");
int s3=sc.nextInt();

System.out.println("Enter the Marks of Subject 4:");
int s4=sc.nextInt();

System.out.println("Enter the Marks of Subject 5:");
int s5=sc.nextInt();

System.out.println("Enter the Marks of Subject 6:");
int s6=sc.nextInt();

float percentage=(s1+s2+s3+s4+s5+s6)/6;

System.out.println("The Average Percentage of given marks in 6 subjects is: " + percentage);
}
}
