class onetotwenty extends Thread{

int i;
int lb,ub;
int sum=0;

onetotwenty(int lb, int ub){
this.lb=lb;
this.ub=ub;
}

public void run(){
for(i=lb;i<=ub;i++)
{
sum+=i;
}
}

public static void main(String args[])
{
try{
onetotwenty t1=new onetotwenty(1,10);
onetotwenty t2=new onetotwenty(11,20);
t1.start();
t1.sleep(1000);
t2.start();
t2.sleep(1000);
int totalsum=t1.sum+t2.sum;
System.out.println("Sum from 1 to 20 is : " + totalsum);
}
catch( InterruptedException e)
{
System.out.println("Interruption used");
}

}

}