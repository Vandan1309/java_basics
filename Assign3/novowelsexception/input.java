import java.util.Scanner;
class NoVowelException extends Exception
{
NoVowelException(String s)
{
super(s);
}
}
class input
{
void check(String str) throws NoVowelException
{
str=str.toLowerCase();
if (!(str.contains("a") || str.contains("e") ||   str.contains("i") ||  str.contains("o") ||  str.contains("u")))
{
throw new NoVowelException("No Vowel Found");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string: ");
String str=sc.nextLine();
input i1=new input();
try
{
i1.check(str);
System.out.println("String contains Vowel");
}
catch(NoVowelException e)
{
System.out.println(" No Vowels Exception ");
}
}
}