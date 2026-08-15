public class Leetcode345
{
    public static void main(String args[])
    {
        String s="IceCreAm";
        int n=s.length();
        char arr[]=s.toCharArray();
        char result[]=new char[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
           // System.out.println(arr[i]);
        }
        int m=n-1;
        for(int i=0;i<n;i++)
        {
            char ch=arr[i];
            if(ch=='e' || ch=='a'|| ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'
            )
            {
                result[k++]=arr[i];
            }
        }
        
     int t=k-1;
        for(int i=0;i<k/2;i++)
        {
            
            char temp2=result[i];
            result[i]=result[t];
            result[t]=temp2;
            t--;
            
        }
    System.out.println("After reversing vowels");
        for(int i=0;i<k;i++)
        {

            System.out.println(result[i]);
        }
 
        int l=0;
    for(int i=0;i<n;i++)
        {
            char ch=arr[i];
            if(ch=='e' || ch=='a'|| ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'
            )
            {
                arr[i]=result[l];
                l++;
            }
        }


   System.out.println("Answer\n\n");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }





    }
}