import java.util.*;
public class ThirdMaximumArray 
{

    public static void main(String args[])
    {
       
        int arr[]=new int[]{ 2,5,2,6,7,3,4,77,73};
        int n=arr.length;
        Arrays.sort(arr);
       Set<Integer>set=new HashSet();
       for(int i=0;i<n;i++)
       {
          set.add(arr[i]);
       }
       Integer result[]=set.toArray(new Integer[0]);
       int n2=result.length;
       Arrays.sort(result);
       System.out.println(result[n2-3]);
       
      
        
    }
}


