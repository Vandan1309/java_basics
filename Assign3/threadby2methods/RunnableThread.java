class RunnableThread implements Runnable
{
String s;
RunnableThread (String s)
{
this.s=s;
}
public void run()
{
System.out.println(s);
}
public static void main(String args[])
{
RunnableThread r=new RunnableThread("Hello World");
Thread t=new Thread(r);
t.start();
}
}
