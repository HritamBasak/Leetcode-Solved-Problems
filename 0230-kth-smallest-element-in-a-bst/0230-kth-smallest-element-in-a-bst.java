/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int res=0;
    public int c=0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);
        return res;
    }
    public void inOrder(TreeNode root,int k)
    {
        if(root==null)
        return;

        inOrder(root.left,k);
        c++;
        if(c==k)
        {
        res=root.val;
        return;
        }
        inOrder(root.right,k);
    }
}