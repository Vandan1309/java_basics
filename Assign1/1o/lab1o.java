class lab1o{
public static void main(String args[]){
int[] arr={1,2,3,4,5};
int i;
int sum=0;
int n= arr.length;
int max=arr[0];
int min=arr[0];
for(i=0;i<n;i++)
{

if(arr[i]>max)
{
max=arr[i];
}
if(arr[i]<min)
{
min=arr[i];
}
sum=sum+arr[i];
}
System.out.println("sum is: " + sum);
System.out.println("mean is: " +(sum/n));
System.out.println("max is: " + max);
System.out.println("min is: " + min);
}
}
