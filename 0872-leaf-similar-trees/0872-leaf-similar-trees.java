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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        getLeaf(root1,l1);
        getLeaf(root2,l2);
        return l1.equals(l2);

    }
    public void getLeaf(TreeNode n,List<Integer> l){
        if(n==null){
            return;
        }
        if(n.left==null&&n.right==null){
            l.add(n.val);
            return;
        }
        getLeaf(n.left,l);
        getLeaf(n.right,l);
    }
}