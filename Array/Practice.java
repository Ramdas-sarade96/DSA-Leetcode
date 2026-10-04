class Solution
{
    int cnt =0;
    int f1()
    {
      if(cnt==4)
      {
        return cnt;
      }
      System.out.println(cnt);
      cnt++;
      System.out.println(f1());

      return cnt;
    }
}


public class Practice
{
    public static void main(String args[])
    {
        Solution s = new Solution();
        s.f1();
    }
}