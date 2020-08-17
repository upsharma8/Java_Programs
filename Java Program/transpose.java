import java.util.*;
class abc
{
   public static void main(String arg[])
    {
        int b,c;
        int arr[][]= new int[3][3];
        Scanner s = new Scanner(System.in);
	System.out.println("Enter the values of matrix:");
	for(b=0;b<3;b++)
 	 {
           for(c=0;c<3;c++)
            {
               arr[b][c]=s.nextInt();
            }
         }
        System.out.println("Transpose of matrix:");
        for(b=0;b<3;b++)
         {
           for(c=0;c<3;c++)
            {
               System.out.print(arr[c][b]+" " );
            }
            System.out.println();
         }
       } 
}  
	   