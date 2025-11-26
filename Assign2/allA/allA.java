

abstract class A
{
abstract void display();
}

class A1 extends A
{
void display()
{
System.out.println("This is class A1");
}

class A2 extends A
{
void display()
{
System.out.println("This is class A2");
}
}

class allA extends A1 , A2
{
public static void main(String args[])
{
super(A1);
allA obj=new allA();
}
}

This program is incorrect because java doesn't allow multiple inheritance.
It can be performed using interfaces.
*/

interface A
{
void display();
}

interface A1 extends A
{

default void display()
{
System.out.println("This is interface A1");
}

}

interface A2 extends A
{

default void display()
{
System.out.println("This is interface A2");
}

}

class allA implements A1 , A2
{
public void display(){
A1.super.display();
A2.super.display();
}

public static void main(String args[])
{
allA obj=new allA();
obj.display();
}
}
