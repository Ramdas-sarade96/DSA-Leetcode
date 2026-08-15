import java.util.*;
public class RemoveDuplicareLetter 
{
    public static void main(String args[])
    {
        String s="bcabc";
        int n=s.length();
        Set<Character>set=new LinkedHashSet<>();
        for(int i=0;i<n;i++)
        {
             char ch=s.charAt(i);
             set.add(ch);
        }
        ArrayList<Character>list=new ArrayList<>(set);
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<list.size();i++)
        {
              ans.append(list.get(i));    
        }

        System.out.println(ans);
    }
    
}
