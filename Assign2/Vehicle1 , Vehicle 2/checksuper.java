class vehicle{
int noofwheels;
}


class twowheeler extends vehicle
{
int noofwheels=2;

void show(){
System.out.println(noofwheels+ " Wheels");
           }
}

class fourwheeler extends vehicle
{
int noofwheels=4;

void show(){
System.out.println(noofwheels+ " Wheels");
           }
}


class activa extends twowheeler{
    
void display(){
System.out.println("This is an activa");
super.show();
              }
}

class splendor extends twowheeler{
void display(){
System.out.println("This is a splendor");
super.show();
              }
}

class alto extends fourwheeler{
void display(){
System.out.println("This is an alto");
super.show();              }
}

class swift extends fourwheeler{
void display(){
System.out.println("This is a swift");
super.show();
              }
}


class checksuper{

public static void main(String args[]){

activa ac=new activa();
ac.display();

splendor sp=new splendor();
sp.display();

alto al=new alto();
al.display();

swift sw=new swift();
sw.display();

                           }

                  }




