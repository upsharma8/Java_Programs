class IndexMapping
{
  final static int MAX=1000;
  static boolean  hashhas[][]= new boolean[MAX+1][2] ;

static boolean search(int X)
{
  if(X>=0)
   {
      if(hashhas[X][0]==true)
       {
          return true;
       }
      else{
          return false;
        }
   }
  else
     {
       if(hashhas[Math.abs(X)][1]==true)
        {
            return true;
        }
       else
        {
            return false;
        }
    }
}

static void insert(int a[],int n)
   {
     for(int i=0;i<n;i++)
      {
        if(a[i]>=0)
         {
           hashhas[a[i]][0]=true;
         }
        else{
               hashhas[Math.abs(a[i])][1]=true;
            }
      }
   }


public static void main(String[] args)
  {
    int a[]={-4,55,-44,66,78,81,99,-55};
    int n=a.length;
    insert(a,n);
    int X=381;
    if(search(X)==true)
    {
      System.out.println("Present");
    }
    else
    {
      System.out.println("Not present");
    }
  }
}
