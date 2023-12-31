package leetcode;

import java.util.ArrayList;

/**
 * Consider all the leaves of a binary tree, from left to right order,
 * the values of those leaves form a leaf value sequence.
 *
 * @author Sharaf Qeshta
 * */
public class LeafSimilarTrees
{
    public boolean leafSimilar(TreeNode root1, TreeNode root2)
    {
        ArrayList<Integer> leaves1 = new ArrayList<>();
        ArrayList<Integer> leaves2 = new ArrayList<>();

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root1);
        while(!stack1.isEmpty())
        {
            TreeNode current = stack1.pop();
            if (current.right != null)
                stack1.push(current.right);
            if (current.left != null)
                stack1.push(current.left);
            if (current.left == null && current.right == null)
                leaves1.add(current.val);
        }

        stack2.push(root2);
        while(!stack2.isEmpty())
        {
            TreeNode current = stack2.pop();
            if (current.right != null)
                stack2.push(current.right);
            if (current.left != null)
                stack2.push(current.left);
            if (current.left == null && current.right == null)
                leaves2.add(current.val);
        }

        if (leaves1.size() != leaves2.size())
            return false;
        for (int i = 0; i < leaves1.size(); i++)
            if (leaves1.get(i) != leaves2.get(i))
                return false;
        return true;
    }
}
