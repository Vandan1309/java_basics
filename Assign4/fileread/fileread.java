import java.io.*;

class fileread{
public static void main(String args[])
{
try{
FileInputStream fin=new FileInputStream("demofile.txt");
int i;
while((i=fin.read())!=-1)
    {
System.out.print((char)i);
    }
  }
catch(Exception e)
  {
e.printStackTrace();
  }
}

}