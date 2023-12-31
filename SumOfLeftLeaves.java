package leetcode;


import java.util.Stack;

/**
 * Given the root of a binary tree, return the sum of all left leaves.
 * A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
 *
 * @author Sharaf Qeshta
 * */
public class SumOfLeftLeaves
{
    public int sumOfLeftLeaves(TreeNode root)
    {
        if (root == null)
            return 0;
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty())
        {
            TreeNode current = stack.pop();
            if (current.left != null)
            {
                stack.push(current.left);
                if (current.left.right == null && current.left.left == null)
                    sum += current.left.val;
            }

            if (current.right != null)
                stack.push(current.right);
        }

        return sum;
    }
}
