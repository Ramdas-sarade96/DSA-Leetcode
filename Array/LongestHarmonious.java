import java.util.*;
public class LongestHarmonious
{
    public static void main(String args[])
    {
        int arr[]=new int[]{1,3,2,2,5,2,3,7};
        int n=arr.length;
        Map<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<n;i++)
       {
         if(!map.containsKey(arr[i]))
         {
            map.put(arr[i],1);
         }
         else
         {
            map.put(arr[i],map.get(arr[i])+1);
         }
       }
           int temp,sum=0;
       for(int  key:map.keySet())
       {
            if(map.containsKey(key+1))
            {
                
                 temp=map.get(key)+map.get(key+1);
                if(temp>sum)
                {
                   sum=temp;
                }
            }
       }

       System.out.println(sum);
    }
}