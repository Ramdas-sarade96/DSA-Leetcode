import java.util.*;
public class Count 
{
    public static void main(String args[])
    {
        String str="abcdefabcdabcefA";
        int n=str.length();
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
        
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else 
            {
                map.put(ch,map.get(ch)+1);
            }
        }
           ArrayList<Integer>arr=new ArrayList<>(map.values());
           Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);
    
    }

    
}
