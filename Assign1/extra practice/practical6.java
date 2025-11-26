 class practical6 {
     String name;
     int age;
     double salary;

     practical6() {
        name="Ramesh";
        age=35;
        salary=20000;
        }
   void display()
{
  System.out.println(name);
  System.out.println(age);
  System.out.println(salary);
}

public static void main(String args[]){
       practical6 obj=new practical6();
       obj.display();
       
   }
}