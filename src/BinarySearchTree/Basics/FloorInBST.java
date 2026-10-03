package BinarySearchTree.Basics;

import BinaryTrees.TreeNode;

public class FloorInBST {
    public int floor(TreeNode root, int key){
        int floor=-1;
        while(root!=null){
            if(root.data==key){
                floor=root.data;
                return floor;
            }
            if(key>root.data){
                floor=root.data;
                root=root.right;
            }
            else{
                root=root.left;
            }

        }
        return floor;
    }
}
