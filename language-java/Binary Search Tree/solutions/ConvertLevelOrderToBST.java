class GFG {
    
    public Node constructBST(int[] arr){
       Node root = new Node(arr[0]);
       for(int i=1;i<arr.length;i++)
           root =  bst(root , arr[i]);
        return root;
    }
    private Node bst(Node root  , int ele){
        if(root==null){
            root = new Node(ele);
            return root;
        }
        if(root.data<ele) root.right = bst(root.right , ele);
        else root.left = bst(root.left , ele);
        return root;
    }
}