import java.util.Scanner;
class DuplicateException extends Exception
{
DuplicateException(String s)
{
super(s);
}
}


class input
{
void check(int[] arr) throws DuplicateException
{
for (int i = 0; i < arr.length; i++)
{
for (int j = i + 1; j < arr.length; j++)
{
if (arr[i] == arr[j])
{
throw new DuplicateException("Duplicate found: " + arr[i]);
}
}
}
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of elements:");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter " + n + " integers one by one:");
for (int i = 0; i < n; i++)
{
System.out.print("Element " + (i + 1) + ": ");
arr[i] = sc.nextInt();
}
input i1 = new input();
try
{
i1.check(arr);
System.out.println("No Duplicates Found");
}
catch (DuplicateException e)
{
System.out.println("Duplicate Exception: ");
}
}
}