import java.util.*;

public class ArrayLinked
{
public static void main(String args[])
{

List<String> list = new ArrayList<>();
list.add("Python");
list.add("Java");
list.add("C++");
System.out.println("Programming languages: ");
for (String l : list)
{
System.out.println(l);
}


LinkedList<String> llist = new LinkedList<>();
llist.add("SOT");
llist.add("SOS");
llist.add("SOM");
System.out.println(llist);
}
}
