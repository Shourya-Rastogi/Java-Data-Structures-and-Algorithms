package BinaryTrees.FAQs;

import BinaryTrees.TreeNode;

import java.util.*;

public class NodesAtKDistance {
    public void buildParentTrack(TreeNode root, Map<TreeNode,TreeNode> parentTrack){
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

    public List<Integer> distanceK(TreeNode root,TreeNode target,int k){
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        Map<TreeNode,TreeNode> parentTrack=new HashMap<>();
        buildParentTrack(root,parentTrack);
        Queue<TreeNode> nodesQueue=new LinkedList<>();
        Set<TreeNode> visited=new HashSet<>();
        nodesQueue.offer(target);
        visited.add(target);
        int currLevel=0;
        while(!nodesQueue.isEmpty()){
            int levelSize=nodesQueue.size();
            if(currLevel==k) break;
            currLevel++;
            for(int i=0;i<levelSize;i++){
                TreeNode node=nodesQueue.poll();
                if(node.left!=null && !visited.contains(node.left)){
                    visited.add(node.left);
                    nodesQueue.offer(node.left);
                }
                if(node.right!=null && !visited.contains(node.right)){
                    visited.add(node.right);
                    nodesQueue.offer(node.right);
                }
                TreeNode parent=parentTrack.get(node);
                if(parent!=null && !visited.contains(parent)){
                    visited.add(parent);
                    nodesQueue.offer(parent);
                }
            }
        }
        while(!nodesQueue.isEmpty()){
            TreeNode current=nodesQueue.poll();
            result.add(current.data);
        }
        return result;
    }
}
