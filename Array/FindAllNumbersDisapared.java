import java.util.*;
public class FindAllNumbersDisapared
{
    public static void main(String args[])
    {
        int arr[]=new int[]{5,6,8,9,4,5,6,8,9};
        int n=arr.length;
        Arrays.sort(arr);
        Set<Integer>set=new HashSet<>();
        
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        ArrayList<Integer>list=new ArrayList<>(set);
        ArrayList<Integer>ans=new ArrayList<>();
        int sum=1;
        int j=0;
        for(int i=1;i<n;i++)
        {
            if(i!=list.get(j))
            {
                ans.add(i);
            }
            else
            {
                j++;
            }
        }

        System.out.println(ans);

    }
    
}
