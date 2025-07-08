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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return levelOrder(p).equals(levelOrder(q));
    }

    private List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> bigList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) return bigList;
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> smallList = new ArrayList<>();
            boolean hasNonNull = false;

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.remove();

                if (currentNode == null) {
                    smallList.add(null);
                    queue.add(null);
                    queue.add(null);
                } else {
                    smallList.add(currentNode.val);

                    if (currentNode.left != null || currentNode.right != null) {
                        hasNonNull = true;
                    }

                    queue.add(currentNode.left);
                    queue.add(currentNode.right);
                }
            }

            bigList.add(smallList);
            if (!hasNonNull && queue.stream().allMatch(e -> e == null)) {
                break;
            }
        }
        return bigList;
    }
}
