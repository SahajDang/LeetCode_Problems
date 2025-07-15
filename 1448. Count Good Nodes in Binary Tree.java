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
    public int goodNodes(TreeNode root) {
        int count  = helper(root, Integer.MIN_VALUE);
        return count;
    }
    int helper(TreeNode root, int currentMax){
        // Base Case
        if(root == null) return 0;
        
        int left = helper(root.left, Math.max(root.val, currentMax));
        int right = helper(root.right, Math.max(root.val, currentMax));
        int result = left + right;
        // Count will increase at the time of stack fall, when our current Maximum value is the value, just before the root node at that point
        if(root.val >= currentMax){
            result++;
        }
        return result;
    }
}
