import java.util.*;

class TreeNode
{
    int val;
    TreeNode right,left;
    TreeNode(int val)
    {
        this.val=val;
        left=right=null;  
    }
    
}

public class Postorder
{
     List<Integer> postorder(TreeNode root)
    {
        Stack<TreeNode>st=new Stack<>();
        List<Integer>ans=new ArrayList<>();
        TreeNode curr=root;
       
        while(!st.isEmpty() ||curr!=null)
        {
            
            while(curr!=null)
            {
                st.push(curr);
                curr=curr.left;
            
            }
            
           curr= st.pop();
          ans.add(curr.val);
          curr=st.pop();
          while(curr!=null)
          {
            curr=curr.right;
            
          }
        
            
           
           
        }
return ans;

    }
    public static void main(String args[])
    {
        Postorder i1=new Postorder();
        TreeNode t1[]=new TreeNode[7];
        for(int i=0;i<7;i++)
        {
            t1[i]=new TreeNode(i+1);
        }
         for(int i=0;i<7;i++)
       {
          int leftIndex=(2*i+1);
          int rightIndex=(2*i+2);
          if(leftIndex<7)
          {
                t1[i].left=t1[leftIndex];
          }
          if(rightIndex<7)
          {
                t1[i].right=t1[rightIndex];
          }
       }
       
       TreeNode root=t1[0];
       List<Integer>result=i1.postorder(root);

       System.out.println(result);
    }
    
}