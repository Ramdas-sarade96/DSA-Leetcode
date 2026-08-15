import java.util.*;
public class DivisorsOfNumber
{
    public static void main(String args[])
    {
        int n=10;
        int b[]=new int[n];
        int j=0;
        for(int i=2;i<=10;i++)
        {
            if(n%i==0)
            {
                b[j++]=i;
            }
        }
        Arrays.sort(b,0,j);
        for(int i=0;i<j;i++)
        {
            System.out.println(b[i]);
        }
    }
}




// import java.util.*;
// public class DivisorsOfNumber 
// {
//     public static void main(String args[])
//     {
//         int n=18;
        
//         Stack<Integer>st=new Stack<>();
//         for(int i=2;i<=n;i++)
//         {
//             if(n%i==0)
//             {
//                 st.push(i);
//             }
//         }
//        Collections.sort(st,Collections.reverseOrder());
//       while(!st.isEmpty())
//         {
//             System.out.println(st.pop());
//         }
//     }
    
// }
