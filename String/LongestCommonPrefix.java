public class LongestCommonPrefix 
{
    LongestCommonPrefix(String str[])
    {
        int n=str.length;
        String first=str[0];
        for(int i=0;i<first.length();i++)
        {
            char ch=first.charAt(i);
            for(int j=1;j<n;j++)
            {
                if(i>str[j].length() || str[j].charAt(i)!=ch)
                {
                    System.out.println(first.substring(0,i));
                    return;
                }
            }
        }
        System.out.println(first);
    }
    public static void main()
    {
        String str[]=new String[]{ "flower","flowet","flowek"};
        LongestCommonPrefix l1=new LongestCommonPrefix(str);

    }
    
}
