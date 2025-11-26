class lab1n{
public static void main(String args[]){
String string1="Naman";
int i,j;
int cap=0;
String str1=string1.toLowerCase();
int l=str1.length();
System.out.println(l);

for(i=0;i<l/2;i++)
{
if(str1.charAt(i)==str1.charAt(l-1-i))
    {
cap++;
    }
}
if(cap==0)
{
System.out.println("Not Palindrome");
}
else
{
System.out.println("Palindrome");
}

}
}