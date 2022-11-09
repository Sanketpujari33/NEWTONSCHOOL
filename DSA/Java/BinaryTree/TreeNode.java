package DSA.Java.BinaryTree;

public class TreeNode {
    public class Node{
        int val;
        Node left;
        Node right;
        Node(){}
        Node(int val){this.val=val;}

        Node(int val,Node left, Node right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public boolean isIdentical(Node root,Node subRoot){
        if(subRoot == null && root == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val == subRoot.val){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public boolean isSubtree(Node root, Node subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(isIdentical(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {

    }
}
