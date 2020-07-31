class Tree
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
       ArrayList<Integer> list = new ArrayList<>();
       if(root!=null)
            traversal(root,list);
       return list;
    }
    void traversal(Node iter , ArrayList<Integer> list){
        if(iter.left!=null)
            traversal(iter.left,list);
        list.add(iter.data);
        if(iter.right!=null)
            traversal(iter.right,list);
    }
    
    
}