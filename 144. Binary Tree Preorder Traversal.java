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
    public List<Integer> preorderTraversalRecursive(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrderHelper(root, list);
        return list;
    }
    void preOrderHelper(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        result.add(root.val);
        preOrderHelper(root.left, result);
        preOrderHelper(root.right, result);
    }

    // Appraoch-2 Using Stack i.e. Iterative way 
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>(); 
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            list.add(currentNode.val);
            // Push the right value in a stack and then push the left value in the stack
            if(currentNode.right != null){
                stack.push(currentNode.right);
            }

            if(currentNode.left != null){
                stack.push(currentNode.left);
            }
        }
        return list;
    }
}
