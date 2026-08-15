import java.util.*;

public class Leetcode313 
{
    public static boolean isSuperUgly(int current,int arr[])
    {
        if(current ==1)
        {
            return true;
        }
         for(int primes:arr)
         {
            while(current%primes==0)
            {
                current = current/primes;
            }
         }
         return current==1;
    }
    public static void main(String args[])
    {
        int arr[] = new int[] { 2,7,13,19};
          int  n = 12;
          int current = 1;
          int count = 0;

          while(true)
          {
             if(isSuperUgly(current ,arr))
             {
                  count++;
                  System.out.println(count+" -> "+current);
                  if(count==n)
                  {
                    System.out.println("Answer:"+" "+current);
                    break;
                  }
             }

             current++;
          }
       
       
    }
    
}
