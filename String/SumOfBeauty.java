public class SumOfBeauty 
{
    int sum=0;
    void check(String ans)
    {
        int arr[]=new int[26];
        for(int i=0;i<ans.length();i++)
        {
            arr[ans.charAt(i)-'a']++;
        }
     int max=0;
     int min=Integer.MAX_VALUE;
     for(int i=0;i<26;i++)
     {
        if(arr[i]>0)
        {

        
        if(max<arr[i])
        {
            max=arr[i];

        }
        if(min>arr[i])
        {
            min=arr[i];
        }
     }
    }
     sum=sum+(max-min);

    }
    SumOfBeauty(String s,int n)
    {
        for(int i=0;i<n;i++)
        {
            String ans="";
            for(int j=i;j<n;j++)
            {
                ans=ans+s.charAt(j);
                check(ans);

            }
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        String s="aabcb";
        int n=s.length();
        SumOfBeauty s1=new SumOfBeauty(s,n);
    }
    
}
