package BinaryTrees.FAQs;

import BinaryTrees.TreeNode;

import java.util.*;

public class MinTimeToBurnBTFromANode {
    public void buildParentTrack(TreeNode root,Map<TreeNode,TreeNode> parentTrack){
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        parentTrack.put(root,null);
        while(!q.isEmpty()){
            TreeNode current=q.poll();
            if(current.left!=null){
                parentTrack.put(current.left,current);
                q.offer(current.left);
            }
            if(current.right!=null){
                parentTrack.put(current.right,current);
                q.offer(current.right);
            }
        }
    }
    public int minTime(TreeNode root, TreeNode target){
        if(root==null) return 0;
        Map<TreeNode,TreeNode> parentTrack=new HashMap<>();
        buildParentTrack(root,parentTrack);
        Queue<TreeNode> nodesQueue=new LinkedList<>();
        Set<TreeNode> burned=new HashSet<>();
        nodesQueue.offer(target);
        burned.add(target);
        int time=0;
        while(!nodesQueue.isEmpty()){
            int levelSize=nodesQueue.size();
            boolean spread=false;
            for(int i=0;i<levelSize;i++){
                TreeNode node=nodesQueue.poll();
                if(node.left!=null && !burned.contains(node.left)){
                    burned.add(node.left);
                    nodesQueue.offer(node.left);
                    spread=true;
                }
                if(node.right!=null && !burned.contains(node.right)){
                    burned.add(node.right);
                    nodesQueue.offer(node.right);
                    spread=true;
                }
                TreeNode parent=parentTrack.get(node);
                if(parent!=null && !burned.contains(parent)){
                    burned.add(parent);
                    nodesQueue.offer(parent);
                    spread=true;
                }
            }
            if(spread) time++;
        }
        return time;
    }
}
