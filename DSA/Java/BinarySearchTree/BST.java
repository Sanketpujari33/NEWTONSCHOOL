package DSA.Java.BinarySearchTree;

public class BST {
    static class  node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
        }
    }
    public static node insert(node root, int val){
        if(root==null){
            root=new node(val);
            return root;
        }
        if(root.data >val){
            //left subtree
            root.left=insert(root.left, val);
        }else{
            //right subtree
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(node root, int key){;
        if(root==null) return false;

        if(root.data>key)
            //left subtree
            return search(root.left,key);

         else if(root.data==key) return  true;

        else{
            //right subtree
            return search(root.right,key);
        }

    }
    public static node delete(node root, int val){
        if(root.data >val){
            root.left=delete(root.left,val);
        } else if (root.data<val) {
            root.right=delete(root.right,val);
        }
        else {
            //root==val
            //case 1
            if (root.left==null && root.right==null){
                return null;
            }
            //case 2
            if (root.left==null) {
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }
            //case 3
            node is= inorderSuccessor(root.right);
            root.data= is.data;
            delete(root.right, is.data);
        }
        return root;
    }
    public  static  node inorderSuccessor(node root){
        while (root.left !=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
//        int values[]={5,1,3,4,2,7};
        int values[]={8,5,3,1,4,6,10,11,14};
        node root=null;
        for (int i = 0; i < values.length; i++) {
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();
        if(search(root,10))
            System.out.println("Found");
        else
            System.out.println("not found");
        delete(root, 10);
        inorder(root);
    }
}
