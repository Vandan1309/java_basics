import java.util.Scanner;
class lab1p{
public static void main(String args[]){
int[] arr={1,2,3,4,5};
int i;
Scanner n=new Scanner(System.in);
int a=n.nextInt();
int l=arr.length;
for(i=0;i<l;i++)
{

if(arr[i]==a)
{
System.out.println("Number" + arr[i] + " found at " + i + " index. ");
}
}
}
}
