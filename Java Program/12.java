import java.util.*;
class abc 
{
  public static void main(String arg[])
  { 
    StringBuffer s= new StringBuffer("Hello World");
    StringBuffer s1=new StringBuffer();
    System.out.println(s.length());
    System.out.println(s.append("world"));
    System.out.println(s.capacity());
    System.out.println(s1.length());
    System.out.println(s1.append("world"));
    System.out.println(s1.capacity());
  
  
  }
}