class staticimplement{

static int count=1;

staticimplement(){
System.out.println("The value of shared static variable for this object: "+this.count);
count++;
}


public static void main(String args[]){

staticimplement o1=new staticimplement();
staticimplement o2=new staticimplement();
staticimplement o3=new staticimplement();
staticimplement o4=new staticimplement();
}

}
