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
 
 /*This solution is incomplete*/
 
 
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        
        if(root.right ==null && root.left == null)
            return true;
        
        //if left but no right
        if(root.right == null && root.left != null) {
            //check if value
            if(root.left.val >= root.val)
                return false;
            else
                return true;
        }
        
        //if right but no left
        if(root.right != null && root.left == null) {
            //check value
            if(root.right.val <= root.val)
                return false;
            else
                return true;
        }
        
        int hold = root.val;
        
        //call two functions one going left and one going right
        boolean leftTF = leftt(root.left, hold, true);
        if(leftTF == false)
            return false;
        
        boolean rightTF = rightt(root.right, hold, true);
        if(rightTF == false)
            return false;
        
        
        return true;
        
    }
    
    public boolean rightt(TreeNode root, int h, boolean TF) {
        if(root == null)
            return TF;
        
        //int t = root.val;
        
        /*
        if(root.val < h) {
            TF = false;
            return TF;
        }
        */
        
        rightt(root.left, h, TF);
        rightt(root.right, h, TF);
        
        if(root.val <= h) {
            TF = false;
        }
        
        return TF;
    }
    
    public boolean leftt(TreeNode root, int h, boolean TF) {
        if(root == null)
            return TF;
        
        //int t = root.val;
        
        leftt(root.left, h, TF);
        leftt(root.right, h, TF);
        
        if(root.val >= h) {
            TF = false;
        }
        
        
        return TF;
    }
}
