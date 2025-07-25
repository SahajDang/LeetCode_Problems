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
        List<Double> averages = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return averages;
        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double sum = 0;
            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();
                sum += currentNode.val;

                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
            averages.add(sum / levelSize);
        }
        return averages;
    }
}
