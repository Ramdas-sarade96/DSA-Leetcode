import java.lang.*;
import java.util.*;

public class Power 
{
    public static void main(String args[])
    {
       double a=2.1;
       double m=3;
       double result=1;
      // double k=Math.pow(a,m);
       //System.out.println(k);

       for(int i=0;i<m;i++)
       {
           result=result*a;
       }

       System.out.println(result);

    }
    
}
