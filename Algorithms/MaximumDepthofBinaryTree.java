/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        else {
        int lMax = maxDepth(root.left);
        int rMax = maxDepth(root.right);
        if(lMax > rMax) 
        {
            return (lMax+1);
        }
        else {
            return (rMax+1);
        }
         
        }
    }
}