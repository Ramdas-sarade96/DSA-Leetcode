
import java.util.*;
public class Leetcode697 
{
    public static void  main(String args[])
    {
        int arr[]=new int[]{ 1,2,2,3,1,4,2};
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
            max=Math.max(max,map.get(arr[i]));
        }
        System.out.println(max);
        int result=0;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(map.get(arr[j])==0)
                {
                    if((j-i)==max)
                    {
                          result=j-i;
                          System.out.println(result);
                          return ;
                    }
                }
                //map.put(arr[j],map.get(arr[j])-1);
            }
        }
        System.out.println(result);

    } 
    
}
