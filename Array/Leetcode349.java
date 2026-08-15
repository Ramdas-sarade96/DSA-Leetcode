import java.util.HashSet;

public class Leetcode349 
{
    public static void main(String args[])
    {
        int arr1[]={ 1,2,2,1};
        int arr2[]={ 2,2};
        int n1=arr1.length;
        int n2=arr2.length;
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>result=new HashSet<>();
        for(int i=0;i<n1;i++)
        {
            set.add(arr1[i]);
        }
        for(int i=0;i<set.size();i++)
        {
            if(set.contains(arr2[i]))
            {
                result.add(arr2[i]);
            }
        }

        int ans[]=new int[result.size()];
        int j=0;
        for(int num:result)
        {
            ans[j++]=num;
        }

        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
    
}
