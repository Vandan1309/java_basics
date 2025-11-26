class number{
int no;
 number(int n){
 this.no=n;
}
 void add(int a,int b)
{
System.out.println("The addition of two objects values : " + (a+b));
}

public static void main(String args[]){

number o1= new number(3);
number o2=new number(5);
o2.add(o1.no,o2.no);
}

}