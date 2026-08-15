import java.util.*;

class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val)
     {
        this.val = val;
        left = right = null;
     }
}

public class Preorder
 {

    // Preorder traversal using stack
    public static List<Integer> preorder(TreeNode root)
     {

        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty())
         {
            TreeNode curr = stack.pop();
            result.add(curr.val);

            // push right first
            if (curr.right != null)
             {
                stack.push(curr.right);
             }
            // push left
            if (curr.left != null) 
            {
                stack.push(curr.left);
            }
          }

        return result;
    }

    public static void main(String[] args)
     {

        // Create 100 nodes in a simple binary tree
        TreeNode nodes[] = new TreeNode[8];

        for (int i = 0; i < 8; i++) 
        {
            nodes[i] = new TreeNode(i + 1);
        }

        // Link nodes as a binary tree
        for (int i = 0; i < 8; i++) 
        {
            int leftIndex = 2 * i + 1;
            int rightIndex = 2 * i + 2;

            if (leftIndex < 8) 
            {
                nodes[i].left = nodes[leftIndex];
            }
            if (rightIndex < 8) 
            {
                nodes[i].right = nodes[rightIndex];
            }
         }

        TreeNode root = nodes[0]; // root is first node

        List<Integer> result = preorder(root);

        System.out.println("Preorder Traversal of 100-node Tree:");
        System.out.println(result);
    }
}
