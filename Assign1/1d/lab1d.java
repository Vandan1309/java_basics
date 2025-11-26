import java.util.Scanner;

class lab1d{
public static void main(String arg[]){

int n1;
n1=Integer.parseInt(arg[0]);
int n2;
n2=Integer.parseInt(arg[2]);
String op=arg[1];

switch(op){
case "+": 
System.out.println("The Sum is: " + (n1+n2));
break;
case "-":
System.out.println("The Difference is: " + (n1-n2));
break;
case "x":
System.out.println("The Product is: " + (n1*n2));
break;
case "/":
System.out.println("The Quotient is: " + (n1/n2));
break;
case "%":
System.out.println("The Remainder is: " + (n1%n2));
break;
default:
System.out.println("Invalid Operation");
break;
}
}
}
