class BinaryTree
{
    
    static ArrayList<Integer> preorder(Node root)
    {  
        ArrayList<Integer> pre = new ArrayList<>();
        if(root==null)return pre;
         traversal(root,pre);
         return pre;
    }
    static void traversal(Node root, ArrayList<Integer> pre){
        pre.add(root.data);
        if(root.left!=null)
            traversal(root.left , pre);
        if(root.right!=null)
            traversal(root.right,pre);
    }

}