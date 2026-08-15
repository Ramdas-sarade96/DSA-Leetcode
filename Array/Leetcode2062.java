import java.util.HashSet;

public class Leetcode2062 
{
    public static void main(String args[])
    {
        String word=" aeiouu";
        int n=word.length();

        int result=0;
        for(int i=0;i<n;i++)
        {
             HashSet<Character>set=new HashSet<>();
            
            for(int j=i;j<n;j++)
            {
                char ch=word.charAt(j);
               if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
               {
                break;
               }
               set.add(ch);
                

                if(set.size()==5)
                {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
    
}
