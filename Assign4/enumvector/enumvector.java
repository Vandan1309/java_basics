import java.util.*;

public class EnumVector
{

public static void main(String args[])
{

Vector<String> v1 = new Vector<>();
v1.add("Cricket");
v1.add("Football");
v1.add("Basketball");

Enumeration<String> e = v1.elements();

while(e.hasMoreElements())
{
System.out.println(e.nextElement());
}

Vector<String> v2=new Vector<>();
v2.add("apple");
v2.add("kiwi");
System.out.println(v2);

}

}
