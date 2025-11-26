class vehicle{

String vehicle_type;
vehicle(String s)
{
this.vehicle_type=s;
}
void display()
{
System.out.println("This vehicle is a: " + vehicle_type);
}
             }



class car extends vehicle
{
String model_type;
String car_name;
String company;
int policyno;

car(String vehicle_type,String s1, String s2, String s3, int i)
{
super(vehicle_type);
this.model_type=s1;
this.car_name=s2;
this.company=s3;
this.policyno=i;
}

void display(){
super.display();
System.out.println("This is a: " + model_type);
System.out.println("This model is named as: " + car_name);
System.out.println("This company is : " + company);
System.out.println("This policy no. is : " + vehicle_type);
}

}

class vehiclecheck{

public static void main(String args[])
{
car c=new car("four-wheeler","sedan","swift","Maruti",123);
c.display();
}

        }




