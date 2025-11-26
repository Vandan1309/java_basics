import java.util.Scanner;
class lab1k{
public static void main(String args[]){
int i;
int vowel=0;
int consonant=0;
int others=0;
System.out.println("Enter the string");
Scanner n=new Scanner(System.in);
String s=n.nextLine();
String s1=s.toLowerCase();
System.out.println(s1);
for(i=0;i<s1.length();i++)
{
if((s1.charAt(i)=='a')||(s1.charAt(i)=='e')||(s1.charAt(i)=='i')||(s1.charAt(i)=='u')||(s1.charAt(i)=='o'))
{
vowel++;
}
 
consonant=s1.length()-vowel;

System.out.println(vowel);
System.out.println(consonant);

}
}
}
