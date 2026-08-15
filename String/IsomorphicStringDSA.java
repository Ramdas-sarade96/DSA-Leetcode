
import java.util.*;
public class IsomorphicStringDSA
{
    public static void main(String args[])
    { 
         String a= "bbbaaaba";
        
         String b="aaabbbba";
         
         int n1=a.length();
         int n2=b.length();
         Map<Character,Character>map=new HashMap<>();
        Map<Character,Character>map2=new HashMap<>();
         if(n1!=n2)
         {
               System.out.println(" not isomorphic");
               return ;
         }

         
         for(int i=0;i<n1;i++)
         {
            char c1=a.charAt(i);
            char c2=b.charAt(i);
            if(map.containsKey(c1))
            {
                if(map.get(c1)!=c2)
                {
                    System.out.println("Not a Isomorphic");
                    return ;
                }
            }
            else
            {
                map.put(c1,c2);
            }

            if(map2.containsKey(c2))
            {
                if(map2.get(c2)!=c1)
                {
                    System.out.println("not a isomorphic");
                    return;
                }
            }
            else
            {
                map2.put(c2,c1);
            }
            }
    }
           

         

   }
