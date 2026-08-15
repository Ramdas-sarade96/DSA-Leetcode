import java.util.*;
public class RemoveDuplicate 
{
    public static void main(String args[])
    {
        int arr[]=new int[]{ 1,2,3,3,4,5};
        int n=arr.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }

        System.out.println(set);
    }
    
}
