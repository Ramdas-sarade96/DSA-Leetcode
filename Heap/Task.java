class Solution 
{
    public int leastInterval(char[] tasks, int n)
    
    {
        // Step 1: Count how many times each task appears (A-Z)
        int[] count = new int[26]; // 26 letters
        for (int i = 0; i < tasks.length; i++)
         {
            char task = tasks[i];
            count[task - 'A']++; // increment frequency
        }

        // Step 2: Find the maximum frequency
        int maxFrequency = 0;
        for (int i = 0; i < 26; i++) 
        {
            if (count[i] > maxFrequency)
             {
                maxFrequency = count[i];
             }
        }

        // Step 3: Count how many tasks have the maximum frequency
        int maxCount = 0;
        for (int i = 0; i < 26; i++)
         {
            if (count[i] == maxFrequency)
             {
                maxCount++;
             }
        }

        // Step 4: Calculate minimum intervals
        int minIntervals = (maxFrequency - 1) * (n + 1) + maxCount;

        // Step 5: Return the bigger of total tasks or minIntervals
        if (minIntervals > tasks.length) 
            {
               return minIntervals;
            } 
        else 
            {
                return tasks.length;
           }
    }
}




public class Task 
{
    public static void main(String args[])
    {
        char a[]=new char[]{ 'A','A','A','B','B','B'};
        int n=2;
        Solution s1=new Solution();
        System.out.println(s1.leastInterval(a,n));

    }
    
}
