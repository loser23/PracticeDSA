class Tree
{
    ArrayList<Integer> postOrder(Node root)
    {
       ArrayList<Integer> list = new ArrayList<>();
       if(root!=null)
        traversal(root,list);
       return list;
    }
    private void traversal(Node iter,ArrayList<Integer> list){
        if(iter.left!=null)
            traversal(iter.left , list);
        if(iter.right!=null)
            traversal(iter.right,list);
        list.add(iter.data);
    }
}
