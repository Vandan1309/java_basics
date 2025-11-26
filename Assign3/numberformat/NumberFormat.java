import java.util.Scanner;
class NumberFormat
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no.: ");
String s1=sc.nextLine();

try
{
int n=Integer.parseInt(s1);
System.out.println("The entered no. is : " + n);
}
catch(NumberFormatException e)
{
System.out.println("Enter valid number");
}
}
}