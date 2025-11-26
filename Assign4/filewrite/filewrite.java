import java.io.*;

class filewrite{
public static void main(String args[])
{
try{
FileInputStream fin1=new FileInputStream("demofile.txt");
FileOutputStream fout=new FileOutputStream("demofileoutput.txt");
FileInputStream fin2=new FileInputStream("demofileoutput.txt");
int i;

while((i=fin1.read())!=-1)
    {
fout.write(i);
    }

while((j=fin2.read())!=-1)
    {
System.out.print((char(j));
    }




fout.close();
  }
catch(Exception e)
  {
e.printStackTrace();
  }
}

}