class MyThread extends Thread
{
String s;
MyThread (String s)
{
this.s=s;
}
public void run()
{
System.out.println(s);
}
public static void main(String args[])
{
MyThread t1=new MyThread("Hello World");
t1.start();
}
}
