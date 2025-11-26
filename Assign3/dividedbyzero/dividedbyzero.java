class dividedbyzero{

public static void main(String args[])
{

int a=10;
int b=0;
int c;
try
{
c=a/b;
}
catch(ArithmeticException e)
{
System.out.println("Divided by zero error caught");
}


}
}