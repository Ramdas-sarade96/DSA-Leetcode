import java.util.*;
public class Leetcode1287 
{
    public static void main(String args[])
    {
        int arr[]=new int[]{ 1,2,2,6,6,6,6,7,10 };
        int n=arr.length;
        int temp = n/4;
        int ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        { 
             if(map.containsKey(arr[i]))
             {
                 map.put(arr[i],map.get(arr[i])+1);
                 if(map.get(arr[i])>temp)
                 {
                    ans=arr[i];
                 }
             }
             else
             {
                map.put(arr[i],1);
             }
        }
        System.out.println(ans);
    }
    
}
