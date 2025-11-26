class lab1m{
public static void main(String args[]){
int i;
int j;
int cap=0;
String string="Hello there How are You Doing";
String[] list=string.split(" ");
for(i=0;i<list.length;i++)
{
 
if(Character.isUpperCase(list[i].charAt(0)))
{
cap++;

}
}
System.out.println("the no. of words with first letter capital is: ");
System.out.println(cap);
}
}

