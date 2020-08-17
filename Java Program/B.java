import java.util.*;

class Logic
{
  public static void main(String arg[])
   {
      int a,b;
      float p[][]=new float[3][3];
      Scanner s=new Scanner(System.in);
       for(a=0;a<3;a++)
         {
           for(b=0;b<3;b++)
            {
              p[a][b]=s.nextFloat();
            }
         }
       for(a=0;a<3;a++)
         {
           for(b=0;b<3;b++)
            {
               System.out.print(p[a][b]+"  ");
             }
            System.out.println();
         }
    }
}

