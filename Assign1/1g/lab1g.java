
import java.util.Scanner;

class lab1g{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the No. of the day:");
int no=sc.nextInt();

if(no==0){
System.out.println("Sunday");
}
else if(no==1){
System.out.println("Monday");
}
else if(no==2){
System.out.println("Tuesday");
}
else if(no==3){
System.out.println("Wednesday");
}
else if(no==4){
System.out.println("Thursday");
}
else if(no==5){
System.out.println("Friday");
}
else if(no==6){
System.out.println("Saturday");
}
}
}