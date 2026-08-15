import java.util.*;
public class MostFrequent 
{
    public static void main(String args[])
    {
        int a[]=new int[]{ 1,1,1,2,2,3};
        int k=2;
        int n=a.length;
        int b[]=new int[k];
       Map<Integer,Integer>map=new HashMap<>();
       

       for(int i=0;i<n;i++)
       {
        int m=a[i];
          if(!map.containsKey(m))
          {
            map.put(a[i],1);
          }
          else
          {
                map.put(a[i],map.get(m)+1);
          }
       }
       System.out.println(map);

       for(int j=0;j<k;j++)
       {
        int maxFre=0;
        int maxElement=0;
          Integer[]keys=map.keySet().toArray(new Integer[0]);

          for(int i=0;i<keys.length;i++)
          {
                 if(map.get(keys[i])>maxFre)
                 {
                    maxFre=map.get(keys[i]);
                    maxElement=keys[i];
                 }
          }
          b[j]=maxElement;
          map.remove(maxElement);
       }

       for(int i=0;i<b.length;i++)
       {
          System.out.println(b[i]);
       }
       

    }
    
}
