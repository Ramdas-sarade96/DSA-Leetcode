public class SecondLargestNumber 
{
    public static void main(String args[])
    {
        int arr[]=new int[]{ 12,43,56,24,54};
        int n=arr.length;
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];
            }
            
        }

        System.out.println(secondLargest);
       
    }
    
}
