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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrderHelper(root, list);
        return list;
    }
    void postOrderHelper(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        
        postOrderHelper(root.left, result);
        postOrderHelper(root.right, result);
        result.add(root.val);
    }

    // Appraoch-2 Using Stack i.e. Iterative way 
    public List<Integer> postorderTraversalIterative(TreeNode root) {
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
