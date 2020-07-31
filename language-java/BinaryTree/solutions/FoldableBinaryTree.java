class Tree {
    boolean IsFoldable(Node root)
    {
        if(root == null)return true;
         mirror(root.left);
         Node  iter = root.left;
        root = root.right;
        return isSimilar(iter , root);
    }
    private void mirror(Node iter){
        if(iter==null)return ;
        Node  temp = iter.left;
        iter.left = iter.right;
        iter.right = temp;
        mirror(iter.left);
        mirror(iter.right);
    }
    private boolean isSimilar(Node iter , Node root){
        if(iter==null && root==null)return true;
        if(iter!=null && root==null)return false;
        if(iter==null && root!=null)return false;
        return isSimilar(iter.left , root.left) && 
            isSimilar(iter.right , root.right);
    }

}