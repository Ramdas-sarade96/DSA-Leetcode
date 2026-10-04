class Solution
{
     public boolean isRectangleOverlap(int[] rec1, int[] rec2) 
     {

           int width = Math.min(rec1[2], rec2[2]) - Math.max(rec1[0], rec2[0]);
           int height = Math.min(rec1[3], rec2[3]) - Math.max(rec1[1], rec2[1]);
           return width > 0 && height > 0;
          
           
     } 
}


public class Leetcode836 
{
    public static void main(String args[])
    {
             int rect1[] = new int[]{0,0,2,2};
             int rect2[] = new int[]{1,1,3,3};

             Solution s = new Solution();
             System.out.println( s.isRectangleOverlap(rect1,rect2));
    }
    
}
