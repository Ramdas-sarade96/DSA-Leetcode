import java.util.*;
public class Leetcode961 
{
    public static void main(String args[])
    {
        int arr[]=new int[]{5,1,5,2,5,3,5,4};
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=0;
        for(int i=0;i<n;i++)
        {
           if(map.containsKey(arr[i]))
           {
              map.put(arr[i],map.get(arr[i])+1);
           }
           else
           {
            map.put(arr[i],1);
           }
          // max=Math.max(max,map.get(arr[i]));
        }
    int ans=0;
        for(int i=0;i<n;i++)
        {
            if(map.get(arr[i])>max)
            {
                ans=arr[i];
            }
            max=Math.max(max,map.get(arr[i]));
        }

        System.out.println(ans);
    }
    
}
