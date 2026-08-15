import java.util.*;


public class Leetcode350 
{
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter total Number for array 1:");
          int n1=sc.nextInt();
          int arr1[]=new int[n1];
          System.out.println("Enter The numbers:");
          for(int i=0;i<n1;i++)
          {
              arr1[i]=sc.nextInt();
          }

          System.out.println("Enter total number for array 2:");
          int n2=sc.nextInt();
          int arr2[]=new int[n2];
          System.out.println("Enter the numbers:");
          for(int i=0;i<n2;i++)
          {
            arr2[i]=sc.nextInt();
          }

         HashMap<Integer,Integer>map=new HashMap<>();
         ArrayList<Integer>list=new ArrayList<>();
         for(int i=0;i<n1;i++)
         {
            if(map.containsKey(arr1[i]))
            {
                map.put(arr1[i],map.get(arr1[i])+1);
            }
            else
            {
                map.put(arr1[i],1);
            }
         }
         for(int i=0;i<n2;i++)
         {
            if(map.containsKey(arr2[i]) && map.get(arr2[i])>0)
            {
                list.add(arr2[i]);
                map.put(arr2[i],map.get(arr2[i])-1);
            }
         }
         int ans[]=new int[list.size()];
         int j=0;

         for(int nums:list)
         {
                ans[j++]=nums;
                
         }

         for(int i=0;i<ans.length;i++)
         {
              System.out.println(ans[i]);
         }




    }
    
}
