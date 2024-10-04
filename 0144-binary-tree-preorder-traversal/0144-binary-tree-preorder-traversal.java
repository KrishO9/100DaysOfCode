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
          public static LinkedList<Integer> preorderTraversal(TreeNode root) {
            LinkedList<Integer> list = new LinkedList<>();
            preorderr(root, list);
            return list;
        }
    
        public static void preorderr(TreeNode node, LinkedList<Integer> list) {
            if (node == null) return;
    
            list.add(node.val);
            preorderr(node.left, list);
            preorderr(node.right, list);
        }
}