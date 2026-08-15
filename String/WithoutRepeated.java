import java.util.HashMap;

public class WithoutRepeated
{
    public static void main(String args[])
    {
        String str="abcabcabb";
        int n=str.length();
        HashMap<Character,Integer>map=new HashMap<>();
        int k=0;
        for(int i=0;i<n;i++)
        {
            char ch = str.charAt(i);

            if(!map.containsKey(ch))
            {
                k++;
                map.put(ch,1);
            }
            else
            {
                break;
            }
        }

        System.out.println(k);
    }
}