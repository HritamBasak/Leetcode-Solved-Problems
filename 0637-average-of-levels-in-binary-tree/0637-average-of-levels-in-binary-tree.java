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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();//storing the average
        List<List<Integer>> store=new ArrayList<>();//storing the lists;
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> avg=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            avg.add(size);
            List<Integer> lst=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                lst.add(q.poll().val);
            }
            store.add(lst);
        }
        // for(int i:avg)
        // System.out.println(i);
        double sum=0;
        for(int i=0;i<store.size();i++)
        {
            sum=0;
            for(int j=0;j<store.get(i).size();j++)
            {
                sum+=store.get(i).get(j);
            }
            list.add(sum/avg.get(i));
        }
        return list;
    }
}