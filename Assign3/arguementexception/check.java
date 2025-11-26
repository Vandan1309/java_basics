class ArgumentException extends Exception
{
ArgumentException(String s) 
{
super(s);
}
}

class check 
{
void count(String args[]) throws ArgumentException 
{
if (args.length > 1) 
{
throw new ArgumentException("More than one argument");
} 
else 
{
System.out.println("Argument read successfully");
}
}

public static void main(String args[]) 
{
check c1 = new check();
try 
{
c1.count(args);
} 
catch (ArgumentException e) 
{
System.out.println("Argument Exception");
}
}
}
