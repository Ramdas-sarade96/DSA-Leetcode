import java.util.*;
public class SortCharacterByFrequency 
{
    public static void main(String args[])
    {
        String s="tree";
        char ch[]=s.toCharArray();
       
         HashMap<Character,Integer>hash=new HashMap<>();
         int n=s.length();
          int arr[]=new int[n];

         for(int i=0;i<n;i++)
         {
            if(!hash.containsKey(ch[i]))
            {
                hash.put(ch[i],1);
            }
            else
            {
                hash.put(ch[i],hash.get(ch[i])+1);
            }
         }
         System.out.println(hash);

         for(int i=0;i<n;i++)
         {
            arr[i]=hash.get(ch[i]);
            System.out.println(arr[i]);
         }

         Arrays.sort(arr);
          for(int i=0;i<n;i++)
         {
           
            System.out.println(arr[i]);
         }
        


    }
    
}
