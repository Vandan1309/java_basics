
import java.util.Scanner;

class lab1c{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount in Rupees:");
float rs=sc.nextFloat();

float dollar=rs/80;
System.out.println("The Rupees entered: "+ rs +" is equivalent to " + dollar +" dollars");
}
}
