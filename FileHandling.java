import java.io.*;
public class FileHandling {
public static void main(String args[])
{
	
try{ 
	File f = new File("C:/Users/Yash/Desktop/GIT/abc.txt");
	f.createNewFile();
	
    Writer w = new FileWriter("abc.txt");  
    String str = "Hello";  
    w.write(str);  
    w.close();
	
  FileInputStream fin=new FileInputStream("abc.txt");
  FileOutputStream fout=new FileOutputStream("xyz.txt");
  byte b[]=new byte[10];
  int n=fin.read(b);
  System.out.println(n);
  while(n!=-1)
  {
      fout.write(b,0,n); 
      n=fin.read(b);
      }
  System.out.println("Action Completed!");
  fin.close();
  fout.close();
  
  Reader r = new FileReader("xyz.txt");  
  int data = r.read(); 
  
  while (data != -1) {  
      System.out.print((char) data);  
      data = r.read();
   }
  r.close();
}
catch(Exception e)
{
	System.out.println(e);
}
}
} 
