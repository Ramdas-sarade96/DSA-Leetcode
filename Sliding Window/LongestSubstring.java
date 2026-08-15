public class LongestSubstring 
{
    public static void main(String args[])
    {
        String s="abc123bcd";
        int n=s.length();
        int arr[]=new int[256];
        String result="";
        int left=0;
        for(int right=0;right<n;right++)
        {
            
                  arr[s.charAt(right)]++;
                
                 while(arr[s.charAt(right)]>1)
                 {
                    arr[s.charAt(left)]--;
                    left++;
                 }
                 
                     String ans=s.substring(left,right+1);
                     if(ans.length()>result.length())
                     {
                        result=ans;
                     }
                 }

            

        System.out.println(result);
    }
    
}
