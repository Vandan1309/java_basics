
import java.util.Scanner;

class lab1f{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the No.:");
float no=sc.nextFloat();

if(no>0){
System.out.println("Positive number");
}
else if(no==0){
System.out.println("Zero");
}
else {
System.out.println("Negative number");
}
}
}