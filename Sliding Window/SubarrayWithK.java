import java.util.*;
public class SubarrayWithK 
{
    public static void main(String args[])
    {
        int arr[]=new int[]{ 1,2,1,2,3};
        int k=2;
        int n=arr.length;
        int result=0;
        for(int i=0;i<n;i++)
        {
            HashMap <Integer,Integer> hash=new HashMap<>();
            for(int j=i;j<n;j++)
            {

                if(!hash.containsKey(arr[j]))
                {
                    hash.put(arr[j],1);
                }
                else
                {
                    hash.put(arr[j],hash.get(arr[j])+1);
                }

                if(hash.size()>k)
                {
                    break;
                }
                else if(hash.size()==k)
                {
                    result++;
                }
               
            }
        }

        System.out.println(result);

    }
    
}
