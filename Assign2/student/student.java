

class student{

String student_name;
int roll_no;
double tmarks;

student(){

student_name="Rajat";
roll_no=49;
tmarks=49.5;

}

student(String n,int r,double m){

this.student_name=n;
this.roll_no=r;
this.tmarks=m;

}

void display(){

System.out.println("Name: "+ student_name);
System.out.println("Roll no.: "+ roll_no);
System.out.println("Total marks: "+ tmarks);


}


public static void main(String args[]){

student o1=new student();
o1.display();
student o2=new student("Jay",56,99);
o2.display();

}


}



