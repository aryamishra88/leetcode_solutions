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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        levelOrder(list,root);
        return list;
    }
    public void levelOrder(List<List<Integer>> list,TreeNode root){
        if(root==null){
            return ;
        }
        Queue <TreeNode>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> level=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode currNode=q.remove();
            if(currNode==null){
                list.add(level);
                level=new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }
                    q.add(null);
                
            }else{
                level.add(currNode.val);
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
}