class EvenThread extends Thread
{
int sum=0;
int ub,lb;
 EvenThread (int lb, int ub)
{
this.lb=lb;
this.ub=ub;
}
public void run()
{
for(int i=lb;i<=ub;i++)
{
sum+=i;
}
}
public static void main(String args[])
{
SumThread s1=new SumThread(1,10);
SumThread s2=new SumThread(11,20);
s1.start();
s2.start();
try
{
Thread.sleep(2000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
System.out.println("sum of 1 to 10: " + s1.sum);
System.out.println("Sum of 11 to 20 : " + s2.sum);
System.out.println("Total sum: " + (s1.sum+s2.sum));
}
}