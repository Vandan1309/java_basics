class fibofact{
static int fact=1;
static int count=1;

int factorial(int n){
if(n>0){
System.out.print(" "+n);
fact=fact*n;
return factorial(n-1);
}
else
{
return fact;
}
}



int fibonacci(int m){
if(m<1){
    return m;}
    else{
        return fibonacci(m-1)+fibonacci(m-2);
    }
}
}


public static void main(String args[])
{
fibofact sc=new fibofact();
sc.factorial(5);

System.out.println("Factoial of 5 is: "+ fact);
/*
fibofact sc2=new fibofact();
sc2.fibonacci(5);
*/
}

}