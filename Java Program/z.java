import java.util.*;
class Z 
{
  float a,b,c,d,e;
  float sum,div;
  void accepted()
   {
     Scanner s = new Scanner(System.in);

      try
      {
         a=s.nextFloat();
         b=s.nextFloat();
         c=s.nextFloat();
         d=s.nextFloat();
         e=s.nextFloat();
         throw new ArithmeticException();
      }
     catch(ArithmeticException p)
       {
         System.out.println("Invalid data"+p);
       }
   }  
      void summ()
       {
          sum=a+b+c+d+e;
       }
      void divide()
       {
         div=sum/4.0f;
       }  

       void showing()
   {
   System.out.println(div);
   }
  
} 

class Display
{
  public static void main(String a[])
   {
     Z x= new Z();
     x.accepted();
     x.summ();
     x.divide();
     x.showing();
   }

}         