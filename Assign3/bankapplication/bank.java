import java.util.Scanner;
class InvalidPinNumberException extends Exception
{
public InvalidPinNumberException(String s)
{
super(s);
}
}

class NotSufficientFundException extends Exception
{
public NotSufficientFundException(String s1)
{
super(s1);
}
}



public class bank
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

double balance = 0;
int pin = 9876;
balance += 2000;


System.out.println("Current balance: " + balance);

System.out.println("Enter PIN to withdraw 1400:");
int epin = sc.nextInt();


if (epin != pin)
{
try
{
throw new InvalidPinNumberException("Invalid PIN");
}
catch (InvalidPinNumberException e)
{
e.printStackTrace();
}
}


else
{
try
{
if (1400 > balance)
{
throw new NotSufficientFundException("Not enough balance for 1400");
}

balance -= 1400;
System.out.println("Withdrawn 1400. Remaining balance: " + balance);
}
catch (NotSufficientFundException e)
{
e.printStackTrace();
}
}


System.out.println("Enter PIN to withdraw 500:");
epin = sc.nextInt();


if (epin != pin)
{
try
{
throw new InvalidPinNumberException("Invalid PIN");
}
catch (InvalidPinNumberException e)
{
e.printStackTrace();
}
}


else
{
try
{
if (500 > balance)
{
throw new NotSufficientFundException("Not enough balance for 500");
}
balance -= 500;
System.out.println("Withdrawn 500. Remaining balance: " + balance);
}
catch (NotSufficientFundException e)
{
e.printStackTrace();
}
}


System.out.println("Enter PIN to withdraw 300:");
epin = sc.nextInt();


if (epin != pin)
{
try
{
throw new InvalidPinNumberException("Invalid PIN");
}
catch (InvalidPinNumberException e)
{
e.printStackTrace();
}
}


else
{
try
{
if (300 > balance)
{
throw new NotSufficientFundException("Not enough balance for 300");
}
balance -= 300;
System.out.println("Withdrawn 300. Remaining balance: " + balance);
}
catch (NotSufficientFundException e)
{
e.printStackTrace();
}
}


}
}