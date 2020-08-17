import java.util.*;
class abc 
{
  public static void main(String arg[])
  { 
    StringBuffer s= new StringBuffer("Hello this is my World");
    System.out.println(s.delete(0,9));
    System.out.println(s.replace(0,9,"Ram")); 
    System.out.println(s.reverse());	
  }

}