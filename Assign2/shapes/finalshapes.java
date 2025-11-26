interface shape2D
{
  default double circlearea(double r)
{
double carea=3.14*r*r;
 return carea;
}
}

interface shape3D
{
 default double spherevolume(double ra)
{
double svolume=(4*3.14*ra*ra*ra)/3;
return svolume;
}
}

abstract class shape implements shape2D , shape3D
{
abstract void display(double rad);
}

class finalshapes extends shape
{

 void display(double radius)
{
System.out.println("Area of the circle is: " + circlearea(radius));
System.out.println("Volume of the sphere is: " + spherevolume(radius));
}

public static void main(String args[] )
{
 finalshapes s=new finalshapes();
 s.display(10);
}

}