package DSA.Java.BinaryTree;

import DSA.Assignments.FunctionalProblems.TheDiceProblem;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreesVT {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public  static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static void preorder(Node root){
        if(root==null){
//            System.out.print(-1+ " ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public  static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public  static  void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public  static void leveloder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left !=null){
                    q.add(currNode.left);
                }
                if(currNode.right !=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int sumOfNode(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumOfNode(root.left);
        int rightsum=sumOfNode(root.right);
        return leftsum+rightsum+root.data;
    }
    public static int countOfNode(Node root){
        if(root==null){
            return 0;
        }
        int leftNode=countOfNode(root.left);
        int rightNode=countOfNode(root.right);
        return leftNode+rightNode+1;
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int myHeight=Math.max(leftHeight,rightHeight)+1;
        return myHeight;
    }
    public static int diameters(Node root) {
        if(root == null) {
            return 0;
        }

        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = diameters(root.left);
        int diam3 = diameters(root.right);

        return Math.max(diam1, Math.max(diam2, diam3));
    }
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht, int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter(Node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTI = diameter(root.left);
        TreeInfo rightTI = diameter(root.right);

        int myHeight = Math.max(leftTI.ht, rightTI.ht) + 1;


        int diam1 = leftTI.diam;
        int diam2 = rightTI.diam;
        int diam3 = leftTI.ht + rightTI.ht + 1;

        int myDiam = Math.max(Math.max(diam1, diam2),diam3);

        TreeInfo myInfo=new TreeInfo(myHeight, myDiam);

        return myInfo;
    }
    public static void main(String[] args) {
        int node[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(node);
//        System.out.println(root.data);
//        preorder(root);
//        inorder(root);
//        postorder(root);
//        leveloder(root);
//        System.out.print(countOfNode(root));
//        System.out.println(sumOfNode(root));
//        System.out.println(height(root));
//        System.out.println(diameters(root));
//        System.out.println(diameter(root).diam);
    }
}
