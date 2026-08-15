// Rotate by k elemt 

import java.util.*;
class RotateKElement
{
    public static void main(String args[])
    {
        int arr[]=new int[]{ 1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
        int m=n-k;
        int result[]=new int[n];
        
        int j=0;
        for(int i=m;i<n;i++)
        {
            result[j++]=arr[i];
        }
        
        for(int i=0;i<m;i++)
        {
            result[j++]=arr[i];
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(result[i]);
        }

    }
}