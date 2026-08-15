import java.util.*;
public class ContainsDuplicateII 
{
 
    public static void main(String args[])
    {
        int arr[]=new int[]{1,2,3,1,2,3};
        int k=2;
        int n=arr.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],i);
            }
            else
            {
                 
               int s=map.get(arr[i]);
        
               if(Math.abs(i-s)<=k)
               {
                System.out.println("true");
                return;
               }
               map.put(arr[i],i);

            }
        }

        System.out.println("false");
    }
    
}
