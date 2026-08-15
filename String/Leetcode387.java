import java.util.HashMap;

public class Leetcode387 
{
    public static void main(String args[])
    {
        String s="loveleetcode";
        char arr[]=s.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        int  n=s.length();
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
        }

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]) && map.get(arr[i])==1)
            {
                System.out.println(i);
                return;
            }
        }
    }
    
}
