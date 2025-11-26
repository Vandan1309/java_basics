class syncthread extends Thread{

 static int i;
int n;

syncthread(int n){
this.n=n;
}

public static synchronized void execute(int n){
for(i=1;i<=10;i++)
{
System.out.println(n+"x"+i+"="+(n*i));
}
}

public void run(){
execute(n);
}

public static void main(String args[])
{
syncthread s1=new syncthread(2);
syncthread s2=new syncthread(3);
syncthread s3=new syncthread(4);
s1.start();
s2.start();
s3.start();
}

}