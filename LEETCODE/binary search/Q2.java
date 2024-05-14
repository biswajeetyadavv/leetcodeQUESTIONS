

package binarysearch;
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}




public class Q2 {


        private long minVal = Long.MIN_VALUE;
        public boolean isValidBST(TreeNode root) {
            if (root == null) return true;
            if (!isValidBST(root.left)) return false;

            if (minVal >= root.val) return false;

            minVal = root.val;

            if (!isValidBST(root.right)) return false;

            return true;
        }

}
