import java.util.HashSet;

public class Leetcode318 
{
    public static void main(String args[])
    {
        String arr[]=new String[]{ "abcw","baz","foo","bar","xtfn","abcdef"};
        int n=arr.length;
        
        int max=0; 
        
        for(int i=0;i<n;i++)
        {
            HashSet<Character>set=new HashSet<>(); 
           for(int j=i+1;j<n;j++)
           {
               for(char c:arr[i].toCharArray())
               {
                  set.add(c);
               }
               boolean common=true;
               for(char ch:arr[j].toCharArray())
               {
                  if(set.contains(ch))
                  {
                    common=false;
                    break;
                  }
               }
               if(common==true)
           {
              max=Math.max(max,arr[i].length()*arr[j].length());
           }
           }

           
        }
        System.out.println(max);
        
    }
    
}
