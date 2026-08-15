
import java.util.*;
public class IsomorphicString
{
    public static void main(String args[])
    { 
         String a= "bbbaaaba";
         char c[]=a.toCharArray();
         String b="aaabbbba";
         char d[]=b.toCharArray();
         int n1=a.length();
         int n2=b.length();
         Map<Character,Integer>map=new HashMap<>();
        Map<Character,Integer>map2=new HashMap<>();
         if(n1!=n2)
         {
               System.out.println(" not isomorphic");
               return ;
         }

         
         for(int i=0;i<n1;i++)
         {
            if(!map.containsKey(c[i]))
            {
                map.put(c[i],1);
            }
            else
            {
                map.put(c[i],map.get(c[i])+1);
            }
         }
              System.out.println(map);

         for(int i=0;i<n2;i++)
         {
            if(!map2.containsKey(d[i]))
            {
                map2.put(d[i],1);
            }
            else
            {
                map2.put(d[i],map2.get(d[i])+1);
            }
         }

          System.out.println(map2);

         for(int i=0;i<n1;i++)
         {
            int  m, k;
            m=map.get(c[i]);
            k=map2.get(d[i]);
            if(m!=k)
            {
                System.out.println(" not a isomorphic");
                return ;
            }
         }

         System.out.println(" isomorphic");


    }
}