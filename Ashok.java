import java.io.*;
public class Ashok{



    public static void main(String[] args)   
    {
       try{

     FileInputStream fis=new FileInputStream("demo.java");
     int n=fis.available();     
     byte[] b=new byte[n];
     fis.read(b);
     String s=new String(b);
     System.out.println(s);

    }catch(Exception e)
    {

       System.err.println(e);
    }

    }

}
