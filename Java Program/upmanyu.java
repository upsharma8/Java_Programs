import java.util.*;

class Logic
{
  int a,b;
  float c;
 void accept()
  {
    Scanner s1 = new Scanner(System.in);
    try
     {
      a=s1.nextInt();
      b=s1.nextInt();
     } 
    catch(Exception a1) 
     {
       System.out.println("Data Mismatc"+a1);
     }
    finally
     {
       System.out.println("Always Executed");      
     }
}
 void sum()
 {
   c=a+b;
   System.out.println(c);  
  }
 void div()
  {
   try 
   {
      c=a/b;
   System.out.println(c);
   }
  catch(Exception p)
  {
   System.out.println("Divide by 0 is invalid"+p);
  }
 }
}
class Disp
{
  public static void main(String xyz[])
  {
  Logic l= new Logic();
   l.accept();
   l.sum();
   l.div();
  }
}
