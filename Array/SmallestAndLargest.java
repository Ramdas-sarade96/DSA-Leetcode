import java.util.Arrays;
public class SmallestAndLargest 
{
    public static void main(String args[])
    {
        int arr[]=new int[]{ 42,4,34,65,34,23,87,98};
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println("Smalles element:"+""+arr[0]);
        System.out.println("Largest element:"+""+arr[n-1]);
    }

    
}
